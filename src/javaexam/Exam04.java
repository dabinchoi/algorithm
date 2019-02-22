package javaexam;

public class Exam04 {
    public static void main(String[] args) {
        Box box = new Box();
        Item item1 = new Item();
        item1.x = 100;
        item1.y = 200;
        box.add(item1);
        Item i = box.get();
        System.out.println(i.x);
        System.out.println(i.y);
    }
}
