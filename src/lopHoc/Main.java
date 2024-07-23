package lopHoc;
public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java", 145);
        Student student = new Student("duckhanh",19,"12345987");
        Student student1 = new Student("duckhanhhh",20,"12345");
        course.addStudent(student);
        course.addStudent(student1);
        course.show();

    }
}
