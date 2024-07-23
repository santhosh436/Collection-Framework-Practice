import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class SplitList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> data = new LinkedList<>();
        System.out.println("Enter Integers(type non-integer to stop):");
        while (in.hasNextInt()) {
            int input = in.nextInt();
            data.add(input);
        }
        in.close();
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        int index = data.size()/2;
        for(int i = index;i<=data.size()-1;i++){
            list1.add(data.get(i));
        }
        for(int i = 0;i<index ;i++){
            list2.add(data.get(i));
        }
        System.out.println(data);
        System.out.println(list1);
        System.out.println(list2);

    }
}
