import java.util.*;
public class ByteStuffing{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String data="",result="";
		System.out.println("Enter the string value");
		data=sc.nextLine();
		System.out.println("The String value is"+data);
		result="ESC";
		System.out.println("The String value is"+result);
		for (int i=0;i<data.length();i++) {
			if (data.charAt(i)=='e' && data.charAt(i+1)=='s' && data.charAt(i+2)=='c') {
				result=result+"ESC";
			}
			result=result+data.charAt(i);
		}
		result=result+"ESC";
		System.out.println("The result is"+result);
	}
}