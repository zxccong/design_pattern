package zxc.person.design_pattern.principle.dependenceinversion;

/**
 *
 *  * 依赖倒置原则
 *  * 定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象
 *  * 抽象不应该依赖细节，细节应该依赖抽象
 *  * 针对接口编程，不要针对现实编程
 *  * 优点，减小类之间的耦合程度、提高系统的稳定性，提高代码的可读性
 *  * 和可维护性，可降低修改程序所造成的风险
 *
 * 低层模块
 *
 *
 */
public class Geely {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }

    /*public void studyJavaCourse(){
        System.out.println("Geely在学习Java课程");
    }

    public void studyFECourse(){
        System.out.println("Geely学习FE课程");
    }*/
    //要不断修改
//    public void studyPythonCourse(){
//        System.out.println("Geely学习Python课程");
//    }
}
