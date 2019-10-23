package Silami;

public class Items {
    String name;
    int priceOfOne;
    int numbers;
    
    public Items(){}
    
    public Items(String nm,int po,int nb){
        name = nm;
        priceOfOne = po;
        numbers = nb;
    }
    
    
    int TotalPrice(){
        return priceOfOne * numbers;
    }
    int DiscountCalcul(){
        if (TotalPrice()>100000)
            return (10*TotalPrice())/100;
        else if (TotalPrice()>50000)
            return (5*TotalPrice())/100;
        else 
            return  TotalPrice(); 
    }
    int FinalPrice (){
        return TotalPrice() - DiscountCalcul();
    }
}
