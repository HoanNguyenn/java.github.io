public class App {
    public static void main(String[] args) throws Exception {
        MyArrayList <Integer> arrayList1 = new MyArrayList<Integer>();
        arrayList1.add(3);
        System.out.println(arrayList1.getT());

        MyArrayList <Float> arrayList2 = new MyArrayList<Float>();
        arrayList2.add(3.5f);
        System.out.println(arrayList2.getT());

        MyArrayList <Boolean> arrayList3 = new MyArrayList<Boolean>();
        arrayList3.add(true);
        System.out.println(arrayList3.getT());

        MyArrayList <String> arrayList4 = new MyArrayList<String>();
        arrayList4.add("Blackpink");
        System.out.println(arrayList4.getT());

    }
}
