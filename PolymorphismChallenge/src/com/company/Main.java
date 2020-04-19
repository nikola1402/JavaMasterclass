package com.company;

import java.util.ArrayList;

class Car{

    String name;
    boolean engine;
    int cylinders;
    int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Engine has started.";
    }

    public String accelerate(){
        return "Car is accelerating.";
    }

    public String brake(){
        return "Car is braking";
    }
}

class Yugo extends Car{
    public Yugo() {
        super("Yugo", 4);
    }

    @Override
    public String startEngine(){
        return "Yugo engine has started";
    }

}

class Lada extends Car {
    public Lada() {
        super("Lada", 9);
    }

    @Override
    public String accelerate() {
        return "Lada is accelerating.";
    }
}

class Zastava extends Car{
    public Zastava() {
        super("Zastava", 6);
    }

    @Override
    public String brake(){
        return "Zastava is braking";
    }
}


public class Main {

    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            Car car = randomCar();
            String carName = car.getName();
            ArrayList<String> carControls = carControl(car, carName);

            if(!carControls.isEmpty()){
                System.out.println("Car name is: " +carName+
                        "\nNumber of cylinders:" +car.getCylinders()+
                        "\nNumber of wheels: "+car.getWheels());
                System.out.println("Car controls:\n"+carControls.get(0)+"\n"+carControls.get(1)+
                        "\n"+carControls.get(2)+"\n\n");
            } else {
                System.out.println("*************\nCar can't be found!\n*************");
            }
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) ((Math.random()*3)+1);
        switch (randomNumber){
            case 1:
                return new Yugo();
            case 2:
                return new Lada();
            case 3:
                return new Zastava();
            default:
                return null;
        }
    }

    public static ArrayList<String> carControl(Car car, String carName){
        ArrayList<String> controls = new ArrayList<>();
        String j, k, l;
        switch (carName){
            case "Yugo":
                j = car.startEngine();
                k = car.accelerate();
                l = car.brake();
                controls.add(j);
                controls.add(k);
                controls.add(l);
                return controls;
            case "Lada":
                j = car.startEngine();
                k = car.accelerate();
                l = car.brake();
                controls.add(j);
                controls.add(k);
                controls.add(l);
                return controls;
            case "Zastava":
                j = car.startEngine();
                k = car.accelerate();
                l = car.brake();
                controls.add(j);
                controls.add(k);
                controls.add(l);
                return controls;
        }
        return controls;
    }
}
