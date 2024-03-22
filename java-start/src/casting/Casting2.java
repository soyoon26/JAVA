package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;
        
        // intValue = doubleValue; //큰 것을 작은 것에 넣기 -> 컴파일 오류 발생 , 0.5가 사라짐
        intValue = (int) doubleValue; // 명시적 형변환, 손실될 수도 있다
        System.out.println(intValue); // 1 출력, (int) 1.5로 읽기

        System.out.println((int) 10.5); // 10 출력
    }
}
