package homework;

import java.util.Scanner;

public class InputString {
    public String[] inputString() {
//        Scanner in = new Scanner(System.in);
        String[] person = null;
        boolean sighn = true;
        while (sighn) {
            try {
                System.out.println("Введите следующие данные, разделенные пробелом (6 полей):");
                System.out.println("Фамилия Имя Отчество Датарождения Номер телефона Пол");
                System.out.println();
                System.out.println("Форматы данных:");
                System.out.println("фамилия, имя, отчество - строки");
                System.out.println("датарождения - строка формата dd.mm.yyyy");
                System.out.println("номертелефона - целое беззнаковое число без форматирования");
                System.out.println("пол - символ кирилицей 'м' или 'ж'.");
                System.out.println();
                Scanner in = new Scanner(System.in);
                String str = in.nextLine();
                System.out.println();

                person = str.split(" ");
                if (person.length != 6) {
                    throw new RuntimeException("Введено неверное количество полей");
                }
                sighn = false;
//                in.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
//        in.close();
        return person;
    }
}
