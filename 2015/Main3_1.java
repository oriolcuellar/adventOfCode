import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main3_1 {
    public static void main(String [] args){
        //number of houses delivered
        String fileName="2015/3.txt";

        int x=0;
        int y=0;
        int xR=0;
        int yR=0;

        try {
            HashMap <String, Integer> hm= new HashMap<>();
            BufferedReader br=new BufferedReader(new FileReader(fileName));
            String pos=x+"-"+y;
            hm.put(pos, 1);
            char move='-';
            int num=0;
            int houses=1;
            boolean santa=false;

            while ((num = br.read()) != -1) {
                santa=(!santa);

                move = (char) num;
                //move and update pos
                if(move=='<'){x--;}
                else if(move=='>'){x++;}
                else if(move=='^'){y++;}
                else if(move=='v'){y--;}

                //if exists
                pos=x+"-"+y;

                if(hm.containsKey(pos)){
                    int count=hm.get(pos);
                    count++;
                    hm.put(pos, count);

                }
                //if not exists
                else{
                    houses++;
                    hm.put(pos, 1);
                }
            }
            System.out.println(houses);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
