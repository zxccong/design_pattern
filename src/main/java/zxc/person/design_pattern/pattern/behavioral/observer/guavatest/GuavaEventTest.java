package zxc.person.design_pattern.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * Created by geely
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        //把带有注释的类添加进去
        eventbus.register(guavaEvent);
        //相当于发生变化，给订阅者（观察者）发送消息
        eventbus.post("post的内容");
    }

}
