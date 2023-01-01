package ioveriakisi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreams {
    public static void main(String[] args) {
        String metinFile="Outputstream icine ekle.\ndevam et\n";
        try {
            FileOutputStream output= new FileOutputStream("src/ioveriakisi/patika2.txt",true);
            byte[] text=metinFile.getBytes();
            output.write(text);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
