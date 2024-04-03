package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        System.out.println(students.length); // 조회만 할 수 있음, 대입은 할 수 없음

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("학생 " + (i + 1) + " 점수: " + students[i]); // 괄호없이하면 문자가 되어버림
        }
    }
}
