package zxc.person.design_pattern.principle.openclose;

/**
 * 接口没有变，实现类也没有变，就实现了功能
 *
 * 通过继承了基类，使得扩展是开放的
 * 不需要修改原有的的类
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }


    /**
     * 打折，返回折后价
     * @return
     */
    @Override
    public Double getPrice() {
//        if (super.getPrice()>300)

        return super.getPrice() * 0.8;
    }
}
