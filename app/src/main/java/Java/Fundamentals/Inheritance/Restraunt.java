package Java.Fundamentals.Inheritance;

import java.util.*;

public class Restraunt {
    String name;
    int stars;
    int priceCat;
    ArrayList<String> revList;

    public Restraunt(String  name, int stars, int priceCat, ArrayList revList ){
            this.name = name;
            this.stars = stars;
            this.priceCat = priceCat;
            this.revList = new ArrayList<String>();




    }

    public ArrayList addRev(String restyRev, int star){
        this.stars = star;
        String starString = String.format(" Stars are  %d",this.stars);

        if(this.revList != null && this.revList.contains(restyRev)){// we check to see if its not empty so we dont have to use contains for no reason
            //we then check the array list that has been intilized throught the rev class to see if it contains the body "review"
            System.out.println("its here stupidhead "); // messge if it exists
        }
        else
        {
            this.revList.add(restyRev + starString);// add the string review to the list
//            this.revList.add(starString);
//            int starSum = 0;
//            for


        }
        return revList;// return arr list
    }

    public  String toString(){
        return String.format("the Restraunt name is %s the reating is %d  stars !!!! the price category is %d the review is %s" , this.name, this.stars, this.priceCat,this.revList);
    }



    public String getName() {
        return String.format(this.name);
    }

    public int getStars() {

        return this.stars ;
    }
    public int getPriceCat(){
        return  this.priceCat;
    }


}
