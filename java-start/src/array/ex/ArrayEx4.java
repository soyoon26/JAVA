package array.ex;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int cnt = scanner.nextInt();

        System.out.println(cnt + "개의 정수를 입력하세요:");
        int sum = 0;
        for (int i = 0; i < cnt; i++){
            int num = scanner.nextInt();
            sum += num;
        }

        double average = sum/cnt;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);


    }
}
