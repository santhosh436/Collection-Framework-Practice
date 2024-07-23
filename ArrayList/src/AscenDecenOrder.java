import java.util.ArrayList;
import java.util.Arrays;

public class AscenDecenOrder {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,34,4,5,19,25));
        for(int i = 0;i < list.size();i++){
            for(int j = 0;j < list.size();j++){
                if(list.get(i)<list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println(list);

    }
}
