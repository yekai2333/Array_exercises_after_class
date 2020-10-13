import java.util.Scanner;
import java.util.Arrays;
public class GameLlockerProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxn = 10000;
        int[] a = new int[maxn];
        for(int i = 1;i <= 100;++i){
            a[i] = -1;
        }
        for(int i = 1;i <= 100;++i){
            for(int j = i;j <=100;j = j + i){
                a[j] = a[j] *(-1);
            }
        }
        System.out.print("打开的柜子有：");
        for(int i = 1;i <= 100;++i){
            if(a[i] == 1){
                System.out.print(i+" ");
            }
        }
    }
}