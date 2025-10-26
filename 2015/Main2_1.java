import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

public class Main2_1 {
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

                //calculate smaller
                PriorityQueue <Integer> pq=new PriorityQueue<>();
                pq.offer(num1);
                pq.offer(num2);
                pq.offer(num3);
                int min1=pq.poll();
                int min2=pq.poll();

                int surface=(2*min1)+(2*min2);

                total+=surface+(num1*num2*num3);
            }

            System.out.println(total);


            //add all and print
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
