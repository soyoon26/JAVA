package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; //main블럭이 종료될 때까지 메모리에 유지가 됨
        if (m > 0) {
            temp = m * 2; //안에서만 사용할거니까 main에서 선언할 필요는 없다.
            //비효율적 메모리 사용, 코드 복잡성 증가
            System.out.println("temp= " + temp);
        } //if가 끝나도 어디서나 temp에 접근할 수 있음, 스코프가 불필요하게 넓음
        System.out.println("m = " + m);
    }
}
