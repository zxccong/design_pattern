package zxc.person.design_pattern.pattern.behavioral.memento;

/**
 * Created by justin
 * 备忘录模式
 * 定义保存一个对象的某个状态，以便在适当的时候恢复对象、
 * “后悔药”
 *
 * 使用场景
 * 保存及恢复数据业务场景
 * 后悔的时候，即想恢复到之前的状态
 * 优点：
 * 为用户提供一种可恢复机制
 * 存档信息的封装
 * 缺点：
 * 资源占用
 *
 * 相关的设计模式
 * 备忘录模式（实例表示状态）和状态模式（类表示状态）
 *
 * 应用
 * 不常用，作者没找到
 * 例子一：spring webflow
 * org.springframework.binding.message.StateManageableMessageContext#createMessagesMemento()
 *
 *
 *
 *
 *
 *
 */
public class Test {

    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article= new Article("如影随行的设计模式A","手记内容A","手记图片A");

        ArticleMemento articleMemento = article.saveToMemento();

        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题:"+article.getTitle()+" 内容:"+article.getContent()+" 图片:"+article.getImgs()+" 暂存成功");

        System.out.println("手记完整信息:"+article);


        System.out.println("修改手记start");

        article.setTitle("如影随行的设计模式B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");

        System.out.println("修改手记end");

        System.out.println("手记完整信息:"+article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);



        article.setTitle("如影随行的设计模式C");
        article.setContent("手记内容C");
        article.setImgs("手记图片C");

        System.out.println("暂存回退start");

        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);



        System.out.println("暂存回退end");
        System.out.println("手记完整信息:"+article);

    }
}
