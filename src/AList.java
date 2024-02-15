//Calvin Tran
//2/13/2024
//Dr. Esteban
//Intro to Algorithms 9:30AM
public class AList {
    int maxSize;
    Book[] array;
    int size;

    // constructor
    public AList() {
        maxSize = 10; // initial capacity
        size = 0;
        array = new Book[maxSize];
    }

    public void listAdd(Book p) {
        if (size == maxSize) {
            resize();
        }
        array[size++] = p;
    }

    public void listRemove(int pos) {
        if (pos < 0 || pos >= size) {
            return; // Invalid position
        }
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    private void resize() {
        maxSize *= 2;
        Book[] newArray = new Book[maxSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
