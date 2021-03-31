package Java.Fundamentals.Inheritance;


import java.util.ArrayList;

public class Shop implements Reviewable {
    String name;
    String desc;
    int numRevs;
    int sumStars;
    double avgStar;
    int stars;
    int priceCat;
    ArrayList<Review> revList = new ArrayList<Review>();

    public Shop(String name, int priceCat, String desc) {
        this.name = name;
        this.priceCat = priceCat;
        this.desc = desc;
    }


    public String toString(){
        return String.format("welcome to %s this restraunt is %s the price %d dollars", this.name, this.desc, this.priceCat );
    }

    public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.desc;
    }



    @Override
    public void newReview(String revAuth, String body, int stars) {
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

    }


