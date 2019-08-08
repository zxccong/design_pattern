package zxc.person.design_pattern.pattern.behavioral.visitor;

/**
 * Created by geely
 * 根据不同的visitor,对相同的数据产生不同的行为
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);


}
