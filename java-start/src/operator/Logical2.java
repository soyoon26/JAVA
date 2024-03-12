package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20; //(a > 10) && ( a < 20), a와 숫자의 위치는 바뀌어도 됨
        System.out.println("result = " + result);
    }
}
