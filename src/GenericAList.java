// Generic Array-based List (AList)
public class GenericAList<T> {
    AList booksList = new AList();
    private T[] array;
    private int maxSize;
    private int size;

    public GenericAList() {
        maxSize = 10; // Initial capacity
        array = (T[]) new Object[maxSize];
        size = 0;
    }

    public void listAdd(T p) {
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
        T[] newArray = (T[]) new Object[maxSize];
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