package ATB_6X_May.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab079 {
    public static void main(String[] args)  {
        try {
            String path="C:\\English_Classes";
            File file= new File(path);
            FileInputStream fileInput= new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("I am executing at last of file program");
        }
    }
}
