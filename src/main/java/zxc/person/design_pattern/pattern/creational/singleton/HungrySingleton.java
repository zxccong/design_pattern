package zxc.person.design_pattern.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Created by geely
 * 饿汉式
 */
public class HungrySingleton implements Serializable,Cloneable{

    private final static HungrySingleton hungrySingleton;

    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //查看源码：ObjectInputStream.readObject() ->readObject0() ->readOrdinaryObject() (obj = desc.isInstantiable() ? desc.newInstance() : null; )
    // ->ObjectStreamClass()(Returns true if represented class is serializable/externalizable)
    //->desc.hasReadResolveMethod()

    /**
     * Returns true if represented class is serializable or externalizable and
     * defines a conformant readResolve method.  Otherwise, returns false.dui
     */

    //Object rep = desc.invokeReadResolve(obj);
    //return readResolveMethod.invoke(obj, (Object[]) null);
    //readResolveMethod = getInheritableMethod(
    //                        cl, "readResolve", null, Object.class);
    //所以添加这个方法反序列化ximn
    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
