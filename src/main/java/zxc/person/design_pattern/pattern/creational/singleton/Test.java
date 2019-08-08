package zxc.person.design_pattern.pattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by geely
 *
 * 单例模式
 *
 * 定义：保证一个类仅有一个实例，并提供一个全局的访问点
 * 类型：创建型
 * 适用场景：
 * 想确保任何情况下都绝对只有一个实例
 * 线程池、多服务网站（集群）计数器、数据库连接池
 *
 * 优点
 * 内存中只有一个实例，减小内存开销
 * 可以避免对同一资源文件多重占用
 * 设置全局访问点，严格控制访问
 * 缺点：
 * 没有接口，拓展困难
 *
 * 重点
 * 私有构造器
 * 线程安全
 * 延迟加载
 * 序列号和反序列化安全
 * 反射
 *
 * 实用技能
 * 反编译
 * 内存管理
 * 多线程Debug
 *
 * 相关设计模式
 * 单例模式和工厂模式
 *
 * 单例模式和享元模式
 *
 *
 * 应用：
 * 例子一:
 * Runtime
 *
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

//        HungrySingleton instance = HungrySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//          //序列化
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//          //反序列化
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
            //枚举类序列化
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
        //拿到不同的对象
//        System.out.println(instance.getData() == newInstance.getData());

//        Class objectClass = HungrySingleton.class;
//        Class objectClass = StaticInnerClassSingleton.class;

//        Class objectClass = LazySingleton.class;
//        Class objectClass = EnumInstance.class;
////
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//
//        constructor.setAccessible(true);
        //不能通过反射创建枚举异常，查看newInstance源码
//        if ((clazz.getModifiers() & Modifier.ENUM) != 0)
//            throw new IllegalArgumentException("Cannot reflectively create enum objects");
        //protected Enum(String name, int ordinal) {}
        //查看java.lang.enum看到唯一的构造方法
        //通过反编译，看到INSTANCE 是 static final 并且在静态代码块中初始化了
//        EnumInstance instance = (EnumInstance) constructor.newInstance("Geely",666);


//
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();



//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();


//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        EnumInstance instance = EnumInstance.getInstance();
        instance.printTest();


    }
}
