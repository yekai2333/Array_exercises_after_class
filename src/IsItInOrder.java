import java.util.Arrays;
import java.util.Scanner;
public class IsItInOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list : ");
        int maxn = 10000;
        int[] a = new int[maxn];
        int n = input.nextInt();
        for(int i = 0;i < n;++ i){
            a[i] = input.nextInt();
        }
        boolean flag = true;
        for(int i = 0;i < n-1;++i){
            if(a[i] > a[i+1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }
}