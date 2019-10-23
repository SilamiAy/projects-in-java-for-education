package Silami;

public class ItemsMain {
    public static void main(String[]args){
        Items shoes =new Items ();
        shoes.name = "Curry retro";
        shoes.priceOfOne = 2400000;
        shoes.numbers = 1;
        
        System.out.println("the total price of the shoes is "+shoes.TotalPrice());
        System.out.println("you get discount "+ shoes.DiscountCalcul());
        System.out.println("you have to pay: "+ shoes.FinalPrice());
        
        System.out.println("");
        
        Items hat = new Items ("nike",1500000,2);
        System.out.println("the total Price of the hat is: "+hat.TotalPrice());
        System.out.println("you get the discount of "+ hat.DiscountCalcul());
        System.out.println("you have to pay "+ hat.FinalPrice());
        
    }
}
