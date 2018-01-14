package ds.stack;
import java.util.*;
public class App {


    public static String reversString(String str){
        java.util.Stack S;
        
        int len = str.length();
     Stack st=new Stack(len);
     for (int i =0;i<len;i++){
    char c =str.charAt(i);
    st.push(c);
     }
     String Result="";
     while (!st.isEmpty()){
         Result=Result+st.pop();
     }
     return Result;
    }

public static void main(String[]args){
/*Stack st1=new Stack(10);
st1.push('H');
    st1.push('E');
    st1.push('L');
    st1.push('L');
    st1.push('O');


    while (!st1.isEmpty()){
        System.out.println(st1.pop());
    }*/
System.out.println(reversString("OLLEH"));
}
}
