import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args){
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(12,3,54,34,12,54,3,43,12,43));
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        for(int element : data){
            boolean isDuplicate = false;
            for (int item : temp){
                if(element == item){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                temp.add(element);
            }
        }
        System.out.println(temp);

    }
}
