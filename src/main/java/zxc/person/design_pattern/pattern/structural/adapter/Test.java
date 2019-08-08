package zxc.person.design_pattern.pattern.structural.adapter;

/**
 * Created by geely
 *
 * 适配器模式
 * 定义：将一个类的接口转换成客户期望的另一个接口
 * 使得原本不兼容的类可以一起工作
 * 类型：结构型
 *
 * 适用场景
 * 已经存在的类，它的方法和需求不匹配时（方法结果相同或相似）
 * 不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品，
 * 不同厂家造成功能类似而接口不同的情况下的解决方案
 *
 * 优点
 * 能提高类的透明性和复用，现有的类复用但不需要改变
 * 目标类的适配器类解耦，提高程序扩展性
 * 符合开闭原则
 * 缺点
 * 适配器编写的过程需要全面考虑，可能增加系统的复杂性
 * 增加系统代码的可读难度
 * 扩展：
 * 对象适配器（通过组合）
 * 类适配器（通过继承）
 *
 * 适配器相关的设计模式
 * 适配器模式（复用原有的接口，使两个已有的接口协同工作，）和外观模式（定义了新的接口，在现有的系统中提供更方便的访问入口，外观所针对的力度更大），
 * 都是对现有的类，现存的系统的封装
 *
 *
 * 应用：
 * javax.xml.bind.annotation.adapters.XmlAdapter用于处理序列化，反序列化接口
 *javax.xml.bind.annotation.adapters在这个包下全是适配器的类
 *
 * 例子二
 * org.springframework.aop.framework.adapter.AdvisorAdapter
 * spring的AOP的适配器
 * org.springframework.aop.framework.adapter.MethodBeforeAdviceAdapter
 * 增强方法之前的
 *
 * 例子三：
 * org.springframework.orm.jpa.JpaVendorAdapter
 * jpa中的适配器
 *
 * 例子四：
 * org.springframework.web.servlet.HandlerAdapter
 * springMvc
 * org.springframework.web.servlet.DispatcherServlet
 * 中doDispatch()方法，获取HandlerAdapter使得每一个Controller接口有对应的实现
 * 相当于Controller是目标类，Handler是被适配类，正在干活的
 *
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();

    }
}
