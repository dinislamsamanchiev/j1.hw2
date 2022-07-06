public class Main {
    public static void main(String[] args) {
        System.out.println(student(15,33));
        System.out.println(student(24,23));
        System.out.println(student(12,43));
        System.out.println(student(22,23));
        System.out.println(student(12,23));
    }

    private static String student(int age, int temp) {
        String home = "оставайтесь дома";
        String GoHome = "можете идти гулять";
        if (age>20&&age<45&&temp>-20&&temp<30){
            return GoHome;
        }else if (age<20&&temp>0 &&temp<28) {
            return GoHome;
        }else if (age>45&&temp>-10&&temp<25){
            return GoHome;
        }else
            return home;
    }
}