package LottoBall;

import java.util.List;

public class LottoExam {
    public static void main(String[] args) {
        LottoBallFactory factory = new KoreaLottoBallFactory();
        List<LottoBall> balls = factory.createLottoBalls();

        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.setLottoBalls(balls);
        lottoMachine.mix();
        List<LottoBall> result = lottoMachine.getLottoBalls(6);

        for(LottoBall ball : result){
            System.out.println(ball.getNumber());
        }
    }
}
