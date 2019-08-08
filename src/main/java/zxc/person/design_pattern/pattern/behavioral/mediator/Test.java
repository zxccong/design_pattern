package zxc.person.design_pattern.pattern.behavioral.mediator;

/**
 * Created by geely
 *
 * 中介者模式：
 * 定义：定义一个，封装一组对象如何交互的对象
 * 通过使对象明确地相互引用来促进松散耦合，并允许独立地改变他们的交互
 * 适用场景
 * 系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解
 * 交互的公共行为，如果需要改变行为则可以增加新的中介者类
 * 优点：
 * 将一对多转化为一对一，降低程序复杂度
 * 类之间解耦
 * 缺点：
 * 中介者过多，导致系统复杂
 * 相关的设计模式
 * 中介者模式和观察者模式，使用观察者模式实现通讯
 *
 * 应用：
 * 例子一：
 * java.util.Timer
 * 是中介者
 * java.util.TimerTask
 * 任务类
 *
 *
 *
 *
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        //学习小组作为中介者
        User geely = new User("Geely");
        User tom= new User("Tom");

        geely.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Geely");
    }


}
