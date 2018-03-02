package com.me;
//step 21 making deluxe class, from step 20 in main
//step 22 extends hamburger class
public class Deluxe extends Hamburger{

    //no fields
    //step 23 constructor, remove parameters nad put them in manually in super
    public Deluxe() {
        super("Deluxe", "Sausage & Bacon", 16.99, "Wheat");
        //step 24
        super.addHamburgerAddition1("Chips", 4.99);
        super.addHamburgerAddition2("Drink", 2.99);

        //now to main to run this, step 25

    }

    //step 26, back from main, do an override here
    @Override
    public void addHamburgerAddition1(String name, double price) {
        //super.addHamburgerAddition1(name, price);
        //step 27 change the immediate above to a message
        System.out.println("No additional items allowed on Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        //super.addHamburgerAddition1(name, price);
        //step 27 change the immediate above to a message
        System.out.println("No additional items allowed on Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        //super.addHamburgerAddition1(name, price);
        //step 27 change the immediate above to a message
        System.out.println("No additional items allowed on Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        //super.addHamburgerAddition1(name, price);
        //step 27 change the immediate above to a message
        System.out.println("No additional items allowed on Deluxe Burger");

        //step 28, go back to main to run this again

    }
}
