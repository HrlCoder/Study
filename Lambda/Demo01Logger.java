package Lambda;

/*
    日志案例

    发现下面代码存在性能浪费
 */
public class Demo01Logger {
    //定义一个根据日志的等级，显示日志信息的方法
    public static void showlog(int level, String message) {
        //对日志等级判断，等于1时输出日志信息
        if(level == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 =  "Hello";
        String msg2 =  "World";
        String msg3 =  "Java";
        showlog(1,msg1+msg2+msg3);

    }
}
