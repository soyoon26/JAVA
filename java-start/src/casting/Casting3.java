package casting;

public class Casting3 {
    public static void main(String[] args) {
        //작은 숫자가 표현할 수 있는 범위를 넘어간다면?
        long maxIntValue = 2147483647L; //int 최고값, L을 붙이지 않는다면 int로 형변환 된거임
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과), L을 붙이지 않으면 오류
        int intValue = 0;
        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting= "+intValue);

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting= "+intValue); //-2147483648 출력, int의 가장 작은 범위부터 다시 시작함 : 오버플로우

    }
}
