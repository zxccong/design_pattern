package zxc.person.design_pattern.pattern.behavioral.memento;

import java.util.Stack;

/**
 * Created by justin
 * 备忘录模式：保存一个对象的某个状态，以便在适当的时候恢复对象
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento()
    {
        ArticleMemento articleMemento= ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento)
    {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }

}
