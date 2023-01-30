package MethodOverwrite.MethodOverwrite;

//子类
public class NineYin extends Material{
    //练习内功
    @Override
    public void internalStrength(){
        //这里是调用父类的成员方法
        super.internalStrength();
        System.out.println("以柔克刚");
    }

    //练习招式
    @Override
    public void stroke(){
        System.out.println("酒隐白骨爪");
    }
}
