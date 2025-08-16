import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        asd(n,m);
    }
    public static void asd(int n, int m){
        int a = 0;
        for(int i = 1; i <= Math.min(n,m); i++){
            if(n % i == 0 && m % i == 0){
                a = i;
            }
        }
        System.out.print(a);
    }
}