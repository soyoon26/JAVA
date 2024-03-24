package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 =  3 / 2; //1.5
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); //1.0 , int로 나온 1을 double에 대입

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); //1.5
        
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); // 1.5
        
        int a = 3;
        int b = 2;
        double result = (double) a / b; //a를 double형으로 casting
        System.out.println("result = " + result);
        
        //서로 다른 타입의 계산은 큰 범위의 자동 형변환
        //int와 long은 long, int와 double은 double로
    }
}
