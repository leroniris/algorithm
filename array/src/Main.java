/**
 * 主函数
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/2/18 14:18
 */
public class Main {
    public static void main(String[] args) {
        Array arr = new Array();
        for(int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }
}
