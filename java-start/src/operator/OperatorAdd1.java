package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;
        a = a+1;
        System.out.println("a = " + a); // 1
        a = a + 1;
        System.out.println("a = " + a);
        
        //증감 연산자
        ++a;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
        --a;
        System.out.println("a = " + a);
        //prefix, postfix 둘 다 가능 
        //앞은 증가하고 연산, 뒤는 연산하고 증가
    }
}
