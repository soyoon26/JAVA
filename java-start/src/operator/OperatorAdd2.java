package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고, 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);
        //ctrl r 은 이전 연산 다시 실행(맥북)
        
        //후위 증감 연산자 사용 예
        a = 1; 
        b = 0;
        
        b = a++; //a의 현재값을 b에 먼저 대입하고, 그 후 a값 증가
        System.out.println("a = " + a + ", b = " + b);

        //자기만 쓰는 건 전위 증감과 후위 증감은 다르지 않음
    }
}
