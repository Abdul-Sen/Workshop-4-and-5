package Workshop4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadStudents {

    public static void main(String [] args)
    {
        ArrayList<Student> studentArrayList = new ArrayList<Student>(5);
        try {
            readFile(args[0]);
        }
        catch (ClassNotFoundException | IOException ex)
        {
            ex.printStackTrace();
        }
    }


    private static ArrayList<Student> readFile(String fileName) throws IOException, ClassNotFoundException {

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));

        ArrayList<Student> studentArrayList = new ArrayList<Student>(3);
        boolean cont = true;
        while(cont)
        {
           Student s =  (Student) is.readObject();
           if(s != null)
           {
               studentArrayList.add(s);
           }
           else
           {
               cont = false;
           }
        }
        return studentArrayList;
    }

}
