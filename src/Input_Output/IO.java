package Input_Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        System.out.println("当前工作目录：" + System.getProperty("user.dir"));
        //路径 / File对象都可以，但是父级路径必须存在，如果文件已存在就会清空内容,同一个new对象会继续write
        //默认关闭，开启续写true
      /*  FileOutputStream fos = new FileOutputStream("file.txt",true);
        //write方法的参数是数字，都是对应ASCII的字符
        String str = "hello world \r\n666";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.write(bytes,1,3);
        fos.close();*/

        /*FileInputStream fi = new FileInputStream("file.txt");
        int b;
        while ((b = fi.read()) != -1) {
            System.out.print((char) b);
        }
        fi.close();*/



        long l = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream("c.txt");
        FileInputStream fis = new FileInputStream("file.txt");
        int b;
        while ((b=fis.read()) != -1){
            fos.write(b);
        }

        fos.close();
        fis.close();
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l);

    }
}
