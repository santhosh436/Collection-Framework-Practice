import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PositionOfElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,0,4,7,32,9));
        System.out.println("Enter the number:");
        int input = in.nextInt();
        int index = list.indexOf(input);
        System.out.println(index);


    }
}
