package zxc.person.design_pattern.principle.singleresponsibility;

/**0
 * 类的单一职责原则+
 */
public class Method {
    //模拟更新用户信息
    private void updateUserInfo(String userName ,String address){
        userName = "geely";
    }

    //
    private void updateUserInfo(String userName,String... properties){
        userName = "geely";

    }

    private void updateUserName(String userName ){
        userName = "geely";
    }

    private void updateUserAddress(String address){
        address = "beijing";
    }

    /**
     * 如果使用flag，单一原则建议拆开
     * @param userName
     * @param address
     * @param flag
     */
    private void updateUserInfo(String userName ,String address,boolean flag){

        if (flag){

        }else {

        }
        userName = "geely";
    }

}
