package zxc.person.design_pattern.principle.dependenceinversion;

/**
 *
 *
 * 高层模块：
 * 不应该依赖低层模块，就是如果要学习一门新课程不应该在修改（低层模块）
 *
 */
public class Test {
    //v1+
    /*public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyFECourse();
    }*/

    //实现高内聚，低耦合
    //v2接口注入
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyCourse(new JavaCourse());
//        geely.studyCourse(new FECourse());
//    }

        //v3构造器构造，要多次new
//    public static void main(String[] args) {
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyCourse();
//    }

    //v4set注入
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyCourse();

        geely.setiCourse(new FECourse());
        geely.studyCourse();

    }
}
