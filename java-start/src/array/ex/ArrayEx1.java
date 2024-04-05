package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        int[] students = {90,80,70,60,50}; //ctrl + x: 삭제
        int total = 0;
        for (int student : students) {
            total+=student;
        }
        double average = total/students.length; //alt + enter 향상된 구문으로 바꿔줌
        //int total = student1 + student2 + student3 + student4 + student5;
        //double average = (double) total/5;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
