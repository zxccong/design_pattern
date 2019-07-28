package zxc.person.design_pattern.principle.demeter;

public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        //违背了迪米特法则（最小知道原则）
//        ArrayList<Course> courses = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courses.add(new Course());
//        }
        teamLeader.checkNumberOfCourse();
    }
}
