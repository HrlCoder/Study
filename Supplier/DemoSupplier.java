package Supplier;

import java.util.function.Supplier;

public class DemoSupplier {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(()->{
           return "君君";
        });
        System.out.println(s);

        String s1 = getString(()->"君君");
        System.out.println(s1);
    }
}
