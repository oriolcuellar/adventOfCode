import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main1_1 {

    public static void main(String[] args){
        int res=0;
        try{
            //String s="";
            String filePath= "2015/1.txt";
            BufferedReader rb=new BufferedReader(new FileReader(filePath));
            int open=0;
            int close=0;
            int l=0;
            char s='a';
            int count=1;
            while((l=rb.read())!=-1){
                s=(char) l;
                if(s=='(')open++;
                if(s==')')close++;
                if((open-close)==-1) System.out.println(count);
                count++;

            }
            res= open-close;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}