package lab;

import common.UI;

public class Task4
{
    public static void run()
    {
        UI.putMessage("Задание 3.4 Сотрудники и отделы");

        Department it = new Department("IT");
        UI.putSuccess("Создан отдел IT");

        Department hrm = new Department("HRM");
        UI.putSuccess("Создан отдел HRM");

        Employee e1 = new Employee("Петров", it);
        Employee e2 = new Employee("Козлов", it);
        Employee e3 = new Employee("Сидоров", it);

        it.setBoss(e2);
        UI.putSuccess("Босс отдела IT - " + e2.getName());

        Employee e4 = new Employee("Аванесов", hrm);
        Employee e5 = new Employee("Михайлова", hrm);
        Employee e6 = new Employee("Двачевская", hrm);

        hrm.setBoss(e6);
        UI.putSuccess("Босс отдела HRM - " + e6.getName());

        UI.putSuccess("Сотрудники отделе IT:");
        for (Employee e: e2.getColleagues()) System.out.println(e.getName());

        UI.putSuccess("Сотрудники отделе HRM:");
        for (Employee e: e6.getColleagues()) System.out.println(e.getName());
    }
}
