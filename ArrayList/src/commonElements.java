import java.util.ArrayList;
import java.util.Arrays;

public class commonElements {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(12,34,45,56,67));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(90,34,66,56,12));
        ArrayList<Integer> result = new ArrayList<>();
        for(int element : list1){
            for (int item : list2){
                if(element == item){
                    result.add(element);
                    break;
                }
            }
        }
        System.out.println(result);

    }
}
