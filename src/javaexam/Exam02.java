package javaexam;
/*
3개월간의 수업내용을 복습해보기로 하였다.
 */
public class Exam02 {
    public static void main(String[] args) {
//Car는 추상클래스이기 떄문에 인스턴스로 만들수가 없다.

    Bus bus =new Bus();
    bus.run();
    bus.안내방송();

    Car bus2 = new Bus();
    bus2.run();

    Car s2 = new SportsCar();
    s2.run();
}

}