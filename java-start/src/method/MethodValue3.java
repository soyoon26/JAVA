package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;  //한 번에 변수명 바꾸기 shift + f6
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1); //호출 후에도 이 값은 초기값과 같음, 복사된 값이 홈수에 호출되었지 이 값이 호출되지는 않음
    }

    public static int changeNumber(int num2) { //복사된 값이 전달됨
        num2 = num2 * 2;
        return num2; // 10을 return함
    }
}
