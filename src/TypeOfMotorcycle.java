/**

 * Project: Motorcycle
 * Purpose Details: Use IntelliJ to create all the classes fields and methods needed to represent a Motorcycle
 * Course: CMPSC 221
 * Author: Samiha Aladin

 */

public class TypeOfMotorcycle
{
    private String type;
    private String info;

    public TypeOfMotorcycle(String type, String info)
    {
        this.type = type;
        this.info = info;
    }

    public String getType()
    {
        return type;
    }

    public String getInfo()
    {
        return info;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }
}
