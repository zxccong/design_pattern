package zxc.person.design_pattern.pattern.behavioral.strategy;

/**
 * Created by geely
 *
 * 策略模式
 * 定义：定义了算法家族，分别封装，让它们之间可以相互替换，此模式让算法的变化不会影响到使用算法的用户
 * 直接的应用可以大范围的处理调 if... else...
 * 适用场景：
 * 系统有很多类，而他们的区别仅仅在于他们的行为不同
 * 一个系统需要动态的在几种算法中选择一种
 * 优点：
 * 符合开闭原则
 * 避免适用多从条件转移语句 （去除if...else语句）
 * 提高算法的保密和安全
 *
 * 缺点：
 * 客户端必须知道所有的策略类，并自行决定使用哪个类
 * 产生很多策略类
 *
 * 相关设计模式
 * 策略模式（行为型，接受创建好的对象，提供不同的行为）和工厂模式（创建型）
 * 策略模式（需要知道选择哪个类）和状态模式（不需要关心哪个类）
 *
 * 应用：
 * 例子一 jdk
 * java.util.Comparator
 * java.util.Arrays#sort(java.lang.Object[], int, int, java.util.Comparator)
 * 传入了不同的比较器，相当于传入不同的策略
 * java.util.TreeMap#compare(java.lang.Object, java.lang.Object)
 *
 * 例子二： spring
 * org.springframework.core.io.Resource
 * 策略模式的抽象， 访问资源的不同策略
 * spring初始化
 * org.springframework.beans.factory.support.InstantiationStrategy
 *
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
}
