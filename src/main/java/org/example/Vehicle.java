package org.example;
import java.util.Calendar;
public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public Vehicle(String brand, String model, int year) throws InvalidYearException {
        //check validasi year kondisi year input < tahun sekarang
        Calendar cal = Calendar.getInstance();
        int tahunSekarang = cal.get(Calendar.YEAR);
        if (year > tahunSekarang) {
            throw new InvalidYearException("Year input harus lebih kecil dari tahun sekarang");
        }
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String vehicleSound() {
        return "Vehicle (" + this.brand + ", " + this.model + ", " + this.year + "): Beep..beep...";
    }
}
class Car extends Vehicle {
    public int numOfDoors;
    public Car(String brand, String model, int year) throws InvalidYearException {
        super(brand, model, year);
    }
    @Override
    public String vehicleSound() {
        return "Car (" + this.brand + ", " + this.model + ", " + this.year + "): brummm...brummm";
    }
}
class Motorcycle extends Vehicle {
    public String sideCar;
    public Motorcycle(String brand, String model, int year) throws InvalidYearException {
        super(brand, model, year);
    }
    @Override
    public String vehicleSound() {
        return "Motorcycle (" + this.brand + ", " + this.model + ", " + this.year + "): ngeeng...ngeeeng...";
    }
}
class InvalidYearException extends Exception {
    public InvalidYearException(String errorMessage) {
        super(errorMessage);
    }
}
class vehicle1 {
    public static void main(String[] args) {
        Vehicle vehicle = null;
        Car car = null;
        Motorcycle motorcycle = null;
        try {
            vehicle = new Vehicle("Honda", "Sedan", 2021);
            car = new Car("Honda", "Civic", 2020);
            motorcycle = new Motorcycle("Yamaha", "Aerox", 2020);
        } catch (InvalidYearException e) {
            System.out.println("Year input harus lebih kecil dari tahun sekarang");
        } finally {
            if (vehicle != null) {
                vehicle1.makeSound(vehicle);
            } else {
                System.out.println("Vehicle gagal dibuat");
            }
            if (car != null) {
                vehicle1.makeSound(car);
            } else {
                System.out.println("Car gagal dibuat");
            }
            if (motorcycle != null) {
                vehicle1.makeSound(motorcycle);
            } else {
                System.out.println("Motorcycle gagal dibuat");
            }
        }
    }
    public static void makeSound(Vehicle vehicle) {
        String result = vehicle.vehicleSound();
        System.out.println(result);
    }
}