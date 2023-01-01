package ioveriakisi;

import java.io.*;

public class Serializations {
    public static void main(String[] args) {
        /**
         * Nesnelerin JVM disinda kullanilmasi durumunda kullanilir.
         * ObjectOutputStream ve ObjectInputStream ile nesne seriallestirilmeleri yapilir.
         */
        CarSerial c1= new CarSerial("Audi","A3");

        try {
            FileOutputStream outputFile= new FileOutputStream("car.txt");
            ObjectOutputStream outputStream= new ObjectOutputStream(outputFile);
            outputStream.writeObject(c1);
            outputFile.close();
            FileInputStream inputFile= new FileInputStream("car.txt");
            ObjectInputStream objectInput=new ObjectInputStream(inputFile);
            CarSerial newCar=(CarSerial) objectInput.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
            inputFile.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
