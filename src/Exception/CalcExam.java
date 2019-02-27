package Exception;

public class CalcExam {
    public static void main(String[] args) {
        Calc calc = new Calc();
        try {
            int value = calc.divide(4, 0);
            System.out.println(value);
        } catch (MyException ae) {
            System.out.println("내가 생성한 Exception");
        }
    }

}