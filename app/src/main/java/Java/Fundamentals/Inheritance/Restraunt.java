package Java.Fundamentals.Inheritance;

import java.util.*;

public class Restraunt {
    String name;
    int numRevs;
    int sumStars;
    double avgStar;
    int stars;
    int priceCat;
    ArrayList<Review> revList = new ArrayList<Review>();

    public Restraunt(String name, int priceCat) {
        this.name = name;
        this.priceCat = priceCat;
    }



    public void addRev(String revAuth, String body, int stars) {
        Review newRev = new Review(revAuth, body, stars);


        this.revList.add(newRev);// add the string review to the list
        this.sumStars += stars;
        this.numRevs++;

        this.avgStar = this.avgStar(this.sumStars,this.numRevs);
    }
    public double avgStar(int sum, int num){
        double x = (double)sum / (double)num;
        return x;
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
