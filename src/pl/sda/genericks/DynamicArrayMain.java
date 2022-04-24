package pl.sda.genericks;

public class DynamicArrayMain {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.print();
    }
}
