import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr1 = new int[10][10];
        int[][] arr2 = new int[10][10];
        int[][] arr3 = new int[10][10];

        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr3[i][j] = arr1[i][j] == arr2[i][j] ? 0 : 1;
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}