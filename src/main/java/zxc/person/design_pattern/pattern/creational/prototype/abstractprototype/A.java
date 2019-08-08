package zxc.person.design_pattern.pattern.creational.prototype.abstractprototype;

/**
 * Created by geely
 * 继承抽象接口
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
