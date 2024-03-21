package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp= " + temp);
        } //m의 생존 끝, if블럭안에서만 생존 가능
        // System.out.println(temp);
        System.out.println("m = " + m);
    }
}
//for문은 for문 안에서 선언가능하지만(안에서만 사용한다는 게 명확함) while은 안에서 선언한다면 계속 생성됨(main전체가 스코프가 됨)
