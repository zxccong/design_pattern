package zxc.person.design_pattern.pattern.behavioral.state;

/**
 * Created by geely
 *
 * 状态模式
 * 定义：允许一个对象在其内部状态改变时，改变它的行为
 * 适用场景：
 * 一个用户存在多个状态（不同状态下行为不同），且状态可以相互转换
 * 电梯运行不能开门
 * 订单被取消不能支付
 * 暂停不能快进
 * 等等
 *
 * 优点：
 * 将不同的状态隔离
 * 把各种状态的转换逻辑，分不到State的子类，减小相互间依赖
 * 增加新的状态非常简单
 * 缺点：
 * 状态多的业务场景导致类的数目，系统变复杂
 *
 * 相关的设计模式：
 * 状态模式和享元模式，配合使用可以在多个上下共享状态
 *
 * 应用：
 * 例子一：jsf-api
 * hsp-api-12-source.jar
 * 中javax.faces.lifecycle.Lifecycle execute(FacesContext )
 * 控制状态
 */
public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();

        System.out.println("当前状态:"+courseVideoContext.getCourseVideoState().getClass().getSimpleName());


        courseVideoContext.speed();

    }
}
