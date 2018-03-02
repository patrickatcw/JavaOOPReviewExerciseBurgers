package com.me;
//step 9 make a healthyburger class
//step 10 extends hamburger class
public class HealthyBurger extends Hamburger {

    //step 11 add fields to this class
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    //step 12 constructor, (select none) makes error go away
   /* public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }*/

    //step 13 change constructor from above
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    //step 14 methods for additional items
    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    //step 15 go to main and run healthy burger

    //step 16, back from main to make itemize healthyburger method, overriding....
    @Override
    public double itemizeHamburger() {
        //return super.itemizeHamburger();
        //step 17 changed the above to....
        double hamburgerPrice = super.itemizeHamburger();
        //step 18 adding extras
        if(this.healthyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " +
                    this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " +
                    this.healthyExtra2Price);
        }

        //step 19 return
        return hamburgerPrice;

        //now go to main and add instance and run, step 20

    }

}

