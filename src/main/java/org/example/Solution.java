package org.example;

class Solution
{
    public static void main(String[] args)
    {
        System.out.println("Внимание! Подготовка к концу света");
        конецСвета();
        System.out.println("Конец света успешно завершён");
    }

    public static void конецСвета()
    {
        System.out.println("Делаем что-то важное");
        поделим(0);
        System.out.println("Все отлично работает");
    }

    public static void поделим(int n)
    {
        System.out.println("Ничего страшного не произойдет: " + n);
        System.out.println(2 / n);
        System.out.println("Ничего страшного не произошло: " + n);
    }
}
