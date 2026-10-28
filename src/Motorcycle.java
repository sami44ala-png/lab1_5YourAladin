/**

 * Project: Motorcycle
 * Purpose Details: Use IntelliJ to create all the classes fields and methods needed to represent a Motorcycle
 * Course: CMPSC 221
 * Author: Samiha Aladin

 */

public class Motorcycle
{
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    private Engine engine;
    private TypeOfMotorcycle typeOfMotorcycle;

    public Motorcycle(String make, String model, int year,
                      String color, double price, Engine engine,
                      TypeOfMotorcycle typeOfMotorcycle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.engine = engine;
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public String getColor()
    {
        return color;
    }

    public double getPrice()
    {
        return price;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public TypeOfMotorcycle getTypeOfMotorcycle()
    {
        return typeOfMotorcycle;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public void setTypeOfMotorcycle(TypeOfMotorcycle typeOfMotorcycle)
    {
        this.typeOfMotorcycle = typeOfMotorcycle;
    }
}
