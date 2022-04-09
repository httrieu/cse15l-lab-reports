/**
 * TODO: Add your file header
 * Name:
 * ID:
 * Email:
 * Sources used: Put "None" if you did not have any external help
 * Some example of sources used would be Tutors, Zybooks, and Lecture Slides
 * 
 * 2-4 sentence file description here
 */

 /**
  * TODO: Add your class header for MyArrayList
  */

 /**
 * TODO: Add your implementation of MyArrayList here
 * 
 * DON'T FORGET TO ALSO ADD METHOD HEADERS FOR ALL OF YOUR METHODS!
 */

 // Hint: the 'capacity' (length of data array) is not the same as the 'size'
 // Size is the number of elements in the ArrayList, i.e., the number of valid
 // elements in the array

public class MyArrayList<E> implements MyList<E>{
    Object[] data;
    int size;

    public MyArrayList() {
        data = new Object[5];
        size = 0;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Invalid InitialCapacity!");
        }
        data = new Object[initialCapacity];
    }

    public MyArrayList (E[] arr) {
        if (arr == null) {
            data = new Object[5];
            size = 0;
        }
        else {
            size = 0;
            data = new Object[arr.length];
            for (int i = 0; i < data.length; ++i) {
                data[i] = arr[i];
                size++;
            }
        }
    }

    public void expandCapacity(int requiredCapacity) {
        if (requiredCapacity < data.length) {
            throw new IllegalArgumentException("requiredCapacity too large!");
        }
        else if (data.length == 0) {
            data = new Object[5];
            if (data.length < requiredCapacity) {
                data = new Object[requiredCapacity];
            }
        }
        else if (data.length < requiredCapacity) {
            if (2*data.length < requiredCapacity) {
                Object[] tempData = new Object[requiredCapacity];
                for (int i = 0; i < data.length; i++) {
                    tempData[i] = data[i];
                }
                data = tempData;
            }
            else {
                Object[] tempData = new Object[2*data.length];
                for (int i = 0; i < data.length; i++) {
                    tempData[i] = data[i];
                }
                data = tempData;
            }
        }
    }

    public int getCapacity() {
        return data.length;
    }

    public void insert(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of Bounds!");
        }
        else if (data.length == 0 && index == 0) {
            data = new Object[1];
            data[0] = element;
            size++;            
        }
        else if (size + 1 > data.length) {
            expandCapacity(size+1);
            Object[] tempData = new Object[data.length];
            tempData[index] = element;
            for (int i = 0; i < index; ++i) {
                // HERES THE ERROR
                tempData[i] = data[i];
            }
            for (int i = 0; i + index < size; ++i) {
                tempData[index + i + 1] = data[index + i];
            }
            data = tempData;
            size++;
        }
        else {
            Object[] tempData = new Object[data.length];
            tempData[index] = element;
            for (int i = 0; i < index; ++i) {
                // HERES THE ERROR
                tempData[i] = data[i];
            }
            for (int i = 0; i + index < size; ++i) {
                tempData[index + i + 1] = data[index + i];
            }
            data = tempData;
            size++;
        }
    }

    public void append(E element) {
        if (size + 1 > data.length) {
            expandCapacity(size+1);
            data[size] = element;
            size++;
        }
        else if (size > 0) {
            data[size] = element;
            size++;
        }
        else if (size == 0) {
            if (data.length == 0) {
                data = new Object[1];
                data[0] = element;
                size++;
            }
            else {
                data[0] = element;
                size++;
            }
        }
    }

    public void prepend(E element) {
        if (size + 1 > data.length) {
            expandCapacity(size+1);
            Object[] tempData = new Object[data.length];
            tempData[0] = element;
            for (int i = 0; i < size; ++i) {
                tempData[i+1] = data[i];
            }
            data = tempData;
            size++;
        }
        else if (size > 0) {
            Object[] tempData = new Object[data.length];
            tempData[0] = element;
            for (int i = 0; i < size; ++i) {
                tempData[i+1] = data[i];
            }
            data = tempData;
            size++;
        }
        else {
            if (data.length == 0) {
                data = new Object[1];
                data[0] = element;
                size++;
            }
            else {
                data[0] = element;
                size++;
            }
        }
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        else {
            return (E)data[index];
        }
    }

    public E set(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        else {
            data[index] = element;
            return (E)data;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        else {
            Object[] tempData = new Object[data.length];
            for (int i = 0; i < size; ++i) {
                if (i == size - 1) {
                    break;
                }
                else if (i == index) {
                    tempData[i] = data[i + 1];
                }
                else {
                    tempData[i] = data[i];
                } 
            }
            data = tempData;
            size--;
            return (E)data; 
        }
    }

    public int size() {
        return size;
    }
}