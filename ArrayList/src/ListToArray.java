import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
    public static void main(String[] args){
        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(12,23,34,45,56,67,89));
        Integer[] integersList = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integersList));
    }
}
