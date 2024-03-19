package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1;;i++){
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; //조건에 넣지않고 break로 해결
            }
        }
        //i = 10 -for문 안에서만 사용 가능
    }
}
