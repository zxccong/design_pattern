package zxc.person.design_pattern.principle.openclose;

/**
 * 实现接口的基类
 */
public class JavaCourse implements ICourse {

    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
