package method;

public class MathodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number); 형이 맞지 않음, 컴파일 오류
        printNumber((int)number); // 명시적 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
