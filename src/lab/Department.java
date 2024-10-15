package lab;

import java.util.HashSet;

public class Department
{
    private final String _name;
    private final HashSet<Employee> _members;
    private Employee _boss;

    public Department(String name)
    {
        _name = name;
        _members = new HashSet<>();
    }

    public Department(String name, Employee boss)
    {
        _name = name;
        _members = new HashSet<>();

        _boss = boss;
        _members.add(boss);
    }

    public String getName()
    {
        return _name;
    }

    public Employee getBoss()
    {
        return _boss;
    }

    public void setBoss(Employee e)
    {
        _boss = e;
        _members.add(e);
    }

    public HashSet<Employee> getEmployees()
    {
        return _members;
    }

    public void addEmployee(Employee e)
    {
        _members.add(e);
    }
}
