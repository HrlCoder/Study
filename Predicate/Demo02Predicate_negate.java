package Predicate;

import java.util.function.Predicate;

public class Demo02Predicate_negate {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "abfsg";
        boolean b = checkString(s,(String str)->{
            return str.length()>10;
        });
        System.out.println(b);  // true
    }
}
