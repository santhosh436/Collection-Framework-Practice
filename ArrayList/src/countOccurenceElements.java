import java.util.ArrayList;

public class countOccurenceElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(32);
        list.add(32);
        list.add(1);
        list.add(33);
        list.add(33);

        ArrayList<Integer> countedElements = new ArrayList<>();

        for (int element : list) {
            if (!countedElements.contains(element)) {
                int count = 0;
                for (int item : list) {
                    if (item == element) {
                        count++;
                    }
                }
                countedElements.add(element);
                System.out.println(element + ": " + count);
            }
        }
    }
}
