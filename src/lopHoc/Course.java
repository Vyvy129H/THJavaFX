package lopHoc;

import lopHoc.Student;

public class Course {
    private String courseName;
    private int CourseID;
    private Student[] students;

    public Course(String courseName, int courseID){
        this.courseName = courseName;
        this.CourseID = courseID;
        this.students = new Student[0];
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseID() {
        return CourseID;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student[] addStudent(Student student){
        Student[] newStudents = new Student[students.length + 1];
        newStudents[0] = student;
        for (int i = 0; i < students.length; i++) {
            newStudents[i +1] = students[i];
        }
        students = newStudents;
        return students;

    }
    public void show(){
        if (students.length == 0) {
            System.out.println("Không có học viên nào trong khóa học này.");
        } else {
            System.out.printf("Danh sách các học viên trong khoá học :  " + "\n");
            for (int i = 0; i < students.length; i++) {
                System.out.println("  Tên học viên  "+ students[i].getName() + "  Tuổi: " + students[i].getAge() + "  Ma SV:  " + students[i].getStudentID() +"  Học khoá học "+ courseName );
            }
        }
    }

}
