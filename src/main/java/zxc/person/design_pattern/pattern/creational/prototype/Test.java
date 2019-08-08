package zxc.person.design_pattern.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by geely
 *
 * 原型模式
 * 定义：指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 不需要知道创建细节，不调用构造函数
 * 类型创建性
 *
 * 适用场景：
 * 类初始化消耗资源较多
 * new 产生的一个对象需要非常繁琐的过程（数据准备访问权限等等）
 * 构造函数比较复杂
 * 循环体中产生大量对象时
 *
 * 优点
 * 原型模式性能比直接new 一个对象性能高
 * 简化创建过程
 *
 * 缺点
 * 必须配备克隆方法
 * 对克隆复杂对象或对克隆出的对象进行复杂改造时，容易引入风险
 * 深拷贝、浅拷贝要运用得当
 *
 *  应用:
 *  Object中的clone 方法
 *  protected native Object clone() throws CloneNotSupportedException;
 *  ArrayList、HashMap类都继承了Cloneable接口
 *  org.apache.ibatis.CacheKey
 *
 *
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail);
        for(int i = 0;i < 10;i++){
            Mail mailTemp = (Mail) mail.clone();        //克隆不调用构造函数
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@imooc.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:"+mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);

        /**
         * 自己添加的测试ArrayList的浅拷贝
         */
//        ArrayList<Date> arrayList = new ArrayList<>();
//        arrayList.add(new Date());
//        arrayList.add(new Date());
//        ArrayList<Date> clone = (ArrayList<Date>) arrayList.clone();
//        clone.remove(1);
//        System.out.println(clone);
//        System.out.println(arrayList);


    }
}
