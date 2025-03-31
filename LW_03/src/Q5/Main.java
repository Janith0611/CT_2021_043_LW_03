package Q5;

class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public Course(String courseName, String courseCode, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Lecturer objects
        Lecturer lecturer1 = new Lecturer("Janith", "Computer Networks ");
        Lecturer lecturer2 = new Lecturer("Kamal", "Agile Development ");

        // Create Course objects
        Course course1 = new Course("OOAD", "CT22032", lecturer1);
        Course course2 = new Course("UED", "CT22031", lecturer2);

        // Create Student objects
        Student student1 = new Student("Nimal", "Bachelor of Information Communication Technology", "CT2025");
        Student student2 = new Student("Amal", "Bachelor of Information Communication Technology", "CT2025");

        // Display information
        System.out.println("Course: " + course1.getCourseName());
        System.out.println("Code: " + course1.getCourseCode());
        System.out.println("Lecturer: " + course1.getLecturer().getLecturerName());
        System.out.println("Student: " + student1.getStudentName());
        System.out.println("Degree: " + student1.getDegreeName());
        System.out.println("Course Following: " + student1.getCourseFollowing());
        System.out.println();

        System.out.println("Course: " + course2.getCourseName());
        System.out.println("Code: " + course2.getCourseCode());
        System.out.println("Lecturer: " + course2.getLecturer().getLecturerName());
        System.out.println("Student: " + student2.getStudentName());
        System.out.println("Degree: " + student2.getDegreeName());
        System.out.println("Course Following: " + student2.getCourseFollowing());
    }
}
