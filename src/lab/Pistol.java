package lab;

public class Pistol
{
    private int _ammo;

    public Pistol()
    {
        _ammo = 5;
    }

    public Pistol(int ammo)
    {
        if (ammo < 0)
            throw new IllegalArgumentException("Нельзя зарядить пистолет отрицательным числом патронов");
        _ammo = ammo;
    }

    public int getAmmo()
    {
        return _ammo;
    }

    public void setAmmo(int ammo)
    {
        if (ammo < 0)
            throw new IllegalArgumentException("Нельзя зарядить пистолет отрицательным числом патронов");
        _ammo = ammo;
    }

    public void fire()
    {
        if (_ammo > 0)
        {
            System.out.println("Бах!");
            _ammo--;
        }
        else
        {
            System.out.println("Клац!");
        }
    }

    public String toString()
    {
        return String.format("Пистолет заряжен %d патронами", _ammo);
    }
}
