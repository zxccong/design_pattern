package zxc.person.design_pattern.pattern.behavioral.chainofresponsibility;

/**
 * Created by geely
 * 责任链模式（职责链模式）
 * 定义：为请求创建一个接受此请求对象的链
 * 使用场景
 * 一个请求的处理需要多个对象当中的一个或者多个协作处理
 * 优点：
 * 请求的发送者和接受者（请求的处理）解耦
 * 责任链可以动态的组合
 * 缺点
 * 责任链太长或者处理时间过长，影响性能
 * 责任链可能过多
 *
 * 相关的设计模式
 * 责任链模式(各个对象并不指定下一个处理对象)和状态模式（知道自己处理的下一个对象是谁）
 *
 * 应用：
 * 例子一：servlet过滤器
 * javax.servlet.Filter 链条元素
 * javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
 * 多个
 * javax.servlet.FilterChain 里面doFilter()
 * 组成责任链条
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式精讲 -- By Geely");
        course.setArticle("Java设计模式精讲的手记");
        course.setVideo("Java设计模式精讲的视频");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
