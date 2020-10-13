import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxn = 10000;
        double[] a = new double[maxn];
        System.out.print("输入数字：");
        for(int i = 0;i < 10;++i){
            a[i] = input.nextDouble();
        }
        for(int i = 0;i < 10 - 1; ++ i){
            for(int j = 0;j < 10 - i;++j){
                if(a[j] > a[j+1]){
                    double tool = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tool;
                }
            }
        }
        for(int i = 0;i < 10;++i){
            System.out.print(a[i]);
            if(i<10){
                System.out.print(" ");
            }
        }
    }
}