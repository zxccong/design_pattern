package zxc.person.design_pattern.principle.singleresponsibility;

/**
 * 类层面单一原则
 */
public class Bird {
    public void mainMoveMode(String birdName){
        //考虑到开发成本和开发时间，不能完全遵守单一职责原则
        if ("鸵鸟".equals(birdName)){
            System.out.println("birdName = " + birdName+"用脚走");
        }else {
            System.out.println("birdName = " + birdName+"用翅膀飞");
        }

    }

}
