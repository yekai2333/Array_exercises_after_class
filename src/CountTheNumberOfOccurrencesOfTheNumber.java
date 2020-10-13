import java.util.Scanner;
import java.util.Arrays;
public class CountTheNumberOfOccurrencesOfTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxn = 1000 ;

        int[] a = new int [maxn];
        int[] b = new int [maxn];
        int x;
        int k=0;
        for(int i = 0;i <= 100;++ i){
            b[i] = 0;
        }
        System.out.print("Enter the integers between 1 and 100 :");
        for(int i = 0;; ++ i){
            x = input.nextInt();
            if(x==0){
                break;
            }
            if(b[x]==0){
                a[k]=x;
                k++;
            }
            b[x]++;
        }
        Arrays.sort(a,0,k);
        for(int i=0;i<k;++i){
            if(b[a[i]]>1){
                System.out.println(a[i]+" occurs "+b[a[i]]+" time");
            }else{
                System.out.println(a[i]+" occurs "+b[a[i]]+" time");
            }
        }
    }
}