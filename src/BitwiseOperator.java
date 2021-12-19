import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        int num1,num2,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number : ");
        num1 = sc.nextInt();
        System.out.println("Enter a Second Number : ");
        num2 = sc.nextInt();

        result = num1 | num2;
        System.out.println("OR Operation : "+result);

        result = num1 & num2;
        System.out.println("AND Operation : "+result);

        result = num1 ^ num2;
        System.out.println("XOR Operation : "+result);

        result = num1 << 3;
        System.out.println("Left Swift Operation : "+result);

        result = num1 >> 2;
        System.out.println("Right Swift Operation : "+result);

    }
}
