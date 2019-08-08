package zxc.person.design_pattern.pattern.creational.abstractfactory;

/**
 * Created by geely
 *
 * 抽象工厂
 * CourseFactory抽象工厂，有两个产品，属于同一产品族
 * 例子一
 * java.sql.Connection
 * 中createStatement（）返回同一产品族
 * 例子二
 * java.sql.Statement
 * 不同的方法,属于同一产品族
 *
 * 例子三
 * org.apache.ibatis.session.SqlSessionFactory
 * 有返回SqlSession Configuration两种的不同的产品，同属于一产品族
 */
public class Test {
    public static void main(String[] args) {


        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
