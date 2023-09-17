package CA;

import java.util.Iterator;

class TestArrayImplementation {

    public abstract class MyAbstractList<E> implements MyList<E> {

        protected int size = 0;

        protected MyAbstractList(E[] objects) { // isntantiating from an Array
            for(int i = 0; i < objects.length; i++) {
                add(objects[i]);
            }
        }

        public void add(E e) {
            add(size, e); // implemented in the concrete class
        } 

        public boolean isEmpty() {
            return size == 0; //return true if size = o
        }

        public int size() {
            return size;
        }

        public boolean remove(E e) {
            if(indexOf(e) >= 0) {
                remove(indexOf(e));
                return true;
            } else {
                return false;
            }
        }


    }


    public interface MyList<E> extends java.lang.Iterable<E> { // make sure the list is Iterable [This is the Concrete Class] // Generic List
        
        // adds a new element at the end of the list
        public void add(E e);

        // adds a new element at the specified index
        public void add(int index, E e);

        // clears the list
        public void clear();

        // returns true if the list contains the specified element
        public boolean contains(E e);

        // returns the element at the specified index
        public E get(int index);

        // returns the index of a specified element
        public int indexOf(E e);

        // returns true if the list is empty
        public boolean isEmpty();

        // returns the last index of a specified element
        public int lastIndexOf(E e);

        // removes the specified element
        public boolean remove(E e);

        // removes the element at the specified index
        public E remove(int index);

    }

        public class MyArrayList<E> extends MyAbstractList<E> {

            public static final int INITIAL_CAPACITY = 16;
            private E[] data = (E[]) new Object[INITIAL_CAPACITY];

            public MyArrayList() {        
            }

            public MyArrayList(E[] objects) {
                for(int i = 0; i <objects.length; i++) {
                    add(objects[i]);
                }
            }

            @Override
            public void add(int index, E e) {
                checkIndex(index);

                ensureCapacity();

                // moving elements to the right

                for(int i = size-1; i >= index; i--) {
                    data[i+1] = data[i];
                }

                data[index] = e;

                size++;

            }

            private void ensureCapacity() { // the method that doubles the capacity
                if (size >= data.length) {
                    E[] newData = (E[]) (new Object[size * 2 + 1]);
                    System.arraycopy(data, 0, newData, 0, size);
                    data = newData;
                }
            }
            
            @Override
            public void clear() {
                data = (E[]) new Object[INITIAL_CAPACITY];
                size = 0;

            }

            @Override
            public boolean contains(E e) {
                for (int i = 0; i < size; i++) {
                    if(e.equals(data[i])) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public E get(int index) {

                checkIndex(index);
                return data[index];

            }

            private void checkIndex(int index) {
                if(index < 0 || index >= size) {
                    throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
            }

            @Override
            public int indexOf(E e) {
                for (int i = 0; i < size; i++) {
                    if (e.equals(data[i])) {
                        return i;
                    }
                }
                return -1;
            }

            @Override
            public int lastIndexOf(E e) {
                for (int i = size - 1; i>=0; i--) {
                    if(e.equals(data[i])) {
                        return i;
                    }
                }
                return -1;

            }

            public E set(int index, E e) {
                checkIndex(index);
                E old = data[index];
                data[index] = e;
                return old;
            }

            @Override
            public E remove(int index) {
                checkIndex(index);

                E e = data[index];

                for(int j = index; j < size-1; j++) {
                    data[j] = data[j+1];
                }

                data[size-1] = null;

                size--;

                return e;
            }

            @Override
            public Iterator<E> iterator() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'iterator'");
            }
        
    }


}
