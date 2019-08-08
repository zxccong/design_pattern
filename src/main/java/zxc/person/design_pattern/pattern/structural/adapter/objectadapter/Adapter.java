package zxc.person.design_pattern.pattern.structural.adapter.objectadapter;

/**
 * Created by geely
 * 对象适配器
 */
public class Adapter implements Target{
    //组合
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
