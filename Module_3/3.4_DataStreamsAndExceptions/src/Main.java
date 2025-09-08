import java.io.*;
import java.util.ArrayList;

class Student implements Serializable {

    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

class Course implements Serializable {

    String courseCode;
    String courseName;
    String instructor;

    public Course(String courseCode, String courseName, String instructor){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    @Override
    public String toString() {
        return "Course [Course Code=" + courseCode + ", Course Name=" + courseName + ", Instructor=" + instructor + "]";

    }
}

class Enrollment implements Serializable {
    Student student;
    Course course;
    String enrollmentDate;

    public Enrollment (Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "\nEnrollment {\nstudent = " + student + ", \ncourse = " + course + ", \nenrollmentDate = " + enrollmentDate + "\n}";
    }



}

public class Main {
    public static void main(String[] args) {


        // Setting the Data Objects:
        Student s1 = new Student(1, "Alice", 20);
        Student s2 = new Student(2, "Bob", 22);

        // Create sample courses
        Course c1 = new Course("CS101", "Introduction to Computer Science", "Dr. Smith");
        Course c2 = new Course("MATH201", "Calculus II", "Dr. Johnson");

        // Create enrollments
        Enrollment e1 = new Enrollment(s1, c1, "2025-09-08");
        Enrollment e2 = new Enrollment(s2, c2, "2025-09-08");

        // Create ArrayList to have more than one student or course
        ArrayList<Enrollment> enrollments = new ArrayList<>();
        enrollments.add(e1);
        enrollments.add(e2);


        //Creating or Setting the File with Path:
        File file = new File("enrollments.ser");



        // we can use try(try-with-resources) {}, for learning porpoise, I'm not using it to be more Readable code. try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enrollments.ser")))
        // * also closing the program because of that.
        try {
            // Serialization method, it will write the data in Bytes.
            FileOutputStream outputstream = new FileOutputStream(file);
            ObjectOutputStream object = new ObjectOutputStream(outputstream);

            // Writing the objects, which will be written in Bytes
            object.writeObject(enrollments);

            // closing the program Streams manually if we don't use try(try-with-resources) {}
            object.close();


            System.out.println("Student Class generated successfully!\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // we can use try(try-with-resources) {}, for learning porpoise, I'm not using it to be more Readable code.  try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("enrollments.ser")))
        // * also closing the program because of that.
        try {
            // DeSerialization method. to make data from enrollments.ser readable not Bytes Data
            FileInputStream  fileinputStream = new FileInputStream(file);
            ObjectInputStream object = new ObjectInputStream(fileinputStream);

            //enrollmentsList.readObject(); to print and all Data by in the List that we just wrote
            ArrayList<Enrollment>enrollmentsList = (ArrayList<Enrollment>)object.readObject();
            for(Enrollment e: enrollmentsList){
                System.out.println(e);
            }
            // * closing the program Streams manually if we don't use try(try-with-resources) {}
            object.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}



