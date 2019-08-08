package zxc.person.design_pattern.pattern.behavioral.visitor;

/**
 * Created by geely
 * 免费课程
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
