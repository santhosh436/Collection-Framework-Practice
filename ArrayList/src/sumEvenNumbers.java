import java.util.ArrayList;
import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        System.out.println("Enter Integers(type non-integer to stop):");
        while (in.hasNextInt()) {
            int input = in.nextInt();
            data.add(input);
        }
        in.close();
        int sum = 0;
        for(int num : data){
            if(num%2 == 0){
                sum += num;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
