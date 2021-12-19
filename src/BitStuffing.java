import java.util.Scanner;

public class BitStuffing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String awnser="";
        String output="",num,check;
        int count=0;
        do {
            System.out.println("Enter a Binary Number : ");
            num = sc.next();

            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) != '1' && num.charAt(i) != '0') {
                    System.out.println("Enter a Correct Binary Number....");

                } else {
                    //System.out.println("Binary Number is : " + num);
                    if (num.charAt(i) == '1') {
                        count++;
                        output = output + num.charAt(i);
                    } else {
                        count = 0;
                        output = output + num.charAt(i);
                    }
                    if (count == 5) {
                        output = output + '0';
                        count = 0;
                    }

                }

            }
            System.out.println("Output : " + output);

            System.out.println("do you want to continue?");
            awnser=sc.next();

        }while(awnser.equals("y"));
    }
}
