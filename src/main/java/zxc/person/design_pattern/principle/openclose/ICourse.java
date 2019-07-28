package zxc.person.design_pattern.principle.openclose;

/**
 * 1.开闭原则：
 * 定义，一个软件的实体如：类，模块，函数应该对扩展开放，对修改关闭
 * 用抽象构建框架，用实现拓展细节
 * 优点：提高软件系统的可复用性，及可维护性
 *
 *
 *
 * 接口
 */
public interface ICourse {
    Integer getId();

    String getName();

    Double getPrice();

//    Double getDiscountPrice();    不符合开闭原则 ，修改了原有的接口

}
