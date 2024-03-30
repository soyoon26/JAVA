package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언, 배열이라는 걸 담을 수 있음
        students = new int[5]; // int가 5개 있는 그릇을 만듦, int형 변수가 만들어짐
        //내부값 자동 초기화: 숫자는 0, boolean은 false, String은 null
        //실행될 때 크기가 정해짐 - 참조로 이용, 입력에 따라 달라지기 때문

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("학생1 점수: " + students[0]); //참조값으로 실제 위치값에 접근
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
        
        //int나 double, boolean같이 값을 직접 넣는다면 기본형
        //배열과 같이 참조(주소)를 저장하는 타입은 참조형
    }
}
