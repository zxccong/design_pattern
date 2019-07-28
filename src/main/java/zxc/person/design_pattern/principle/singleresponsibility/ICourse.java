package zxc.person.design_pattern.principle.singleresponsibility;

/**
 * 接口层面单一职责
 */
public interface ICourse {
    //有两个职责，不符合单一职责
    String getCourseName();

    byte[] getCourseVideo();

    //学习课程
    void studyCourse();
    //退款
    void refundCourse();
}
