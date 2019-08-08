package zxc.person.design_pattern.pattern.behavioral.interpreter;

/**
 * 数字解释，转换String 为int
 */
public class NumberInterpreter implements Interpreter {

    private int number;
    public NumberInterpreter(int number){
        this.number = number;
    }
    public NumberInterpreter(String number){
        this.number = Integer.valueOf(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }

}
