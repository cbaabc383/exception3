package homework;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson {

    public void saveToJson() {
        String fileName = person.getSecondName() + ".json";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("\n");
            writer.write("<"+ person.getSecondName() + ">");
            writer.write("<" + person.getFirstName() + ">");
            writer.write("<" + person.getSurname() + ">");
            writer.write("<" + person.getBirthday() + ">");
            writer.write("<" + person.getPhoneNumber() + ">");
            writer.write("<" + person.getSex() + ">");
            writer.write("\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public SaveToJson(Person person) {
        this.person = person;
    }

    private Person person;
}
