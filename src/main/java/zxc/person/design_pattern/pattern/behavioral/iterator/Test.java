package zxc.person.design_pattern.pattern.behavioral.iterator;

/**
 * Created by geely.
 *
 * 迭代器模式
 * 定义：提供一种方法，顺序访问一个集合对象中的各个元素，而又不暴露该对象的内部表示
 *
 * 适用场景
 * 访问一个集合对象的内容而无需暴露它的内部表示
 * 为遍历不同的集合结构提供一个统一的接口
 *
 * 优点：
 * 分离了集合对象的遍历行为
 * 类的个数成对增加
 *
 * 相关的设计模式
 * 迭代器模式（拓展开放的部分，在集合的种类上）和访问者模式（拓展开放的部分，在对象的操作上），都是迭代的访问集合中的各个元素
 * 基本使用现成的迭代器，使用率高但很少自己实现
 *
 * 应用：
 * 例子一：java 迭代器
 * java.util.Iterator 接口
 * java.util.ArrayList.Itr 实现
 *
 * 例子二 Mybatis 游标
 * org.apache.ibatis.cursor.defaults.DefaultCursor
 * org.apache.ibatis.cursor.defaults.DefaultCursor.CursorIterator 迭代器
 * org.apache.ibatis.cursor.defaults.DefaultCursor#iterator() 创建游标迭代器
 *
 *
 *
 */
public class Test {


    public static void main(String[] args) {
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Java设计模式精讲");
        Course course4 = new Course("Python课程");
        Course course5 = new Course("算法课程");
        Course course6 = new Course("前端课程");


        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("-----课程列表-----");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("-----删除操作之后的课程列表-----");
        printCourses(courseAggregate);
    }


    public static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator= courseAggregate.getCourseIterator();
        while(!courseIterator.isLastCourse()){
            Course course=courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }


}
