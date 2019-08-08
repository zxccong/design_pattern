package zxc.person.design_pattern.pattern.creational.builder;

/**
 * Created by geely
 *
 * 建造者模式
 * 定义：将一个复杂对象的构建于它的表示分离，使得同样构建过程可以创建不同的表示
 *
 * 用户只需指定需要建造的类型就可以得到他们，建造的过程及细节不需要知道
 * 类型：创建性
 *
 * 适用场景：
 * 如果一个对象有非常复杂的内部结构（很多属性）
 * 想把复杂对象的创建和使用分离
 *
 * 优点：
 * 封装性好，创建和使用分离
 * 扩展性好、建造类之间独立、一定程度上解耦
 * 缺点：
 * 产生多余的Builder对象
 * 产品内部发生变化，建造者都要修改，成本较大
 * 于工厂模式的区别：
 * 比较相似，工厂模式更注重创建产品，建造者模式更注重于调用顺序
 * 工厂模式创建产品比较简单，建造者模式产品由不同的部件组成
 *
 * 第一种
 * Course -> CourseBuilder -> CourseActualBuilder
 * 第二种
 * Course
 *
 * 建造者模式：
 * 例子一
 * StringBuilder
 * append返回自己可以链式调用，是第二种建造者模式
 * 例子二
 * guava 中不可变集合ImmutableSet
 * 例子三
 * CacheBuilder
 * 例子四
 * org.springframework.beans.factory,support.BeanDefinitionBuilder
 * XMLConfigBuilder
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);

    }
}
