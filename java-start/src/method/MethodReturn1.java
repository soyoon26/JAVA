package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true; // else일때의 값도 줘야 함
        } else {
            return false; // 항상 return을 해야 함
        }
    }
}
