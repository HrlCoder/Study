package FunctionalInterface;


public class MyFunctionalInterfaceImpl implements MyFunctionalInterface{
    @Override   //检测方法是否为重写的方法
    public void method() {
        System.out.println("重写了接口中的抽象方法");
    }
}
