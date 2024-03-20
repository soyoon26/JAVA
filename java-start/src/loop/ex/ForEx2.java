package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        for (int num = 2, cnt = 1;cnt <= 10 ;num+=2,cnt++) { //사실 한 눈에 보기 어려움, cnt만 안에 넣어주는 게 낫다. 조건은 cnt에 관한 것
            System.out.println(num);
        }
    }
}
