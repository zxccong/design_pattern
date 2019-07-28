package zxc.person.design_pattern.principle.openclose;

public class Test {
    public static void main(String[] args) {
//        ICourse javaCourse = new JavaCourse(96, "123 ", 368d);
        ICourse javaCourse = new JavaDiscountCourse(96, "123 ", 368d);
        //dubugger 双击对象 alt+F8 打开Evaluate Expression页面 instanceof JavaCourse
        System.out.println("javaCourse(调用子类方法获得折扣价) = " + javaCourse.getPrice());
        Double originPrice = ((JavaDiscountCourse) javaCourse).getOriginPrice();
        System.out.println("originPrice(调用新增方法获得原价) = " + originPrice);
        System.out.println("javaCourse = " + javaCourse);
    }
}
