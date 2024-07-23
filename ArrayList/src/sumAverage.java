import java.util.*;
import java.lang.String;
public class sumAverage{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        while (in.hasNextInt()){
            int input = in.nextInt();
            data.add(input);
        }
        in.close();
        System.out.println(data);
        int sum = 0;
        for(int num : data){
            sum +=num;
        }
        System.out.println(sum);
        int avg = sum/data.size();
        System.out.println(avg);
    }
}