package lab;

public class House
{
    private final int _floors;

    public House(int floors) throws IllegalArgumentException
    {
        if (floors < 1)
            throw new IllegalArgumentException("Число этажей не может быть меньше 1");
        _floors = floors;
    }

    public String toString()
    {
        String word;

        if (_floors % 10 == 1 && _floors != 11)
        {
            word = "этажом";
        }
        else
        {
            word = "этажами";
        }

        return String.format("Дом с %d %s", _floors, word);
    }
}
