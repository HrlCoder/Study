package Lambda;

public class Demo02Lambda {
    public static void showlog(int level, MessageBuilder mb) {
        if(level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 =  "Hello";
        String msg2 =  "World";
        String msg3 =  "Java";

        showlog(1,()->{
            System.out.println("Lambda执行！");
            return msg1+msg2+msg3;
        });
    }
}
