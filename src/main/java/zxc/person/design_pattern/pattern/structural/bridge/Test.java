package zxc.person.design_pattern.pattern.structural.bridge;

/**
 * Created by geely
 * 桥接模式
 * 定义：将抽象部分与具体实现部分分离，使他们都可以独立地变化
 * 通过组合的方式建立两个类之间的联系，而不是继承
 * 类型，结构型
 *
 * 使用场景
 * 抽象和具体实现之间增加更多的灵活性
 * 一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行拓展
 * 不希望适用继承，或因为多层继承导致系统类的个数剧增
 *
 * 优点：
 * 分离抽象部分及其具体实现部分
 * 提高系统的可扩展性
 * 符合开闭原则
 * 符合合成复用原则
 * 缺点：
 * 增加了系统的理解于设计难度
 * 需要正确的识别出系统中两个独立变化的维度
 *
 * 相关设计模式
 * 桥接模式（平行级别上不同类的组合）和组合模式（部分和整体间的组合）
 * 桥接模式（分离抽象和具体的实现）和适配器模式（改变已有的接口），都是让两个的东西配合工作，
 *
 * Coding
 * 中Account 接口 和Bank进行桥接
 *
 * 应用：
 * 例子一：
 * com.mysql.jdbc.Driver
 * 中静态代码块 -> 调用
 * java.sql.DriverManager#registerDriver(java.sql.Driver)
 * 方法注册驱动 ->
 * private final static CopyOnWriteArrayList<DriverInfo> registeredDrivers = new CopyOnWriteArrayList<>();
 * 注册到驱动列表中 ->
 * java.sql.DriverManager#getConnection(java.lang.String, java.lang.String, java.lang.String)
 * 获取连接
 *
 * Connection 接口 桥接 Driver
 *
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
