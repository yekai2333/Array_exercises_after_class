import java.util.Scanner;
import java.util.Arrays;
public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入学生个数: ");
        int n = input.nextInt();
        int maxn = 1000;
        String[] name = new String[maxn];
        int[] cj = new int[maxn];
        for(int i = 0;i < n;++ i){
            System.out.print("学生姓名和成绩：");
            name[i] = input.next();
            cj[i] = input.nextInt();
        }
        for(int i = 0;i < n - 1; ++ i){
            for(int j = 0;j < n - i;++j){
                if(cj[j] < cj[j+1]){
                    int tool = cj[j+1];
                    cj[j+1] = cj[j];
                    cj[j] = tool;
                    String tool2 = name[j+1];
                    name[j+1] = name[j];
                    name[j] = tool2;
                }
            }
        }
        for(int i = 0;i < n; ++ i){
            System.out.println("第"+(i+1)+"名"+name[i]+"得了"+cj[i]+"分");
        }
    }
}
