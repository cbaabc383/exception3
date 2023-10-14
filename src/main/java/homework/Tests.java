package homework;

public class Tests {
    public boolean isAlpha(String s)
    {
        if (s == null) {
            return false;
        }
        if (s.length() < 1)
            return false;

        char c = s.charAt(0);
        if (!(c >= 'А' && c <= 'Я'))
            return false;

        for (int i = 1; i < s.length(); i++)
        {
            c = s.charAt(i);
            if (!(c >= 'а' && c <= 'я'))
                return false;
        }
        return true;
    }

    public boolean isDate(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() != 10){
            return false;
        }
        if (s.charAt(2) != '.' && s.charAt(5) != '.'){
            return false;
        }

        for (int i = 0; i < 1; i++)
        {
            char c = s.charAt(i);
            c = s.charAt(i);
            if (!(c >= '0' && c <= '9'))
                return false;}

        for (int i = 3; i < 4; i++)
        {
            char c = s.charAt(i);
            c = s.charAt(i);
            if (!(c >= '0' && c <= '9'))
                return false;}

        for (int i = 6; i < 9; i++)
        {
            char c = s.charAt(i);
            c = s.charAt(i);
            if (!(c >= '0' && c <= '9'))
                return false;}

        return true;
    }

    public boolean isSex(String s){
        if (s == null) {
            return false;
        }
        if (s.length() != 1){
            return false;
        }
        if (!(s.equals("м") || s.equals("ж"))){
            return false;
        }
        return true;
    }

    public boolean isNumber(String s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            c = s.charAt(i);
            if (!(c >= '0' && c <= '9'))
                return false;}
        return true;
    }
}
