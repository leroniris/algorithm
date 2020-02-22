public class Main {

    public static void main(String[] args) {

        DummyLinkedList<Integer> linkedList = new DummyLinkedList<>();
        for(int i = 0 ; i < 5 ; i ++){
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.add(2, 666);
        System.out.println(linkedList);
    }
}
