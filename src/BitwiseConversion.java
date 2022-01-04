import java.util.Scanner;

public class BitwiseConversion {

    public static void main(String[] args) {
        int decNum, rem, result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Decimal number : ");
        decNum = sc.nextInt();

        for(rem = 7; rem >=0; rem--){
            result = decNum >> rem;

            if ((result & 1) > 0) { //0101
                System.out.print("1");
            }
            else{
                System.out.print("0");  //00000101
            }
        }
        System.out.println("");
    }
}
