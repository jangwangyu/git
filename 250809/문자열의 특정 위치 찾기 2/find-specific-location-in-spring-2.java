import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] a = new String[]{"apple", "banana","grape","orange","blueberry"};

        char b = sc.next().charAt(0);
        int q = 0;

        for(int i = 0; i < 5; i++){
            if(a[i].charAt(2) == b || a[i].charAt(3) == b){
                System.out.println(a[i]);
                q++;
            }
        }
        System.out.println(q);
    }
}