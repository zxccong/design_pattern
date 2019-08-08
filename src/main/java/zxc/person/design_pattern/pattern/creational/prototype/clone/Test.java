package zxc.person.design_pattern.pattern.creational.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by geely
 * 深拷贝，浅拷贝讲解
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(666666666666L);

        System.out.println(pig1);
        System.out.println(pig2);

        //单例模式
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        //两种解决方法 1 .不继承可克隆方法 2.继承了克隆方法，调用返回instance，getInstance
//        System.out.println(hungrySingleton);
//        System.out.println(cloneHungrySingleton);



    }
}
