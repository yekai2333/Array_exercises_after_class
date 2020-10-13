import java.util.Scanner;
import java.util.StringTokenizer;
public class SortCharactersInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxn = 10000;
        String a = input.nextLine();
        int n = a.length();
        System.out.println(sort(a));
    }
    public static String sort(String s){
        int n = s.length();
        char[] b = s.toCharArray();
        for(int i = 0;i < n-1;++ i){
            for(int j = 0;j < n-1-i;++j){
                if(b[j] > b[j+1]){
                    char tool = b[j+1];
                    b[j+1] = b[j];
                    b[j] = tool;
                }
            }
        }
        String s1 = String.valueOf(b);
        return s1;
    }
}