public class Main {
    public static void main(String[] args) {
//        GBList<Integer> list = new GBArrayList<>();
//        System.out.println(list.size());
//        list.add(33);
//        list.add(44);
//        list.add(90);
//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        list.update(1, 111);
//        System.out.println(list.get(1));
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);

        GBLinkedList<Integer> list = new GBLinkedList<>();
        System.out.println(list.size());
        list.addLast(2);
        list.addLast(3);
        System.out.println(list.size());
        list.addFirst(11);
        System.out.println(list.size());
        System.out.println(list.getElement(0));
        System.out.println(list.getElement(1));
        System.out.println(list.getElement(2));

        for (Integer item : list) {
            System.out.print(item + " ");
        }
    }
}
