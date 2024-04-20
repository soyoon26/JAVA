package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2)); // 첫 번째가 없으면 두 번째로 들어감, 1순위 : 가장 맞는 메서드
        System.out.println("2: " + add(1.2,1.5));
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a + b;
    }
}
