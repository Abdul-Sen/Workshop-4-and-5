package Workshop4;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WriteStudents {

    public static void main(String [] args)
    {
        ArrayList<String> courses = new ArrayList<String>(Arrays.asList("BCI433","WEB422","JAC444"));
        Student Abdul = new Student(22,"Abdul Rehman","Jahangir",courses);
        System.out.println(Abdul);
        //create input stream here
    }
}
