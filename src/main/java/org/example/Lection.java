package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lection {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:/Users/Alex/Desktop/GB/Exeptions/exception3/pom.xml");
            FileWriter writer = new FileWriter("file.xml")) {
            while (reader.ready()){
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception:" + e.getClass().getSimpleName());
        } ;

        System.out.println("Copy successfully");
    }
}
