package ATB_6X_May.Exceptions;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class Lab080 {
    public static void main(String[] args) throws IOException {
        String s1="C://DrawingClass/Maha/Appfolder";
        File file=new File(s1);
        FileImageInputStream fis = new FileImageInputStream(file); //CompileTime checked exception which is handled by using throws
        //keyword , throws keyword works only with methods
        // throws keyword works with checked exception
    }
}
