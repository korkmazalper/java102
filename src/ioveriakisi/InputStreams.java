package ioveriakisi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreams {
    public static void main(String[] args)
    {
        /**
         * InputStream - > FileInputStream, ByteArrayInputStream, ObjectInputStream
         */
        String path="src/ioveriakisi/patika.txt";
        try {
            FileInputStream fileInput= new FileInputStream(path);
            System.out.println("Number of not read Bytes in file:" + fileInput.available());
            int i=fileInput.read();
            while(i!=-1){
                if( (char) i==' '){
                    System.out.println("\n");
                }else{
                    System.out.print((char)i);
                }


                i=fileInput.read();
            }
            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
