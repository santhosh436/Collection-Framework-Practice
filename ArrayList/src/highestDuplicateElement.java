import java.util.ArrayList;

public class highestDuplicateElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(32);
        list.add(32);
        list.add(1);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(32);
        list.add(32);
        int highestElement = 0;
        int maxCount = 0;

        for (int element : list) {
            int count = 0;
            for (int item : list) {
                if (item == element) {
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                highestElement = element;
            }
        }
        System.out.println("Highest occured element is "+highestElement+ " it is occured in "+maxCount +" times occured");
    }
}
