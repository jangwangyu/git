import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;

        while(i <= b){
            System.out.print( i + " ");
            if(i % 2 != 0){
                i *= 2;
            }else{
                i += 3;
            }
        }
        
    }
}