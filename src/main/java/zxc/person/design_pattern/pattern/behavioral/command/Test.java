package zxc.person.design_pattern.pattern.behavioral.command;

/**
 * Created by geely
 * 命令模式
 * 定义：将“请求”封装成对象，以便使用不同的请求
 * 命令模式解决了应用程序中对象职责以及他们之间的通讯方式
 *
 * 适用场景
 * 请求调用者和请求接受者需要解耦，使得调用者和接受者不直接交互
 * 需要抽象出等待执行的行为
 * 优点：
 * 降低耦合
 * 容易扩展新命令或则一组命令
 * 缺点：
 * 命令的无限拓展增加类的数量，提高系统 的复杂度
 *
 * 相关设计模式
 * 命令模式和备忘模式，利用备忘模式保持命令
 *
 * 应用：
 * 例子一：
 * java.lang.Runnable
 * 命令抽象
 * 实现Runnable 接口命令实现
 *
 * 例子二： junit
 * junit.framework.Test#countTestCases()
 *
 * junit.framework.Test#run(junit.framework.TestResult)
 * 相当于命令的执行方法
 *
 *
 *
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲 -- By Geely");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
