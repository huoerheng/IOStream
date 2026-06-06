package Input_Output;

import java.io.FileInputStream;
import java.io.IOException;

public class copyFile {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("file.txt");
        byte[] bytes = new byte[19];
        int len = fis.read(bytes);
        System.out.println(new String(bytes,0,len));

    }
}
