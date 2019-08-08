package zxc.person.design_pattern.pattern.structural.composite;

/**
 * Created by geely
 *
 * 组合模式
 * 定义：将对象组合成树形结构以表示 部分-整体 的层次结构
 *
 * 组合模式使客户端对单个对象和组合对象保持一致额方式处理
 * 类型：结构型
 *
 * 适用场景：
 * 希望客户端可以忽略组合对象于单个对象的差异时
 *
 * 处理一个树形结构
 *
 * 优点：
 * 清楚地定义分层次的复杂对象，表示对象的全部或部分层次
 * 让客户端忽略了层次的差异，方便对整个层次结构进行控制
 * 简化客户端代码
 * 符合开闭原则
 * 缺点：
 * 限制类型时会较为复杂（例如类型检查）
 * 使设计变得更加抽象
 *
 * 相关设计模式
 * 组合模式和访问者模式，可以用访问者模式，访问组合模式的结构
 *
 * 应用：
 * 例子一：
 * java.awt.Container（实现窗口，菜单；可视化）
 * 组合模式的识别：可通过行为方法识别
 * 查看add()方法
 * public Component add(Component comp) {
 *         addImpl(comp, null, -1);
 *         return comp;
 *     }
 * 增加了一个自己的父类
 *
 * 例子二：
 * java.util.HashMap的putAll()
 * public void putAll(Map<? extends K, ? extends V> m) {
 *         putMapEntries(m, true);
 *     }
 *
 * java.util.ArrayList 中addAll()方法
 * 例子三：
 * org.apache.ibatis.scripting.xmltags.SqlNode
 * sql的节点类
 * org.apache.ibatis.scripting.xmltags.MixedSqlNode
 * 组合节点的实现，相当于课程目录
 * public class MixedSqlNode implements SqlNode {
 *   private final List<SqlNode> contents;
 *
 *
 * 重点是：叶子对象，和组合对象都要实现相同的接口
 * 或继承相同的类
 *
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期",55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();



    }
}
