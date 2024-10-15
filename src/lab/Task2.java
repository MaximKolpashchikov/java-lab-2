package lab;

import common.UI;

public class Task2
{
    public static void run()
    {
        UI.putMessage("Задание 1.5 Дом");

        House h1 = new House(1);
        House h2 = new House(5);
        House h3 = new House(23);

        UI.putSuccess(h1.toString());
        UI.putSuccess(h2.toString());
        UI.putSuccess(h3.toString());
    }
}
