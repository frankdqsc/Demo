package Interface.Feature;

public class Mouse implements Usb, A, B { //实现多接口

    @Override
    public void open() { // 普通类，重写方法
        System.out.println("Connect mouse");
    }

    @Override
    public void close() {
        System.out.println("Disconnect mouse");
    }
}
