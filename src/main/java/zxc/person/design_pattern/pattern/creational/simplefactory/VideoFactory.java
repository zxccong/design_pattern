package zxc.person.design_pattern.pattern.creational.simplefactory;

public class VideoFactory {
    public Video getVideo(String type){
        //忽略大小写
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
