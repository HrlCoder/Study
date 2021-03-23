package Consumer;

import java.util.function.Consumer;

public class 格式化打印信息 {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] array = {"君君,18","龙龙,19","璇璇,18"};

        printInfo(array,(message)->{
            String[] name = message.split(",");
            System.out.print("姓名:"+name[0]+" ");
        },(message)->{
            String[] age = message.split(",");
            System.out.println("姓名:"+age[1]);
        });
    }
}
