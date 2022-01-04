import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;

public class ServerSock {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ServerSocket ss = new ServerSocket(1029);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String result = dis.readUTF();
            System.out.println("Received from Client : "+result);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            System.out.println("Enter a Message for Client : ");
            String cmsg = sc.next();
            dos.writeUTF(cmsg);
            dis.close();
            dos.close();
            s.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
