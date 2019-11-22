import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] a = n.split(" ");
        int[] b = new int[a.length];
        for (int i = 0; i < 10; i++) {
            b[i] = Integer.parseInt(a[i]);  //把string类型a数组转成int类型
        }


        int sum=0;
        int w=0;
        for(int j=0;j<10;j++) {
            sum = sum + b[j];
        }
        int[] p= new int[sum];
        for(int j=0;j<10;j++) {
            for (int m = 0; m < b[j]; m++) {
                while (w < sum) {
                    p[w] = j;
                    w++;
                }

            }
        }

        System.out.println(Arrays.toString(p));


    }
}