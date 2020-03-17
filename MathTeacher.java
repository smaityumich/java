class Teacher {
    String designation = "Teacher";
    String collage = "UMich";

    void does(){
        System.out.println("Teaching");
    }
}

public class MathTeacher extends Teacher {
    String mainSubject = "Math";
    public static void main(String[] args) {
        MathTeacher obj = new MathTeacher();
        System.out.println(obj.collage);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}