package ioveriakisi;

import java.io.File;
import java.io.IOException;

/**
 * Byte Stream : grafik, ses, video vb harici karakter tipli dosyalari byte byte cagirir/yazar
 * Abstract InputStream ve Outputstream siniflarindan kalitilirlar.
 * Character Stream: Tek veri karakterini okur/yazar. Reader veya Writer abstract classlardan kalitilirlar
 */
public class StreamOne {
    public static void main(String[] args) throws IOException {
        File dir=new File("test/path/test");
        dir.mkdirs();
        File f= new File("test/path/test/patika.txt");
        try {
            if(f.createNewFile()){
                System.out.println(f.getName()+" was created");
            }else{
                System.out.println(f.getName()+" already exists.");
            }
            System.out.println("Files in the directory:" + dir.getAbsolutePath());
            for (String str: dir.list()) {
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch(NullPointerException e){
            e.printStackTrace();
        }

    }
}
