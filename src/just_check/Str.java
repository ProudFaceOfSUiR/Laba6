package just_check;

import java.io.Serializable;

public class Str implements Serializable {
    String str;
    public void setStr(String str){
        this.str=str;
    }
    public void getStr(){
        System.out.println(this.str);
    }
}
