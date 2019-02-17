package Workshop4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteStudents {

    private static Student createNewStudent() {
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

    private static void writeToFile(ArrayList<Student> list, String fileName)
    {
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
            for (Student currentStudent : list) {
                os.writeObject(currentStudent);
            }
            os.close();
        } catch (IOException ex)
        {
            ex.printStackTrace(); //TODO: Apparently this is what everyone does, ask prof what to do with catches
        }

    }

    public static void main(String [] args)
    {
       ArrayList<Student> studentArrayList = new ArrayList<Student>(4);
        Scanner mainSC = new Scanner(System.in);
        int choice =0;
        do {
            System.out.println("1- Create student\n2- Write to file\n3-View students\n4-End program");
            choice = mainSC.nextInt();
            if (choice == 1) {
                System.out.println("adding...");
                studentArrayList.add(createNewStudent());
            } else if (choice == 2) {
                System.out.println("writing...");
                writeToFile(studentArrayList,args[0]);
            } else if (choice == 3)
                System.out.println(studentArrayList);
        } while (choice != 4);
    }
}