package zxc.person.design_pattern.pattern.structural.flyweight;

/**
 * Created by geely
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }
    //无论怎么创建，都不在内部不发生改变的，内部状态
    private String title = "部门经理";
    //外部传入，外部状态
    private String department;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }


}
