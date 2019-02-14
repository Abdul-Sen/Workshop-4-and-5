package Workshop4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadStudents {
    public static void main(String [] args)
    {
        System.out.println("in main");
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("temp.dat"));
            int sid = is.readInt();
            String fName = is.toString();
            String lName = is.toString();
            ArrayList<String> s = new ArrayList<String>(2);

        } catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }
}
