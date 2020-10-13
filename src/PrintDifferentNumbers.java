import java.util.Scanner;
import java.util.Arrays;
public class PrintDifferentNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers :");
        int maxn = 100000;
        int num = 0;
        int[] a = new int[maxn];
        int[] b = new int[maxn];
        for(int i = 0;i < maxn; ++ i){
            b[i] = 0;
        }
        for(int i = 0;i < 10; ++ i){
            int x = input.nextInt();
            if(b[x]==0){
                a[num] = x;
                num ++;
                b[x] ++;
            }
        }
        System.out.println("The number of distinct number is "+num);
        System.out.print("The distinct numbers are : ");
        for(int i = 0;i < num;++ i){
            System.out.print(a[i]);
            if(i<num) System.out.print(" ");
        }
    }
}