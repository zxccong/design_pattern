package zxc.person.design_pattern.pattern.behavioral.state;

/**
 * Created by geely
 * 课程视频状态
 */
public abstract class CourseVideoState {
    //视频上下文
    protected CourseVideoContext courseVideoContext;

    //设置视频上下文
    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();

}
