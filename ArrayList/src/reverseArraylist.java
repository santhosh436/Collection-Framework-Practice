import java.util.ArrayList;
import java.util.Arrays;

public class reverseArraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,23,34,45,56,67));
        System.out.println(list);
        for(int i = 0;i < list.size()/2;i++){
            int temp = list.get(i);
            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-1-i,temp);
        }
        System.out.println(list);
    }
}
