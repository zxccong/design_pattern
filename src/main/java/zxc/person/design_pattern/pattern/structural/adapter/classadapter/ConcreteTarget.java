package zxc.person.design_pattern.pattern.structural.adapter.classadapter;

/**
 * Created by geely
 *
 * 具体的target实现类
 *
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
