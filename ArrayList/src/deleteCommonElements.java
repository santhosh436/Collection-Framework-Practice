import java.util.ArrayList;
import java.util.Arrays;

public class deleteCommonElements {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(12,23,34,65,43));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(12,23,34,45,56,67,78,89));
        ArrayList<Integer> result = new ArrayList<>();
        for(int element : list1){
            boolean isSame = false;
            for (int item : list2){
                if(element == item){
                    isSame = true;
                    break;
                }
            }
            if(!isSame){
                result.add(element);
            }

        }
        for(int element : list2){
            boolean isSame = false;
            for (int item : list1){
                if(element == item){
                    isSame = true;
                    break;
                }
            }
            if(!isSame){
                result.add(element);
            }

        }
        System.out.println(result);

    }
}
