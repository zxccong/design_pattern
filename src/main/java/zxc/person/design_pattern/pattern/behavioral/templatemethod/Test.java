package zxc.person.design_pattern.pattern.behavioral.templatemethod;

/**
 * Created by geely
 * 模板方法
 * 定义：定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
 * 模板方法使得子类可以给在不改变算法结构的情况下，重新定义某些步骤
 *
 * 适用场景
 * 一次性实现一个算法不变的部分，并将可变的行为留给子类来实现
 * 各子类中的公共部分行为被提取出来并集中到一个公共的父类中，从而避免代码重复
 *优点：
 * 提高复用性
 * 提高扩展性
 * 符合开闭原则
 * 缺点
 * 类数目增加
 * 增加系统实现的复杂度
 * 继承自身的缺点，如果父类添加新的抽象方法，所有的子类都要改一遍
 *
 * 扩展
 * 钩子方法
 *
 * 相关设计模式
 * 模板方法和工厂方法，模板方法时工厂方法的一种实现
 * 模板方法模式（定义一个算法流程。交由子类实现，不改变算法的流程）和策略模式 （目的使不同的算法可以相互替换不影响使用，改变算法的流程，之间可以相互替换大量if-else）
 *
 * 模板方法一定要设置为final
 *
 * 应用：
 * 例子一：JDK  java.util.AbstractMap
 * java.util.AbstractList#addAll(int, java.util.Collection)抽象类中固定死了算法流程
 * java.util.AbstractList#get(int) 通过抽象方法使每个实现类自己实现
 *
 * 例子二：Servlet
 * javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 * doGet doPost 都是protected
 *
 * 例子三 Mybatis
 * Batch批量
 * ReUse重用
 * Simple简单的
 * org.apache.ibatis.executor.BaseExecutor#doUpdate(org.apache.ibatis.mapping.MappedStatement, java.lang.Object)
 * 抽象方法
 *
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("后端设计模式课程start---");
//        ACourse designPatternCourse = new DesignPatternCourse();
//        designPatternCourse.makeCourse();
//        System.out.println("后端设计模式课程end---");


        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");


    }
}
