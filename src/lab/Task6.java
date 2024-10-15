package lab;

import common.UI;

public class Task6
{
    public static void run()
    {
        UI.putMessage("Задание 5.1 Пистолет стреляет");

        Pistol p = new Pistol(3);

        UI.putSuccess(p.toString());

        p.fire();
        p.fire();
        p.fire();
        p.fire();
        p.fire();
    }
}
