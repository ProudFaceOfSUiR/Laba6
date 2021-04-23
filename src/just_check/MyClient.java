package just_check;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class MyClient {
    public static void main(String Args[]) throws InterruptedException {
        while (true){
        try (Socket client = new Socket("localhost", 1488)) {
            Scanner scanner = new Scanner(System.in);
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());

            System.out.println("Connected successfully");


            Str str = new Str();
            str.setStr(scanner.nextLine());

            out.writeObject(str);
            out.flush();

            Messages messages = new Messages();
            messages.addString("Nu camon, it should work");
            messages.addString("eshe odna");

            out.writeObject(messages);
            out.flush();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Io exception");
            Thread.sleep(5000);
        }
    }
    }
}
