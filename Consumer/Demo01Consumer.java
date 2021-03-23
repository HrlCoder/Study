package Consumer;

import java.util.function.Consumer;

public class Demo01Consumer {
    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void main(String[] args) {
        method("君君在干嘛",(name)->{
            //对传递的字符串进行消费
            //消费方式：直接输出字符串
            System.out.println(name);
            //消费方式：反转字符串
            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);
        });
    }
}
