package just_check;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String Args[]) throws InterruptedException{
        try(ServerSocket server = new ServerSocket(1488)){

            Socket client = server.accept();
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            System.out.println("Accept");
            System.out.println();

            Str str = (Str) in.readObject();
            str.getStr();

            Messages messages = (Messages) in.readObject();

            for (int i = 0; i<messages.strings.size();i++){
                System.out.println(messages.strings.get(i));
            }

        }catch (ClassNotFoundException e){
            System.out.println("I catched it");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("I expected that");
        }catch (NullPointerException e){
            System.out.println("No elements in queu");
        }
    }
}
