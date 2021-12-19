import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        int count=1;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Characters : ");
        name = sc.next();
        char[] str = name.toCharArray();
        for(char k:str){
            count++;
        }
        System.out.println(count+name);

    }
}
