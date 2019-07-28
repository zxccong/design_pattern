package zxc.person.design_pattern.principle.demeter;

/**
 * 迪米特原则
 * 定义：一个对象应该对其他对象保持最小知道，又叫最小知道原则
 * 尽量降低类于类之间的耦合
 * 优点：降低类之间的耦合
 *
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
