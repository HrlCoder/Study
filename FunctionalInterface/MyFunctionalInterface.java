package FunctionalInterface;

/*
      @FunctionalInterface
     作用：检测接口是否是一个函数式接口
        是：编译成功
        否：编译失败（接口中没有抽象方法或抽象方法的个数多于一个）
 */

@FunctionalInterface
public interface MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();

//    //抽象方法中的public abstract可以省略,可以这样定义
//    void method2();
}
