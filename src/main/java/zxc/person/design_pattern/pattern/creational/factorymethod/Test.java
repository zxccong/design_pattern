package zxc.person.design_pattern.pattern.creational.factorymethod;

/**
 * 工厂方法
 * 定义：定义一个创建对象的接口
 * 但让实现这个接口的类来决定实例化那个类
 * 工厂方法让类的实例化推迟到子类中进行
 * 类型：创建型
 * 适用场景
 * 创建对象需要大量重复的代码
 * 客户端（应用层）不依赖于产品实例如何创建、实现细节
 *
 * 一个类通过子类类指定创建那个对象
 *
 * 优点：
 * 用户只需要关心所需产品对应的工厂，无需关心创建细节
 * 加入新产品符合开闭原则，提高可扩展性
 *
 * 缺点：
 * 类的个数容易过多，增加复杂度
 * 增加了系统抽象性和理解难度
 *
 *
 * 名词：
 * 产品是Video 实际的产品是PythonVideo,创建者VideoFactory，实际的创建者 PythonFactory
 * 四个角色
 * Ｖideo、PythonVideo、VideoFactory、PythonVideoFactory
 * 符合开闭原则，添加新语言只需要添加新的factory,新的Video
 *
 * 举例：
 * Collect中Iterator()
 * ArrayList中创建了一个内部类进行迭代
 * 抽象产品是Iterator<>（Video） 实际产品是Itr()（PythonVideo）
 * 创建者是Collect（VidveoFactory）实际的创建者ArrayList<>(PythonFactory)
 *
 * 例子二
 * URLStreamHandlerFactory(创建者VideoFactory)Launcher.Factory(PythonFactory)
 * URLStreamHandler(产品是Video) 各种Handler(实际的创建者 PythonFactory)
 *
 * 例子三
 * log4j
 * LoggerFactory 有三个实现方法对应抽象工厂，和实际
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new FEVideoFactory();
        VideoFactory videoFactory3 = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();


    }
}
