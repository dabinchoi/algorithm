package Exception;

public class Calc {
    public int divide(int i, int k) throws ArithmeticException {
        int value = 0;
        try {
            value = i / k;
        }catch(ArithmeticException ae){
            throw new MyException(ae);
        }
        return value;
    }
}
