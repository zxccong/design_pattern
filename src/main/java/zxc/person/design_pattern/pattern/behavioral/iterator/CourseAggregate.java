package zxc.person.design_pattern.pattern.behavioral.iterator;

/**
 * Created by geely.
 * 对课程的处理
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
