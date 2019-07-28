package zxc.person.design_pattern.principle.demeter;

import java.util.ArrayList;

public class TeamLeader {

    public void checkNumberOfCourse(){
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("在线课程的数量是："+ courses.size());

    }
}
