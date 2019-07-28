package zxc.person.design_pattern.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
        //建立工程的话，不用依赖具体的类
//        Video video = new PythonVideo();
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (!video.equals(null)){
            video.produce();
        }


    }
}
