package lab;

import java.util.HashSet;

public class Employee
{
    private final String _name;
    private Department _part;

    public Employee(String name)
    {
        _name = name;
    }

    public Employee(String name, Department part)
    {
        _name = name;
        _part = part;
        part.addEmployee(this);
    }

    public String getName()
    {
        return _name;
    }

    public Department getDepartment()
    {
        return _part;
    }

    public void setDepartment(Department d)
    {
        _part = d;
        d.addEmployee(this);
    }

    public HashSet<Employee> getColleagues()
    {
        if (_part != null)
        {
            return _part.getEmployees();
        }
        else
        {
            return new HashSet<>();
        }
    }

    public String toString()
    {
        String res = _name;

        if (_part != null)
        {
            Employee boss = _part.getBoss();

            if (boss == this)
            {
                res += String.format(", начальник отдела %s", _part.getName());
            }
            else
            {
                res += String.format(", работает в отделе %s", _part.getName());

                if (boss != null)
                {
                    res += String.format(", начальник которого %s", boss.getName());
                }
            }
        }

        return res;
    }
}
