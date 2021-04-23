package LabClient;

import java.util.ArrayList;
import java.util.Scanner;

public class RequestConverter {
    static ArrayList<String> add(){
        ArrayList<String> commands = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter group name ");
        String str = new String();
        while(!str.equals("")){
            str = scanner.nextLine();
        }

        return commands;
    }
}
