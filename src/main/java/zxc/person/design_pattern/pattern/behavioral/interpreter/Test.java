package zxc.person.design_pattern.pattern.behavioral.interpreter;

/**
 * 解析器模式
 * 定义：给定一种语言，定义它的文法的一种表示，并定义一个解析器，这个解析器使用该表示来解析语言中的句子
 * 为了解释一种语言，而为语言创建的解析器
 *
 * 适用场景：
 * 某个特定类型问题发生的频率足够高（日常开发中应用小）
 * 优点：
 * 语法由很多类表示，容易改变及扩展此语言
 * 缺点：
 * 当语法规则数目太多时，增加了系统复杂度
 * 相关设计模式
 * 解释器模式（要预先知道规则并写在代码中）和适配器模式（预先不需要知道规则）
 *
 * 应用
 * 例子一：jdk中的正则表达式
 * java.util.regex.Pattern
 *
 * 例子二：spring的EL表达式
 * 例子看interpreter.SpringTest
 * org.springframework.expression.common.TemplateAwareExpressionParser#parseExpressions(java.lang.String, org.springframework.expression.ParserContext)
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        String geelyInputStr = "6 100 11 + *"; //运算规则 （100+11）*6
        GeelyExpressionParser expressionParser = new GeelyExpressionParser();
        int result = expressionParser.parse(geelyInputStr);
        System.out.printf("解释器计算结果"+result);
    }
    /**
     * 函数运行结果
     *
     * 入栈：6
     * 入栈：100
     * 入栈：11
     * 出栈：11 和 100
     * 阶段结果入栈：111出栈：111 和 6
     * 阶段结果入栈：666解释器计算结果666
     */
}
