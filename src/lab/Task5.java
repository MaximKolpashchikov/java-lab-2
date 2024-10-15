package lab;

import common.UI;

public class Task5
{
    public static void run()
    {
        UI.putMessage("Задание 4.3 Создаем Дом");

        House h1 = new House(2);
        House h2 = new House(35);
        House h3 = new House(91);

        UI.putSuccess(h1.toString());
        UI.putSuccess(h2.toString());
        UI.putSuccess(h3.toString());
    }
}
