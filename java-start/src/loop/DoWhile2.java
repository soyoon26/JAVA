package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3); //먼저 하고 조건을 검사, 최초 블럭을 꼭 실행해야 하는 경우
    }
}
