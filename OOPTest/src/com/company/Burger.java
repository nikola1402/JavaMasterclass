package com.company;

/**
 * Created by nikol on 10-Dec-17.
 */
public class Burger {

    private String breadRoll;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean pickle;

    // Prices
    private double burgerPrice;
    private double breadRollPrice;
    private double meatPrice;
    private double totalPrice;

    public Burger(String breadRoll, String meat) {
        this.totalPrice = 0.0d;
        breadRollPrice = chooseBread(breadRoll);
        meatPrice = chooseMeat(meat);
        this.burgerPrice = breadRollPrice + meatPrice;
        this.totalPrice += burgerPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setBreadRoll(String breadRoll) {
        this.breadRoll = breadRoll;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setPickle(boolean pickle) {
        this.pickle = pickle;
    }

    public void setBreadRollPrice(double breadRollPrice) {
        this.breadRollPrice = breadRollPrice;
    }

    public void setMeatPrice(double meatPrice) {
        this.meatPrice = meatPrice;
    }


    public double chooseMeat(String meat){
        switch (meat){
            case "Lamb":
                System.out.println("Burger meat is lamb. Price: 1.0$");
                setMeat(meat);
                setMeatPrice(1.0d);
                return 1.0d;
            case "Cow":
                System.out.println("Burger meat is cow. Price: 1.1$");
                setMeat(meat);
                setMeatPrice(1.1d);
                return 1.1d;
            case "Pig":
                System.out.println("Burger meat is pig. Price: 0.9$");
                setMeat(meat);
                setMeatPrice(0.9d);
                return 0.9d;
        }
        System.out.println("No such meat! Choose again.");
        setMeatPrice(0d);
        return 0d;
    }

    public double chooseBread(String breadRoll){
        switch (breadRoll){
            case "White":
                System.out.println("Burger bread is white. Price: 0.5$");
                setBreadRoll(breadRoll);
                setBreadRollPrice(1.0d);
                return 1.0d;
            case "Black":
                System.out.println("Burger bread is black. Price: 0.8");
                setBreadRoll(breadRoll);
                setBreadRollPrice(1.1d);
                return 1.1d;
        }
        System.out.println("No such bread! Choose again.");
        return 0.0d;
    }

    public void addLettuce(){
        setLettuce(true);
        totalPrice += 0.2d;
        System.out.println("Lettuce added. Price: 0.2$");
    }

    public void addTomato(){
        setTomato(true);
        totalPrice += 0.3d;
        System.out.println("Tomato added. Price: 0.3$");
    }

    public void addCheese(){
        setCheese(true);
        totalPrice += 0.4d;
        System.out.println("Cheese added. Price: 0.4$");
    }

    public void addPickle(){
        setPickle(true);
        totalPrice += 0.1d;
        System.out.println("Pickle added. Price: 0.1$");
    }
}

class HealthyBurger extends Burger{

    private boolean corn;
    private boolean onion;

    public HealthyBurger(String meat) {
        super("Brown rye", meat);
    }

    @Override
    public double chooseBread(String breadRoll){
        System.out.println("Burger bread is brown rye. Price: 1.0$");
        setBreadRoll(breadRoll);
        setBreadRollPrice(1.0d);
        return 1.0d;
    }

    public void setCorn(boolean corn) {
        this.corn = corn;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public void addCorn(){
        setCorn(true);
        double totalPrice = getTotalPrice();
        setTotalPrice(totalPrice + 0.2d);
        System.out.println("Corn added. Price: 0.2$");
    }

    public void addOnion(){
        setOnion(true);
        double totalPrice = getTotalPrice();
        setTotalPrice(totalPrice + 0.2d);
        System.out.println("Onion added. Price: 0.2$");
    }

}

class DeluxeBurger extends Burger{

    public String drink;
    public boolean chips;

    public DeluxeBurger(String breadRoll, String meat, String drink) {
        super(breadRoll, meat);
        this.drink = drink;
        this.chips = true;
    }

    @Override
    public void addCheese(){
        System.out.println("No additions allowed!");
    }

    @Override
    public void addLettuce(){
        System.out.println("No additions allowed!");
    }

    @Override
    public void addPickle(){
        System.out.println("No additions allowed!");
    }

    @Override
    public void addTomato(){
        System.out.println("No additions allowed!");
    }

}
