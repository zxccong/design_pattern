package zxc.person.design_pattern.pattern.structural.decorator.v2;

/**
 * Created by geely
 *
 * 装饰者模式：
 * 定义：在不改变原有对象的基础之上，将功能附加到对象中
 * 提供了比继承更有弹性的替代方案（扩展原有对象功能）
 * 类型：结构
 *
 * 适用场景
 * 拓展一个类的功能或给一个类添加附加职责
 * 动态给一个对象添加功能，这些功能可以再动态的撤销
 *
 * 优点：
 * 继承的有力补充，比继承灵活，不改变原有对象下给一个对象扩展功能
 * 通过使用不同的装饰类以及这些装饰类排列组合，可以实现不同的效果
 * 符合开闭原则
 *
 * 缺点：
 * 会出现更多的代码，更多的类，增加程序复杂性
 * 动态装饰时，多层装饰会更复杂
 *
 * 相关的设计模式
 * 装饰者模式（关注在一个对象上动态的添加方法）和代理模式（控制对对象的访问）
 * 装饰者模式（装饰者是被装饰者的子类）和适配器模式（不同的接口） 都是包装模式wrapper
 *
 * 实现了可以加n个鸡蛋，n个火腿，不像V1只有1个鸡蛋，或一个火腿肠
 *
 * 应用：
 * JAVA IO
 * java.io.BufferedReader
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * FileInputStream
 * org.springframework.cache.transaction.TransactionAwareCacheDecorator
 * 装饰Cache
 *
 *  org.springframework.session.web.http.SessionRepositoryFilter 中的SessionRepositoryRequestWrapper
 *  装饰ServletRequest
 *
 *  wrapper后缀包装器，包装模式，适配器模式或装饰者模式
 *
 *
 *  org.apache.ibatis.cache.Cache的这个类上有个包叫decorators装饰者用来装饰Cache
 *  org.apache.ibatis.cache.decorators.FifoCache先进先出
 *
 * 里面Read 类比于普通 的煎饼
 * 因为java IO 运用了装饰者模式所以可以无限的转换
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());

    }
}
