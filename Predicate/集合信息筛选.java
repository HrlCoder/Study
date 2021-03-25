package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class 集合信息筛选 {
    public static void main(String[] args) {
        String[] array = {"飞飞飞飞,男","黄黄,男","闻闻闻闻,男","胖胖,女"};

        ArrayList<String> list = checkString(array, (String s) -> {
            return s.split(",")[1].equals("女");
        }, (String s) -> {
            return s.split(",")[0].length() == 2;
        });
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> checkString(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if(b) {
                list.add(s);
            }
        }
        return list;
    }
}
