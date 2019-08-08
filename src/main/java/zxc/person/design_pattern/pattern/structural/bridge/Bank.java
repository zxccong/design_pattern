package zxc.person.design_pattern.pattern.structural.bridge;

/**
 * Created by geely
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    //不是强制一样的方法名
    abstract Account openAccount();

}
