package Java.Fundamentals.Inheritance;

public class Review {

    public String revAuth;
    public int stars;
    public String body;

    public Review(String revAuth, String body, int stars ){

        this.revAuth = revAuth;
        this.stars = stars;
        this.body = body;
    }

    public String toString(){
        return String.format("the author for this review of the restraunt goes by %s they gave it %d the body %s", this.revAuth, this.stars, this.body);
    }
    public String getName() {
        return String.format(this.revAuth);
    }

//    public int getStars() {
//
//        return (int) this.stars;
//    }
    public String getBody(){
        return  this.body;
    }



}


