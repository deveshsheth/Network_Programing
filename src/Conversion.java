import java.util.Scanner;

public class Conversion {

    void DecimalToBinary(int num){
        int rem;
        String binary="";
        System.out.println("The Number is : "+num);

            while(num!=0){
                rem = num%2;
                binary = rem + binary;
                num = num/2;
            }
            System.out.println("Binary to Decimal Number is : "+ binary);

        }

        void DecimalToOctal(int num){

            int i=1, octal=0, rem;
            System.out.println("The Number is : "+num);

            while(num!=0){
                rem = num%8;
                octal = octal+ i*rem;
                num = num/8;
                i=i*10;
            }
            System.out.println("decimal to octal number is : "+ octal);


        }

    void DecimalToHexadecimal(int num){

        int  rem;
        String hexa="";
        System.out.println("The Number is : "+num);
         char arr[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num!=0){
            rem = num%16;
            hexa = hexa + arr[rem];
            num = num/16;

        }
        System.out.println("decimal to HexaDecimal number is : "+ hexa);


    }


    public static void main(String[] args) {
        Conversion c = new Conversion();
        int num,choice = 0;
        Scanner sc = new Scanner(System.in);
        String check;
        do
        {
            System.out.println("Welcome to Conversion System");
            System.out.println("---------------------------------");
            System.out.println("2.] Decimal to Binary");
            System.out.println("8.] Decimal to Octal");
            System.out.println("16.] Decimal to Hexadecimal");
            System.out.println("0.] Exit");
            System.out.println("----------------------------------");
            System.out.println("Enter a Choice You want : ");
            choice = sc.nextInt();
            switch (choice) {
                case 2:
                    System.out.println("Enter a Number : ");
                    num = sc.nextInt();
                    c.DecimalToBinary(num);
                    break;


                case 8:
                    System.out.println("Enter a Number : ");
                    num = sc.nextInt();
                    c.DecimalToOctal(num);
                    break;

                case 16:
                    System.out.println("Enter a Number : ");
                    num = sc.nextInt();
                    c.DecimalToHexadecimal(num);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Please Enter Correct Choice.....");
            }

            System.out.println("Do You want to continue(y/n)? ");
            check = sc.next();
        }while(check.equals("y"));

    }
}
