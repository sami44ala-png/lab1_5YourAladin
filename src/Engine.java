/**

 * Project: Motorcycle
 * Purpose Details: Use IntelliJ to create all the classes fields and methods needed to represent a Motorcycle
 * Course: CMPSC 221
 * Author: Samiha Aladin

 */

public class Engine
{
    private String manufacturer;
    private String fuelType;
    private int cylinders;

    public Engine(String manufacturer, String fuelType, int cylinders)
    {
        this.manufacturer = manufacturer;
        this.fuelType = fuelType;
        this.cylinders = cylinders;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getFuelType()
    {
        return fuelType;
    }

    public int getCylinders()
    {
        return cylinders;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    public void setCylinders(int cylinders)
    {
        this.cylinders = cylinders;
    }
}
