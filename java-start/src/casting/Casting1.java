package casting;

public class Casting1 {
    public static void main(String[] args) {
        //자동형 변환, 묵시적 변환

        int intValue = 10;
        long longValue; //long이 int보다 더 큰 범위
        double doubleValue;

        longValue = intValue; //int->long
        System.out.println("longValue = "+longValue);

        doubleValue = intValue; //int->double
        //doubleValue = (double) intValue; //int->double
        System.out.println("doubleValue = "+doubleValue);

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue2 = "+doubleValue);
    }
}
