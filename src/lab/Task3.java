package lab;

import common.UI;

public class Task3
{
    public static void run()
    {
        UI.putMessage("Задание 2.4 Сотрудники и отделы");

        Department d = new Department("IT");

        Employee p = new Employee("Петров", d);
        Employee k = new Employee("Козлов", d);
        Employee s = new Employee("Сидоров", d);

        d.setBoss(k);

        UI.putSuccess(p.toString());
        UI.putSuccess(k.toString());
        UI.putSuccess(s.toString());
    }
}
