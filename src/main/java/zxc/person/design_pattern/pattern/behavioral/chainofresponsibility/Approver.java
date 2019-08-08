package zxc.person.design_pattern.pattern.behavioral.chainofresponsibility;

/**
 * Created by geely
 * 审核人抽象类，批准者
 * 有的地方命名为Handler
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }
    public abstract void deploy(Course course);
}
