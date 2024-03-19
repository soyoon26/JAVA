package loop;

public class Continue2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;
        //sum = 1+2+3
        for (int i = 1; i <= endNum; i++){ //바로 판단 가능 - 조건식 활용
            sum = sum + i;
            System.out.println("i= "+ i +"sum=" + sum);
        }
    }
}
