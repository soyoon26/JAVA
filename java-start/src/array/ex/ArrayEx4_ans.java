package array.ex;
import java.util.Scanner;

public class ArrayEx4_ans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int cnt = scanner.nextInt();

        int[] numbers = new int[cnt];
        int sum = 0;
        double average;

        System.out.println(cnt + "개의 정수를 입력하세요: ");
        for (int i = 0; i < cnt; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum/cnt;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
