package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        //2x3 2차원 배열 만들기
        int[][] arr = new int[2][3]; //행2, 열3
        arr[0][0] = 1; //0행 0열
        arr[0][1] = 2; //0행 0열
        arr[0][2] = 3; //0행 0열
        arr[1][0] = 4; //0행 0열
        arr[1][1] = 5; //0행 0열
        arr[1][2] = 6; //0행 0열

        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.print(arr[0][2] + " ");
        System.out.println();
        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");
    }
}
