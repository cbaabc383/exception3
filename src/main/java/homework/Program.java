package homework;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        String gron1 = "Гронский Алексей Викторович 04.05.1976 89081709035 м";
        String gron2 = "Гронский Сергей Алексеевич 26.07.2005 89001234567 м";
        String litv = "Литвинова Елена Викторовна 29.08.1972 89515548791 ж";

//        String abc = new GetString().getString();
//        String[] abcd = new Separation().separation(abc);
//        try {
//            if (abcd.length != 6){
//                throw new RuntimeException("Введено неверное количество полей");
//            }
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//            abc = new GetString().getString();
//        }
//        Person abcde = new GetPerson().getPerson(abcd);

//        Person abc = new GetPerson().getPerson(new Separation().separation(new GetString().getString()));
//        System.out.println(abc);

//        Person gr1 = new GetPerson().getPerson(new Separation().separation(gron1));
//        System.out.println(gr1);
//
//        Person gr2 = new GetPerson().getPerson(new Separation().separation(gron2));
//        System.out.println(gr2);
//
//        Person lit = new GetPerson().getPerson(new Separation().separation(litv));
//        System.out.println(lit);

//        new SaveToJson(abc).saveToJson();
//        new SaveToJson(gr1).saveToJson();
//        new SaveToJson(gr2).saveToJson();
//        new SaveToJson(lit).saveToJson();
//
        //String []a = str.split(" ");

        //new SaveToJson(new GetPerson().getPerson(new InputString().inputString())).saveToJson();

        String []person = new InputString().inputString();
        Person person1 = new GetPerson().getPerson(person);

//        Scanner aaa = new Scanner(System.in);
////        if (aaa.hasNextLine()) {
//            String str = aaa.nextLine();
//            System.out.println(str);
////        }

    }

//    private static String getString() {
//        System.out.println("Введите следующие данные, разделенные пробелом:");
//        System.out.println("Фамилия Имя Отчество Датарождения Номер телефона Пол");
//        System.out.println();
//        System.out.println("Форматы данных:");
//        System.out.println("фамилия, имя, отчество - строки");
//        System.out.println("датарождения - строка формата dd.mm.yyyy");
//        System.out.println("номертелефона - целое беззнаковое число без форматирования");
//        System.out.println("пол - символ кирилицей 'м' или 'ж'.");
//        System.out.println();
//        Scanner in = new Scanner(System.in);
//        String per = in.nextLine();
//        System.out.println();
//        in.close();
//        return per;
//    }
//    public static Person getPerson(String[] pars) {
//        Person person = new Person(pars[0], pars[1], pars[2], pars[3], Long.parseLong(pars[4]), pars[5]);
//        return person;
//    }
//
//    private static String[] separation(String string) {
//        String[] split = string.split(" ");
//        return split;
//    }





}
