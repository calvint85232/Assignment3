// Generic Doubly Linked List (DLList)
class GenericDLNode<T> {
    public T data;
    public GenericDLNode<T> next;
    public GenericDLNode<T> prev;

    public GenericDLNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class GenericDLList<T> {
    private GenericDLNode<T> head;

    public GenericDLList() {
        head = null;
    }

    public void listAdd(T p) {
        GenericDLNode<T> newNode = new GenericDLNode<T>(p);
        if (head == null) {
            head = newNode;
        } else {
            GenericDLNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void listRemove(int pos) {
        if (pos < 0 || head == null) {
            return;
        }
        GenericDLNode<T> current = head;
        for (int i = 0; current != null && i < pos; i++) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        GenericDLNode<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}