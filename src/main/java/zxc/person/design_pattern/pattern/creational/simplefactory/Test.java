package zxc.person.design_pattern.pattern.creational.simplefactory;

/**
 * 简单工厂
 * 定义：由一个工厂对象决定创建出哪一种产品类的实例
 * 类型：创建型，但不属于GOF23中设计模式
 *
 * 适用场景
 * 工厂类创建对象比较小
 *
 * 客户端（应用层）只知道工厂类的参数，对于如何创建对象（逻辑）并不关心
 *
 * 优点
 * 只需要传入一个正确的参数，就可以获取你所需要对象，而无需知道其创建细节
 * 缺点
 * 工厂类的职责相对过重，增加新的产品，需要修改工厂类的判断逻辑，违背了开闭原则
 *
 * 简单工厂在jdk的应用、
 * 类比于方法一：
 * 搜索类Alt+Shift+Ctrl+N
 * Calendar.java
 *
 * 搜索方法
 * Ctrl+F12
 * getInstance()
 * 判断语言国家
 *
 * 类比方法二：
 * JDBC链接数据库
 * 反射到DriverManager
 * getConnection()方法
 * 获得链接
 *
 * log4j
 * LoggerFactory
 * getLogger()方法
 * 查看接口(具体实现方法)
 * Ctrl+Alt+B
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
        //建立工程的话，不用依赖具体的类
//        Video video = new PythonVideo();

        //简单工厂，但不符合开闭原则
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (!video.equals(null)){
//            video.produce();
//        }




    }
}
