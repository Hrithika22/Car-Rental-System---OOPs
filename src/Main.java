import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Car{
    private String carId;

    private String brand;

    private String model;

    private double basePricePerDay;

    private boolean isAvailable;

    public Car(String cardId, String brand,  String model, double basePricePerDay){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }
    public String getCarId(){
        return carId;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

    public double calculatePrice(int rentalDays){
        return baseProcePerDay * rentalDays;
    }
    public boolean is Available(){
        return isAvailable;
    }
    public void rent(){
        isAvailable = false;
    }
    public void returnCar(){
        isAvailable = true;
    }
}











public class Main {
   public  static void main(String[] args){
    CarRentalSystem rentalSystem = new CarRentalSystem();
    Car car1 = new Car("C001", "Toyota", "Camry", 60.0);
    Car car2 = new Car("C002", "Honda", "Accord", 70.0);
    Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);

   }
}
