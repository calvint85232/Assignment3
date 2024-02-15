// Generic Singly Linked List (SLList)
class GenericSLNode<T> {
    public T data;
    public GenericSLNode<T> next;

    public GenericSLNode(T data) {
        this.data = data;
        this.next = null;
    }
}

class GenericSLList<T> {
    private GenericSLNode<T> head;

    public GenericSLList() {
        head = null;
    }

    public void listAdd(T p) {
        GenericSLNode<T> newNode = new GenericSLNode<T>(p);
        if (head == null) {
            head = newNode;
        } else {
            GenericSLNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void listRemove(int pos) {
        if (pos < 0 || head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        GenericSLNode<T> temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        GenericSLNode<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}