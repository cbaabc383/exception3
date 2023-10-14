package org.example;

public class My {
    public static void main(String[] args) {

        try {
            String str = "ASugy";

            if (str.length() <3) {
                throw new Exception("< 3");
            }
            if (str.length() > 10) {
                throw new Exception("> 10");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("URA");

    }
}
