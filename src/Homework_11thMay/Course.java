package Homework_11thMay;

public class Course {
    String courseName;
    String courseID;
    int coursePrice;
    String courseAuthor;
    int maxStudents;
    int enrolledStudents;


    public Course(){
        System.out.println("Default Course Constructor");
    }
    public Course(String courseName, String courseID, int coursePrice, String courseAuthor, int maxStudents) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.coursePrice = coursePrice;
        this.courseAuthor = courseAuthor;
        this.maxStudents = maxStudents;
        this.enrolledStudents =0;
    }

    void displayInfo(){
        System.out.println("CourseName: "+courseName);
        System.out.println("CourseID: "+courseID);
        System.out.println("CoursePrice: "+coursePrice);
        System.out.println("CourseAuthorName: "+courseAuthor);
        System.out.println("Max Students for this course: "+maxStudents);
    }

    void enrollStudents(){
        if(enrolledStudents<maxStudents){
            enrolledStudents++; //1,2,3,4,5
            System.out.println("Student "+(enrolledStudents)+" is enrollment successfully");
        }
        else{
            System.out.println("Sorry ,the course is full, cant enroll more students");
        }
    }

    void dropStudents(){
        if(enrolledStudents>0){
            System.out.println("Student "+enrolledStudents+" has got deleted");//5
            enrolledStudents--;
        }
        else{
            System.out.println("No students enrolled in the course.");
        }
    }




}
