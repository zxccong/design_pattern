package zxc.person.design_pattern.pattern.behavioral.interpreter;

public class OperatorUtil {
    public static boolean isOperator(String s){
        return s.equals("+") || s.equals("*");
    }

    public static Interpreter getExpressionObj(Interpreter first, Interpreter second, String s){

        if(s.equals("+")){
            return new AddInterpreter(first,second);

        }else if(s.equals("*")){
            return new MultiInterpreter(first,second);
        }
        return null;
    }
}
