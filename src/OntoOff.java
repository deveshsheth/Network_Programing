import java.util.Scanner;

public class OntoOff {

    public static void main(String[] args) {
        int decNum, rem, result, mask;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Decimal number : ");
        decNum = sc.nextInt();

        for(rem = 7; rem >=0; rem--){
            result = decNum >> rem;

            if ((result & 0) > 1) {
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println("");
    }
}
