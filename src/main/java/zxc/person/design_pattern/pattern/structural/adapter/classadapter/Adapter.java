package zxc.person.design_pattern.pattern.structural.adapter.classadapter;

/**
 * Created by geely
 *
 * 类适配者
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
