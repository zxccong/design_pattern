package zxc.person.design_pattern.pattern.behavioral.visitor;

/**
 * Created by geely
 * 接受
 */
public abstract class Course {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void accept(IVisitor visitor);

}
