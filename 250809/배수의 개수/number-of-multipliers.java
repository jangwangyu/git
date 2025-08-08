import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a, b = 0, c = 0 ;

        for(int i = 1; i <= 10; i++) {
            a = sc.nextInt();
            if(a % 3 == 0){
                b++;
            }
            if(a % 5 == 0){
                c++;
            }
        }
        System.out.print(b + " " + c);
    }
}