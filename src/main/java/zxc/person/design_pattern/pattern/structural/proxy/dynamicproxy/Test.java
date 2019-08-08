package zxc.person.design_pattern.pattern.structural.proxy.dynamicproxy;

import zxc.person.design_pattern.pattern.structural.proxy.IOrderService;
import zxc.person.design_pattern.pattern.structural.proxy.Order;
import zxc.person.design_pattern.pattern.structural.proxy.OrderServiceImpl;

/**
 * Created by geely
 *
 * 代理模式
 * 定义：为其他对象提供一种代理，以控制这个对象的访问
 * 代理对象在客户端和目标对象之间起到中介作用
 * 类型结构型
 *
 * 适用场景
 * 保护目标对象
 * 增强目标对象
 * 优点：
 * 代理对象与真实对象分离
 * 一定程度降低系统的耦合度，扩展性好
 * 保护目标对象
 * 增强目标对象
 * 缺点
 * 代理模式会造成系统设计中类的数目增加
 * 在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢
 * 增加系统的复杂度
 *
 * 扩展
 * 静态代理，显示定义一个业务实现类
 * 动态代理，通过接口方法名，调用实现类的同名方法
 * CGLib代理（final不能被重写），通过继承，重写类的业务代码
 *
 * Spring代理选择
 * 当Bean有实现接口时，Spring就会用JDK的动态代理
 * 当Bean没有实现接口时，Spring使用CGlib
 * 可以强制使用CGlib 在spring配置中加入<aop:aspectj-autoproxy proxy-target-class="true"/>
 *
 * 代理速度对比
 * CGLib，字节码生产的，比反射速度高，但要注意final修饰符
 * JDK动态代理 原生代理实现
 * JDK 比CGLib 快20%左右
 *
 * 相关设计模式
 * 代理模式（控制访问，更加注重代理人，来增强目标对象）和装饰者模式（为对象加上行为），实现相似，目的不同
 * 代理模式（不能改变所代理类的接口的）和适配器模式（主要考虑对象的接口）
 *
 * 应用：
 * 例子一: spring工厂
 * java.lang.reflect.Proxy
 * 代理引用
 * org.springframework.aop.framework.ProxyFactoryBean
 * 代理工厂类 中的getObject() 默认的时生产单例类，否则生产newPrototypeInstance实例
 *
 * 例子二：Aop
 * org.springframework.aop.framework.JdkDynamicAopProxy
 * Aop中对JDK动态代理
 * org.springframework.aop.framework.CglibAopProxy
 *
 * 例子三：Mybatis
 * org.apache.ibatis.binding.MapperProxyFactory  Mapper代理工厂
 * newInstance（）方法
 * org.apache.ibatis.binding.MapperRegistry#getMapper(java.lang.Class, org.apache.ibatis.session.SqlSession)
 * 调用了这个方法
 * org.apache.ibatis.session.Configuration#getMapper(java.lang.Class, org.apache.ibatis.session.SqlSession)
 *
 * 其中newInstance() 中
 * org.apache.ibatis.binding.MapperProxy#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
 * 代理类，
 * 进行Cache，享元模式
 * org.apache.ibatis.binding.MapperMethod#execute(org.apache.ibatis.session.SqlSession, java.lang.Object[])
 * 进行执行，insert，update,delete
 *
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
