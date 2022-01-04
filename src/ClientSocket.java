import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Message for Server : ");
            String msg = sc.next();
            Socket s = new Socket("localhost",1029);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF(msg);


            DataInputStream dis = new DataInputStream(s.getInputStream());
            String result = dis.readUTF();
            System.out.println("Received from Server : "+result);
            dis.close();
            dos.close();
            s.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
