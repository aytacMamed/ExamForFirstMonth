public class Vehicle {
    private String make;
    private String color;
    private int year;
    private String model;

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public  void printDetails(){
        System.out.println("Istehsalci Sirket " + make );
        System.out.println("Reng: " +color);
        System.out.println("Il: " +year);
        System.out.println("Model: " +model);
    }
}
