package com.me;
//directions
/*
- the purpose of the application is to help Bills Burger's manage their process of selling hamburgers
- application will help Bill to select types of burgers, some of the additional items (additions) to be added to the
burgers and pricing
- create a base burger, and 2 other types of burgers that are popular at the restaurant
- the basic burger should have the following items;
bread role type, meat, and up to 4 additional items (lettuce, tomato, pickle, etc) that the customers can select to be
added to the burger
- each one of the items gets charged an additional price so we need some way to track how many items got added and to
calculate the final price (base burger with all the additions)
- the burger has a base price and the additions are all priced separately (up to 4 items)
- create a hamburger class to deal with all the above
- the constructor should only include the roll type, meat and price, and can also include name of burger or you can use
a setter
- also create 2 extra varieties of hamburgers (subclasses);
a) healthy burger (on a brown rye bread roll), plus 2 additional items that can be added
- the healthy burger can have 6 items in total
- hint: probably want to process the 2 additional items in the new class (subclass of hamburger), not the base class
(Hamburger), since the 2 additions are only appropriate for this new class, in other words new burger type
b) deluxe burger, comes with chips and drink as additions, but no extra additions are allowed
hint; you have to find a way to automatically add these new additions at the time the deluxe burger object is created,
and then prevent other additions being made
- all 3 classes should have a method that can be called anytime to show the base price of the hamburger pus all
additions, each showing the addition name, addition price, and a grand/final total for the burger
(base price + all additions)
- for the 2 additional classes this may require you to be looking at the base class for pricing and then adding totals
to final price.
 */
public class Main {

    public static void main(String[] args) {

        //step 8 from hamburger class
        Hamburger hamburger = new Hamburger("Basic", "Bison", 18.99, "Pretzel");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Onion", 0.65);
        hamburger.addHamburgerAddition2("Pickles", 0.45);
        hamburger.addHamburgerAddition3("Cheese", 1.29);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        //printout
        /*
        Basic hamburger on a Pretzel roll with Bison meat, price is 18.99
        Basic hamburger on a Pretzel roll with Bison meat, price is 18.99
        Added Onion for an extra 0.65
        Added Pickles for an extra 0.45
        Added Cheese for an extra 1.29
        Total Burger price is 21.379999999999995
         */

        //now go make a class HealthyBurger for step 9

        //step 15 run healthy burger instances and printouts
        /*System.out.println("-----------------------------------------------");
        HealthyBurger healthyBurger = new HealthyBurger("Tofu", 12.99);
        healthyBurger.addHamburgerAddition1("Kale", 2.22);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("Sprouts", 2.29);*/
        //result
        /*
        -----------------------------------------------
        Healthy hamburger on a Brown rye roll with Tofu meat, price is 12.99
        Added Kale for an extra 2.22
         */


        //step 16 go back to healthyburger class and make method to itemize healthy burger

        System.out.println("-------------------------------------------------------");
        //step 20, comment out step 15
        HealthyBurger healthyBurger = new HealthyBurger("Tofu", 12.99);
        healthyBurger.addHamburgerAddition1("Kale", 2.22);
        healthyBurger.addHealthAddition1("Sprouts", 2.29);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        //result
        /*
        -------------------------------------------------------
        Healthy hamburger on a Brown rye roll with Tofu meat, price is 12.99
        Added Kale for an extra 2.22
        Added Sprouts for an extra 2.29
        Total Healthy Burger price is 17.5
         */

        //step 21 now make deluxe class

        //step 25 from deluxe class, make instances and run here....
        System.out.println("--------------------------------------");
        Deluxe db = new Deluxe();
        db.itemizeHamburger();
        //result
        /*
        --------------------------------------
        Deluxe hamburger on a Wheat roll with Sausage & Bacon meat, price is 16.99
        Added Chips for an extra 4.99
        Added Drink for an extra 2.99
         */

        //step 26 now we got to make sure no additional items are allowed, go to deluxe class

        //step 28, can still add chips and drinks because we call super in step 24 in deluxe class



    }

}
