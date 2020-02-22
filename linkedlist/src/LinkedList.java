/**
 * 链表
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/2/22 10:33
 */
public class LinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    ", next=" + next +
                    '}';
        }
    }

    private Node head; //链表头部
    private int size; //链表大小

    public LinkedList() {
        head = null;
        size = 0;
    }

    //获取链表中的元素个数
    public int getSize() {
        return this.size;
    }

    //返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //在链表头部插入元素
    public void addFirst(E e) {
        Node node = new Node(e);
        node.next = head;
        head = node;
        // Node  node = new Node(e, head);
        size++;
    }

    //在链表中间插入元素
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed, Illegal index");
        }
        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
            //prev.next = new Node(e, prev.next);
            size++;
        }
    }

    // 在链表末尾添加新的元素e
    public void addLast(E e){
        add(size, e);
    }




}
