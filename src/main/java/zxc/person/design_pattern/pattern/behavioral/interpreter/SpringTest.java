package zxc.person.design_pattern.pattern.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Created by geely
 *
 * 适用Spring解释器的测试类
 * spel
 * spring EL 解释器
 */
public class SpringTest {
    public static void main(String[] args) {
        org.springframework.expression.ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        int result = (Integer) expression.getValue();
        System.out.println(result);

    }
}
