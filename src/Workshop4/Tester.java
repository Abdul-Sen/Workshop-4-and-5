package Workshop4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String [] args)
    {
        WriteStudents writeStudents = new WriteStudents();
        ReadStudents readStudents = new ReadStudents();
        ArrayList<Student> studentArrayList = new ArrayList<Student>(4);
        Scanner mainSC = new Scanner(System.in);
        int choice =0;

        do {
            System.out.println("1- Create student\n2- Write to file\n3- Read from file\n4- View students\n5- End program");
            choice = mainSC.nextInt();
            switch (choice){
                case 1:
                    studentArrayList.add(writeStudents.createNewStudent());
                    break;
                case 2:
                    try{
                        writeStudents.writeToFile(studentArrayList,args[0]);
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                case 3://read file
                    try {
                      studentArrayList = readStudents.readFile(args[0]);
                    }
                    catch (ClassNotFoundException | IOException ex)
                    {
                        ex.printStackTrace();
                    }
                    break;
                case 4: //display students
                    for (Student currentStudent :
                            studentArrayList) {
                        System.out.println(currentStudent);
                    }
                    break;
                case 5: //exit
                    System.out.println("Good bye!");
                    break;
                    default:
                        System.out.println("Please only select from numbers 1-5");
            }
        } while (choice != 5);
    }
}
