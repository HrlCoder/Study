import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();//糕点大小
            int m = sc.nextInt();//操作数
            int[] arrn = new int[n];//默认糖分
            for (int i = 0; i < arrn.length; i++) {
                arrn[i] = sc.nextInt();
            }
            for (int x = 0; x < m; x++) {
                int i = sc.nextInt();
                int j = sc.nextInt();
                int b = sc.nextInt();
                if(i > arrn.length
                        || j > arrn.length || j < 0 || i < 0 || b < 0) break;
                int nb = 1;
                for (int xx = i-1; xx < j; xx++) {
                    arrn[xx] += nb*b;
                    arrn[xx]  = arrn[xx]%1000000007;
                    nb++;
                }
            }
            for (int i = 0; i < arrn.length; i++) {
                if(i == arrn.length-1) {
                    System.out.print(arrn[i]);
                } else {
                    System.out.print(arrn[i]+" ");
                }
            }
        }
    }
}
