/**
 * 自制数组
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/2/17 11:10
 */
public class Array {
    private int[] data; //数组
    private int size; //数组大小

    /**
     * 构造函数，传入数组的容量capacity构造Array
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
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

    public int getCapacity() {
        return data.length;
    }
}
