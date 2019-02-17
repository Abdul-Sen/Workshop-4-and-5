package Workshop4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteStudents {

    public Student createNewStudent() {
        int sid= 0;
        String fName, lName;
        ArrayList<String> courses = new ArrayList<String>(3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Student ID: ");
        sid = sc.nextInt();
        sc.nextLine();//consuming \n

        System.out.print("First Name: ");
        fName = sc.nextLine();
        System.out.print("Last Name: ");
        lName = sc.nextLine();

        System.out.println("Courses (E - Exit): ");

        int i=1;
        while (i != -1)
        {
            System.out.print(i + "- ");
            courses.add(sc.nextLine());
            i++;
            //Exit condition control
            if((courses.get(courses.size() -1)).toUpperCase().equals("E"))
            {
                courses.remove(courses.size()-1);
                i = -1;
            }
        }
        return new Student(sid,fName,lName,courses);
    }

    public void writeToFile(ArrayList<Student> list, String fileName) throws IOException
    {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
            for (Student currentStudent : list) {
                os.writeObject(currentStudent);
            }

            Student dummyStudent = null; //writing null because InputFileStream does not know EOF otherwise
            os.writeObject(dummyStudent);
            os.close();
    }
}