package scanner.ex;
import java.util.Scanner;
public class ScannerWhileEx1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("이름을 입력하세요. (종료를 입력하면 종료): ");
            String name = scanner.nextLine(); // \n이 남아있음

            if (name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: "); //ctrl + shift 자동완성
            int age = scanner.nextInt(); //숫자만 가져감
            scanner.nextLine(); //enter를 가져감

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
