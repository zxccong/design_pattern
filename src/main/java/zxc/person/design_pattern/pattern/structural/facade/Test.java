package zxc.person.design_pattern.pattern.structural.facade;

/**
 * Created by geely
 *
 * 外观模式：
 * 定义：又叫门面模式，提供了一个统一接口，用来访问子系统的一群接口
 * 外观模式定义了一个高层接口，让子系统更容易使用
 * 类型：结构型
 *
 * 适用场景：
 * 子系统越来越复杂，增加外观模式提供简单调用接口
 * 构建多层系统结构，利用外观对象作为每层的入口，简化层间调用
 *
 * 优点：
 * 简化了调用过程，无需了解深入子系统，防止带来风险
 * 减小系统依赖、松散耦合
 * 更好的访问层次
 * 符合迪米特法则，最小知道原则
 *
 *
 * 缺点：
 * 增加子系统、扩展子系统行为容易引入风险
 * 不符合开闭原则
 *
 * 相关设计模式
 * 外观模式（外界和子系统交互）和中介者模式（子系统内部之间的交互）
 * 外观模式（外观对象作为单例结合使用）和单例模式
 * 外观模式和抽象工厂模式（外观类通过抽象工厂获取子系统实例，子系统可以在内部对外观类进行屏蔽）
 *
 * 应用：
 * 例子一：
 * org.springframework.jdbc.support.JdbcUtils 对JDBC进行了封装
 *
 * 例子二：
 * org.apache.ibatis.session.Configuration 的newMetaObject（）
 *
 * 例子三：
 * tomcat源码中 java.org.apache.catalina.connector.RequestFacade类 getParameter()
 * java.org.apache.catalina.connector.Request类 中声明了 RequestFacade类
 *
 * java.org.apache.catalina.connector.ResponseFacade
 * java.org.apache.catalina.session.StandardSessionFacade
 *
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
