package zxc.person.design_pattern.pattern.behavioral.observer;

import java.util.Observable;

/**
 * Created by justin
 * 被观察者类 继承observable类
 *
 * 可观察 private Vector<Observer> obs;
 * java.util.Observable#addObserver(java.util.Observer)
 * 利用线程安全的Vector 添加时添加方法有同步
 *
 */
public class Course extends Observable{
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了一个问题");
        //设置改变
        setChanged();
        //通知观察者
        notifyObservers(question);
    }



}
