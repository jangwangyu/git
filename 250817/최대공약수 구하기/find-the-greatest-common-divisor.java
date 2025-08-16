import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.print(asd(n,m));
    }
    public static int asd(int n, int m){
        while(m != 0){
            int r = n % m; // 나머지 계산
            n = m; // m(낮은숫자)를 n으로
            m = r; // 나머지를 m으로 옮김
        }
        return n;
    }
}