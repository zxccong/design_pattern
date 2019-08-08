package zxc.person.design_pattern.pattern.structural.flyweight;

/**
 * Created by geely
 *
 * 享元模式
 * 定义：提供了减小对象数量从而改变应用所需的对象结构的方式
 * 运用共享技术有效地支持大量细粒度的对象
 * 类型：结构型
 * 适用场景
 * 常常应用于系统底层的开发，以便解决系统，性能问题
 * String类型，字符串缓存池里
 * 数据库连接池
 *
 * 系统有大量的相似对象，需要缓冲池的场景，享元模式内部化，外部化
 * 优点：
 * 减小对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
 * 减小内存之外的其他资源的占用
 *
 * 缺点：
 * 关注内部/外部状态，关注线程安全问题
 * 使系统，程序逻辑复杂
 *
 *
 * 扩展：
 * 内部状态：（属性）
 * 在享元模式的内部，不会随环境改变而改变的共享部分
 * 外部状态
 * 随环境改变而改变，不可共享状态
 *
 * 相关的设计模式
 * 享元模式和代理模式（代理需要花费的资源和时间多，可以使用享元模式创建）
 * 享元模式（复用对象的思想）和单例模式（容器单例）
 *
 * 应用：
 * 例子一：
 * java.lang.Integer 中的value
 * public static Integer valueOf(int i) {
 *         if (i >= IntegerCache.low && i <= IntegerCache.high)
 *             return IntegerCache.cache[i + (-IntegerCache.low)];
 *         return new Integer(i);
 *     }
 *     如果在最小值和最大值之间直接取缓存，否则创建一个新的
 * private static class IntegerCache
 * Long中的也是valusOf也是类似的
 *
 * 例子二：
 * org.apache.commons.pool2.impl.GenericObjectPoolConfig
 * org.apache.commons.pool2.impl.GenericKeyedObjectPool
 * 连接池中，借
 * public T borrowObject(final K key) throws Exception {
 *         return borrowObject(key, getMaxWaitMillis());
 *     }
 *
 * 双端队列
 *     final ObjectDeque<T> objectDeque = register(key);
 * 还的源码
 * private final Map<K,ObjectDeque<T>> poolMap =
 *             new ConcurrentHashMap<>();
 *
 * 使用ConcurrentHashMap<>保存链接池的数据
 *
 *
 *
 */
public class Test {
    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
//        for(int i=0; i<10; i++){
//            String department = departments[(int)(Math.random() * departments.length)];
//            Manager manager = (Manager) EmployeeFactory.getManager(department);
//            manager.report();
//
//        }
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:" + (a == b)); //true同一个对象

        System.out.println("c==d:" + (c == d));//flase 不同一个对象

    }
}
