package zxc.person.design_pattern.pattern.creational.singleton;

/**
 * Created by geely
 * 枚举单例模式，用枚举保证不会被反射，序列化破坏
 *
 */
public enum EnumInstance {
    INSTANCE{
        protected  void printTest(){
            System.out.println("Geely Print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
