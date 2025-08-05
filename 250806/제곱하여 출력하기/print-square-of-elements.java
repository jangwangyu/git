import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr = new int[100];
        int[] newArr = new int[100];

        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < a; i++) {
            newArr[i] = arr[i] * arr[i];
        }

        for(int i = 0; i < a; i++){
            System.out.print(newArr[i] + " ");
        }
        
    }
}