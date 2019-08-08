package zxc.person.design_pattern.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * 表达式解释
 */
public class GeelyExpressionParser {

    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for(String symbol: strItemArray){
            //如果不是运算符
            if(!OperatorUtil.isOperator(symbol)){
                Interpreter numberInterpreter = new NumberInterpreter(symbol);
                stack.push(numberInterpreter);
                System.out.println(String.format("入栈：%d",numberInterpreter.interpret()));
            }else{
                //是运算符，开始运算
                Interpreter first = stack.pop();
                Interpreter second = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d",first.interpret(),second.interpret()));
                Interpreter op = OperatorUtil.getExpressionObj(first,second,symbol);
                int result = op.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.printf(String.format("阶段结果入栈：%d", resultExpression.interpret()));

            }
        }
        int result = stack.pop().interpret();
        return result;
    }
}
