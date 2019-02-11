package Workshop4;

import java.io.Serializable;
import java.util.ArrayList;


public class Student implements Serializable {
    private int stdID;
    private String firstName;
    private String lastName;
    private ArrayList<String> courses;

    public Student(int stdID, String firstName, String lastName) {
        this.stdID = stdID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String course)
    {
        getCourses().add(course);
    }

    public Student(int stdID, String firstName, String lastName, ArrayList<String> courses) {
        this.stdID = stdID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
    }
    public Student(){
        this(0,"","",null);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdID=" + stdID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + courses +
                '}';
    }
}
