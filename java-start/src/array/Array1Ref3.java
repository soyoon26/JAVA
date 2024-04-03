package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50, 40, 30, 20, 10}; // 생성을 함과 동시에 값을 넣어둘 수 있음, 배열 생성과 초기화
        // ctrl + x: 지우기
        System.out.println(students.length); // 조회만 할 수 있음, 대입은 할 수 없음
      
        //변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("학생 " + (i + 1) + " 점수: " + students[i]); // 괄호없이하면 문자가 되어버림
        }
    }
}
