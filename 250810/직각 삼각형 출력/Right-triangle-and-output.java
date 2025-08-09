import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int star = 1;
        for(int i = 1; i <= a; i++){
            for(int j = 0; j < star; j++){
                    System.out.print("*");
            }
            System.out.println();
            star += 2;
        }
    }
}