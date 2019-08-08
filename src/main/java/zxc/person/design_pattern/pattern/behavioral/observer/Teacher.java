package zxc.person.design_pattern.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by justin
 * 观察者实现Observer接口，
 *
 * 讲师观察课程 ，问题属于课程
 * 观察者是Teacher,被观察者是Course
 */
public class Teacher implements Observer{
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }


    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question)arg;
        System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接收到一个"+question.getUserName()+"提交的问答:"+question.getQuestionContent());

    }
}
