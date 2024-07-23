import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mergeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,34,45));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(123,35,56,6));
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.addAll(list1);
        resultList.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(resultList);
        in.close();
        
        
        
    }
}
