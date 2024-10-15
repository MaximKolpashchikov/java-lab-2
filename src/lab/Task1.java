package lab;

import common.UI;

public class Task1
{
    public static void run()
    {
        UI.putMessage("Задание 1.4 Время");

        Time t1 = new Time(10);
        Time t2 = new Time(10000);
        Time t3 = new Time(100000);

        UI.putSuccess("Текстовая форма для 10 сек - " + t1);
        UI.putSuccess("Текстовая форма для 10000 сек - " + t2);
        UI.putSuccess("Текстовая форма для 100000 сек - " + t3);
    }
}
