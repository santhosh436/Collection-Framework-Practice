import java.util.ArrayList;

public class HighestNumber {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(2);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(7);

        System.out.println("Original ArrayList: " + list);

        int firstNonRepeating = findFirstNonRepeating(list);

        System.out.println("First non-repeating element: " + firstNonRepeating);
    }

    public static int findFirstNonRepeating(ArrayList<Integer> list) {
        int n = list.size();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            found = true;
            for (int j = 0; j < n; j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return list.get(i);
            }
        }

        return 0;
    }
}
