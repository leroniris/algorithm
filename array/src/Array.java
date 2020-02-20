/**
 * 自制数组
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/2/17 11:10
 */
public class Array<E> {
    private E[] data; //数组
    private int size; //数组大小

    /**
     * 构造函数，传入数组的容量capacity构造Array
     *
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //无参构造函数，默认数组的容量为capacity=10
    public Array() {
        this(10);
    }

    //获取数组大小
    public int getSize() {
        return this.size;
    }

    //获取数组容量
    public int getCapacity() {
        return data.length;
    }

    //获取数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //向数组首部添加元素
    public void addFirst(E e) {
        add(0, e);
    }

    //向数组最后中添加元素
    public void addLast(E e) {
        add(size, e);
    }

    //向数组中指定位置添加一个元素
    public void add(int index, E e) {
        if (size == data.length) {
            resize(2 * data.length);
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed, Require index >= 0 and index < size");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newArr = (E[]) new Object[newCapacity];
        for(int i = 0; i < size; i++) {
            newArr[i] = data[i];
        }
        data = newArr;
    }

    // 获取index索引位置的元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    //修改Index位置的元素
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        data[index] = e;
    }

    //查找数组中是否有元素e
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //查找并返回索引位置
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //删除元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        if(size == data.length / 2) {
            resize(data.length / 2);
        }
        return ret;
    }

    //删除首部元素
    public E removeFirst() {
        return remove(0);
    }

    //删除尾部元素
    public E removeLast() {
        return remove(size - 1);
    }

    //从数组中删除元素e
    public void removerElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return String.valueOf(res);
    }


}
