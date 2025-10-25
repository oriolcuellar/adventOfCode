import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

public class Main2 {
    public static void main(String[] args){
        //read line
        String filePath="2015/2.txt";
        int total=0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line="";
            while((line=br.readLine())!=null){
//separate numbers
                String [] aa=line.split("x");
                //calculate surfaces
                int num1=Integer.parseInt(aa[0]);
                int num2=Integer.parseInt(aa[1]);
                int num3=Integer.parseInt(aa[2]);
                int surface=(2*num1*num2)+(2*num2*num3)+(2*num1*num3);
                //calculate smaller
                PriorityQueue <Integer> pq=new PriorityQueue<>();
                pq.offer(num1);
                pq.offer(num2);
                pq.offer(num3);
                int min1=pq.poll();
                int min2=pq.poll();

               total+=surface+(min1*min2);
            }

            System.out.println(total);


            //add all and print
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
