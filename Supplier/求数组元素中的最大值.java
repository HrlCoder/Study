package Supplier;

import java.util.function.Supplier;

public class 求数组元素中的最大值 {
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,45,76,8,9,0,776,4};
        int maxNum = getMax(()-> {
            int max = arr[0];
            for (int i : arr) {
                if(i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxNum);
    }
}
