import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[100];

        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = a - 1; i >= 0; i--){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}