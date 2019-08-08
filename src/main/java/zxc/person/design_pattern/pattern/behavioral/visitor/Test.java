package zxc.person.design_pattern.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geely
 * 访问者模式
 * 定义：封装作用于某种数据结构（List/Set/Map等）中的各种元素操作
 * 可以在不改变各元素的前提下，定义作用于这些元素的操作
 *
 * 使用场景：
 * 一个数据结构如（List/Set/Map等）包含很多类型对象
 * 数据结构与数据操作分离
 * 优点：
 * 增加新的操作很容易，即增加一个新的访问者
 * 缺点：
 * 增加新的数据结构困难
 * 具体元素变更比较麻烦
 * 相关设计模式
 * 访问者模式（保存在数据结构上的数据进行某种处理）和迭代器模式（逐个遍历保存在数据结构中的遍历），都是在某种数据结构上进行处理
 * 使用不经常
 *
 * 应用
 * 例子一：jdk文件访问
 * java.nio.file.FileVisitor
 *
 * 例子二：spring Bean的访问者
 *org.springframework.beans.factory.config.BeanDefinitionVisitor
 *
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲 -- By Geely");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for(Course course : courseList){
            course.accept(new Visitor());
        }

    }
}
