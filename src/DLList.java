class DLNode {
    public Book data;
    public DLNode next;
    public DLNode prev;

    public DLNode(Book data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLList {
    private DLNode head;

    public DLList() {
        head = null;
    }

    public void listAdd(Book p) {
        DLNode newNode = new DLNode(p);
        if (head == null) {
            head = newNode;
        } else {
            DLNode temp = head;
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
        DLNode current = head;
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
        DLNode current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}