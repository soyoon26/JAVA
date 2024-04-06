package array.ex;
import java.util.Scanner;
public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int cnt = scanner.nextInt();
        int[] numbers = new int[cnt];
        int minNum, maxNum;

        System.out.println(cnt + "개의 정수를 입력하세요:");
        for (int i = 0; i < cnt; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNum = maxNum = numbers[0];
        for (int i = 1; i < cnt; i++) {
            if (minNum > numbers[i]) {
                minNum = numbers[i];
            }
            if (maxNum < numbers[i]) {
                maxNum = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + maxNum);
        System.out.println("가장 큰 정수: " + minNum);
    }
}
