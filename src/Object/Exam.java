package Object;

public class Exam {
    public static void main(String[] args) {
    ObjectBox objectBox = new ObjectBox();

    Double int1 = new Double(50.5);
    objectBox.set(int1);
    Integer int2 = (Integer)objectBox.get();
        System.out.println(int2.toString());
    }
}
