package LabClient;

import LabServer.Enter;
import com.sun.prism.shader.Solid_RadialGradient_REFLECT_AlphaTest_Loader;
import just_check.Str;
import java.io.IOException;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * reading data from input stream
 */
public class Scaner {

    ArrayList<String> arrayList = new ArrayList<String>();
    public Enter scan(String str) {
        try {
            str = str.trim();
            String[] words = str.split(" ");
            /*for (int i = 0; i< words.length; i++){
                this.arrayList.add(words[i]);
            }*/
            if (words[0].equals("help")) {
                return Enter.HELP;
            } else if (words[0].equals("info")) {
                return Enter.INFO;
            } else if (words[0].equals("show")) {
                return Enter.SHOW;
            } else if (words[0].equals("execute_script")){
                return Enter.EXECUTE;
            } else if (words[0].equals("clear")) {
                return Enter.CLEAR;
            } else if (words[0].equals("save")) {
                return Enter.SAVE;
            }  else if (words[0].equals("add")) {

                return Enter.ADD;
            } else if (words[0].equals("add_if_min")){
                return Enter.ADD_MIN;
            } else if (words[0].equals("exit")) {
                return Enter.EXIT;
            } else if (words[0].equals("min_by_name")) {
                return Enter.MIN;
            } else if (words[0].equals("print_unique_students_count")) {
                return Enter.PRINT;
            } else if (words[0].equals("filter_contains_name")){
                return Enter.FILTER;
            }
            else if (words[0].equals("remove_by_id")) {
                return Enter.REMOVE_ID;
            } else if (words[0].equals("remove_greater")){
                return Enter.REMOVE_G;
            } else if (words[0].equals("remove_lower")){
                return  Enter.REMOVE_L;
            }
            else if (words.length > 0 && words[0].equals("update")) {
                int i = 1;
                while (words[i].equals("")) {
                    i = i + 1;
                }
                if (words[i].equals("id")) {
                    return Enter.UPDATE;
                } else {
                    return Enter.ERROR;
                }
            } else {
                return Enter.ERROR;
            }
        } catch (ArrayIndexOutOfBoundsException expection) {
            System.out.println("Unknown command");
            return Enter.ERROR;
        }
    }
    public Object exeCommand(Enter enter){

        if (enter == Enter.ADD){
            StudyGroup group = new StudyGroup();
            //group = Collection.
        }
        return enter;
    }
}
