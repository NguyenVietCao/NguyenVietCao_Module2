package ss10;

import java.io.OptionalDataException;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return DEFAULT_CAPACITY;
    }

    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public void add(int index, E element) {

        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        return (E) elements[index];
    }

    public int size() {
        return this.size;
    }

    public E clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = size;
        return (E) v;
    }

    boolean contains(E o) {
        return true;
    }

    int indexOf(E o) {
        return 1;
    }

    boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    private void ensureCapacity(int miniCapacity) {
        if (miniCapacity == 0) {
            int newSize = this.elements.length + miniCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("miniCapacity: " + miniCapacity);
        }
    }

    public E get(int i) {
        return null;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public int IndexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

}
