import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[4][4];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr1.length; i++){
            int sum = 0;
            for(int j = 0; j < arr1[i].length; j++){
                sum += arr1[i][j];
            }
            System.out.println(sum);
        }
    }
}