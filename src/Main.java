public class Main {
    public static void main(String[] args) {
        // creating a generic array-based list to test
        GenericAList<Book> genericAList = new GenericAList<>();

        // books!
        Book book1 = new Book("wireless networks", "Anke Berr", 14.99);
        Book book2 = new Book("creme waffles for dummies", "Piro Lane", 24.79);

        // Adding specific Book instances to the list
        genericAList.listAdd(book1);
        genericAList.listAdd(book1);
        genericAList.listAdd(book2);
        genericAList.listAdd(book1);
        // Displaying the array-based list
        System.out.println("Array-based List:");
        System.out.println(genericAList);

        // Removing an element from the array-based list
        genericAList.listRemove(1);

        // Displaying the array-based list after removal
        System.out.println("Array-based List after removal:");
        System.out.println(genericAList);

        // Creating a generic singly linked list
        GenericSLList<Book> genericSLList = new GenericSLList<>();
        genericSLList.listAdd(book1);
        genericSLList.listAdd(book1);
        genericSLList.listAdd(book2);
        genericSLList.listAdd(book1);
        // Displaying the singly linked list
        System.out.println("Singly Linked List:");
        System.out.println(genericSLList);

        // Removing an element from the singly linked list
        genericSLList.listRemove(1);

        // Displaying the singly linked list after removal
        System.out.println("Singly Linked List after removal:");
        System.out.println(genericSLList);

        // Creating a generic doubly linked list
        GenericDLList<Book> genericDLList = new GenericDLList<>();

        // Adding objects to the doubly linked list
        genericDLList.listAdd(book1);
        genericDLList.listAdd(book1);
        genericDLList.listAdd(book2);
        genericDLList.listAdd(book1);

        // Displaying the doubly linked list
        System.out.println("Doubly Linked List:");
        System.out.println(genericDLList);

        // Removing an element from the doubly linked list
        genericDLList.listRemove(1);

        // Displaying the doubly linked list after removal
        System.out.println("Doubly Linked List after removal:");
        System.out.println(genericDLList);
    }
}


