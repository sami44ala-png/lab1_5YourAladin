/**

 * Project: Motorcycle
 * Purpose Details: Use IntelliJ to create all the classes fields and methods needed to represent a Motorcycle
 * Course: CMPSC 221
 * Author: Samiha Aladin

 */

public class Main
{
    public static void main(String[] args)
    {
        Engine engine1 = new Engine("Honda", "Gasoline", 2);
        TypeOfMotorcycle type1 = new TypeOfMotorcycle("Sport", "Designed for performance and speed");

        Motorcycle bike1 = new Motorcycle("Honda", "CB500F", 2024, "Red", 7200.00, engine1, type1);

        Engine engine2 = new Engine("Harley-Davidson", "Gasoline", 2);
        TypeOfMotorcycle type2 = new TypeOfMotorcycle("Cruiser", "Designed for comfort");

        Motorcycle bike2 = new Motorcycle("Harley-Davidson", "Sportster", 2023, "Black", 11500.00, engine2, type2);

        Engine engine3 = new Engine("Kawasaki", "Gasoline", 2);
        TypeOfMotorcycle type3 = new TypeOfMotorcycle("Touring", "Designed for longer trips");

        Motorcycle bike3 = new Motorcycle("Kawasaki", "Versys 650", 2025, "Green", 8900.00, engine3, type3);

        printMotorcycle(bike1);
        printMotorcycle(bike2);
        printMotorcycle(bike3);
    }

    private static void printMotorcycle(Motorcycle bike)
    {
        System.out.println("\n===== MOTORCYCLE DETAILS =====");
        System.out.println("Make: " + bike.getMake());
        System.out.println("Model: " + bike.getModel());
        System.out.println("Year: " + bike.getYear());
        System.out.println("Color: " + bike.getColor());
        System.out.println("Price: $" + bike.getPrice());

        Engine engine = bike.getEngine();
        System.out.println("Engine Manufacturer: " + engine.getManufacturer());
        System.out.println("Fuel Type: " + engine.getFuelType());
        System.out.println("Cylinders: " + engine.getCylinders());

        TypeOfMotorcycle type = bike.getTypeOfMotorcycle();
        System.out.println("Type: " + type.getType());
        System.out.println("Info: " + type.getInfo());
        System.out.println("==============================");
    }
}