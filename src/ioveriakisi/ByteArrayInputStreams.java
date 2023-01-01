package ioveriakisi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputStreams {



    public static void main(String[] args) {
        byte[] dizi={1,4,3,5,7};
        ByteArrayInputStream yteArrayInputStream=new ByteArrayInputStream(dizi);
        System.out.println("Stream uzunlugu:" + yteArrayInputStream.available());
        System.out.println(yteArrayInputStream.read());
        System.out.println("Stream uzunlugu:" + yteArrayInputStream.available());
        System.out.println(yteArrayInputStream.read());
        System.out.println("Stream uzunlugu:" + yteArrayInputStream.available());
        System.out.println(yteArrayInputStream.read());
        System.out.println("Stream uzunlugu:" + yteArrayInputStream.available());
        try {
            yteArrayInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String data = "Hello America !";
        ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
        byte[] dataBytes=data.getBytes();
        try {
            byteArrayOutputStream.write(dataBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
