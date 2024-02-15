class SLNode {
    public Book data;
    public SLNode next;

    public SLNode(Book data) {
        this.data = data;
        this.next = null;
    }
}

public class SLList {
    private SLNode head;

    public SLList() {
        head = null;
    }

    public void listAdd(Book p) {
        SLNode newNode = new SLNode(p);
        if (head == null) {
            head = newNode;
        } else {
            SLNode temp = head;
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
        SLNode temp = head;
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
        SLNode current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}