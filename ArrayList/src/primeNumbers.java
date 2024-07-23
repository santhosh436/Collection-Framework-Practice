import java.util.ArrayList;
import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        int num =0;
        System.out.println("enter the number:");
        int number = in.nextInt();
        while(count<number){
            if(isPrime(num)){
                result.add(num);
                count++;
            }
            num++;
        }
        System.out.println(result);

    }
   public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i =2;i<Math.sqrt(num)+1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
