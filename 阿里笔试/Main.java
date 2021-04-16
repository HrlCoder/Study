package 阿里面试;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i+1;
            }
            for (int i = 0; i < k; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int left = l-1;
                int right = r-1;
                while (left < right) {
                    if (left < right) {
                        int temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;
                    }
                    left++;
                    right--;
                }
                System.out.println(Arrays.toString(arr));
            }
            int count = 0;
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]> arr[j]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
