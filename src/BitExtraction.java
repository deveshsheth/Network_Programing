import java.util.Scanner;

public class BitExtraction {

    public static void main(String[] args) {
        int num, pos;
        BitExtraction bc = new BitExtraction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        System.out.println("Enter a Position : ");
        pos = sc.nextInt();
        bc.conversion(num, pos);
    }

    public void conversion(int num, int pos) {
        int result, mask = 1;
        mask = mask << (pos - 1);
        result = (num & mask);
        if (result == 0) {
            System.out.println("bit at position " + pos + "is 0");
        } else {
            System.out.println("bit at position " + pos + "is 1");
        }

    }

}
