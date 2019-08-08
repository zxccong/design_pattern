package zxc.person.design_pattern.pattern.behavioral.interpreter;

/**
 * 乘法解释
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;
    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
