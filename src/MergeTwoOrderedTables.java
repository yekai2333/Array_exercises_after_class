import java.util.Scanner;
import java.util.Arrays;
public class MergeTwoOrderedTables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxn = 100;
        System.out.print("Enter list1 : ");
        int[] a = new  int[maxn];
        int[] b = new  int[maxn];
        a[0] = input.nextInt();
        for(int i = 1; i <= a[0] ; ++i){
            a[i] = input.nextInt();
        }
        System.out.print("Enter list2 : ");
        b[0] = input.nextInt();
        for(int i = 1;i <= b[0];++i){
            b[i] = input.nextInt();
        }
        System.out.print("The merged list is ");
        int[] c = merge(a,b);
        for(int i = 1;i <= a[0] + b[0];++i) {
            System.out.print(c[i] + " ");
        }
    }
    public static int[] merge(int[] list1,int[] list2){
        int[] s = new int[2000];
        for(int i = 1;i <= list1[0]+list2[0];++ i){
            if(i<=list1[0]) s[i] = list1[i];
            else s[i] = list2[i-list1[0]];
        }
        Arrays.sort(s,1,list1[0]+list2[0]+1);
        return s;
    }
}