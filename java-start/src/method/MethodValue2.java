package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, num1: " + number); //호출 후에도 이 값은 초기값과 같음, 복사된 값이 홈수에 호출되었지 이 값이 호출되지는 않음
    }

    public static void changeNumber(int number) { //복사된 값이 전달됨
        System.out.println("2. changeNumber 변경 전, num2: " + number);
        number = number * 2;
        System.out.println("2. changenumber 변경 후, num2: " + number);
    }
}
