package zxc.person.design_pattern.pattern.behavioral.observer;

/**
 * Created by justin
 *
 * 发布订阅模式
 *
 * 观察者模式：
 * 定义：定义了对象之间的一对多的依赖，让多个观察者对象同时监听某个主题对象，
 * 当主题对象发生变化时，它的所有依赖（观察者）都会收到通知并更新
 * 朋友圈，发的消息时主题对象，我们人是观察者，会收到消息
 * 京东上，商品是主题对象，发生降价的时候，人会收到消息
 *
 * 适用场景：
 * 关联行为场景，建立一套触发机制
 *
 * 优点
 * 观察者和被观察者之间建立一个抽象的耦合
 * 观察者模式支持广播通信
 * 缺点：
 * 观察者之间有过多的细节依赖，提高时间消耗及程序复杂度
 * 使用要得当，要避免循环调用
 *
 *应用：
 * 例子一：JDK 桌面程序，事件监听
 * java.awt.Event
 *
 * 例子二： spring事件监听
 * org.springframework.web.context.request.RequestContextListener
 * 继承
 * java.util.EventListener
 *
 * 例子三： guave中提供的发布订阅
 * @Subscribe
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");


        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("Geely");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course,question);

    }
}
