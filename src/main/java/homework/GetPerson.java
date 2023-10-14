package homework;


import java.util.Scanner;

public class GetPerson {

    Person person;

    public Person getPerson(String[] pars) {

        Tests tests1 = new Tests();

        Scanner in = new Scanner(System.in);
        boolean sighn = true;
        boolean sighn1 = true;
        boolean sighn2 = true;
        boolean sighn3 = true;
        boolean sighn4 = true;
        boolean sighn5 = true;

//        try {
//
//            if (!tests1.isAlpha(pars[0])) {
//                throw new RuntimeException("Неверно введена фамилия");
//            }
//            ;
//            if (!tests1.isAlpha(pars[1])) {
//                throw new RuntimeException("Неверно введено имя");
//            }
//            ;
//            if (!tests1.isAlpha(pars[2])) {
//                throw new RuntimeException("Неверно введено отчество");
//            }
//            ;
//            if (!tests1.isDate(pars[3])) {
//                throw new RuntimeException("Неверно введена дата рождения");
//            }
//            ;
//            if (!tests1.isNumber(pars[4])) {
//                throw new RuntimeException("Неверно введен номер телефона");
//            }
//            ;
//            if (!tests1.isSex(pars[5])) {
//                throw new RuntimeException("Неверно введен пол");
//            }
//            ;
//            Person person = new Person(pars[0], pars[1], pars[2], pars[3], Long.parseLong(pars[4]), pars[5]);
//            new SaveToJson(person).saveToJson();
//            sighn = false;
//
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            pars[0] = in.nextLine();
//        }

        while (sighn) {
            try {
                if (!tests1.isAlpha(pars[0])) {
                    throw new RuntimeException("Неверно введена фамилия\nВведите заново, кирилицей, с большой буквы:");
                }
                sighn = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                pars[0] = in.nextLine();
            }
        }

        while (sighn2) {
            try {
                if (!tests1.isAlpha(pars[1])) {
                    throw new RuntimeException("Неверно введено имя\nВведите заново, кирилицей, с большой буквы:");
                }
                sighn2 = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                pars[1] = in.nextLine();
            }
        }

        while (sighn1) {
            try {
                if (!tests1.isAlpha(pars[2])) {
                    throw new RuntimeException("Неверно введено отчество\nВведите заново, кирилицей, с большой буквы:");
                }
                sighn1 = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                pars[2] = in.nextLine();
            }
        }

        while (sighn3) {
            try {
                if (!tests1.isDate(pars[3])) {
                    throw new RuntimeException("Неверно введена дата рождения\nВведите заново в формате ДД.ММ.ГГГГ:");
                }
                sighn3 = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                pars[3] = in.nextLine();
            }
        }

        while (sighn4) {
            try {
                if (!tests1.isNumber(pars[4])) {
                    throw new RuntimeException("Неверно введен номер телефона\nВведите заново, используя только цифры:");
                }
                sighn4 = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                pars[4] = in.nextLine();
            }
        }

        while (sighn5) {
            try {
                if (!tests1.isSex(pars[5])) {
                    throw new RuntimeException("Неверно введен пол\nВведите заново, буква м или ж");
                }
                sighn5 = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                pars[5] = in.nextLine();
            }
        }

        Person person = new Person(pars[0], pars[1], pars[2], pars[3], Long.parseLong(pars[4]), pars[5]);
        new SaveToJson(person).saveToJson();

        return person;

    }


}

