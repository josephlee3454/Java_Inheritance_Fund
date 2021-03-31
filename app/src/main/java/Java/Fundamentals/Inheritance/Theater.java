package Java.Fundamentals.Inheritance;

import java.util.ArrayList;

public class Theater implements MovieReviewble {
    String name;
    String desc;
    int numRevs;
    int sumStars;
    double avgStar;
    int stars;
    int priceCat;



    ArrayList<MovieClass> revList = new ArrayList<>();
    public ArrayList<MovieClass> getRevList() {
        return revList;
    }
    public Theater(String name, int priceCat) {
        this.name = name;
        this.priceCat = priceCat;
    }

    public String toString() {
        return String.format("the author for this review of the movie goes by %s they paid it", this.priceCat, this.name);
    }

    public String getName() {
        return String.format(this.name);
    }

    @Override
    public void newReview(String movie, String revAuth, String body, int stars) {

        MovieReview newMovRev = new MovieReview(movie,revAuth,body,stars);
        for (int i =0 ; i < revList.size();i++){
            if(revList.get(i).getMovie().equals(newMovRev.getMovie())){
                revList.get(i).getRevList().add(newMovRev);
                return;
            }

        }
        MovieClass newMov = new MovieClass(movie);
        newMov.getRevList().add(newMovRev);
        revList.add(newMov);

    }


}




//    @Override
//    public void newMovieReview(String revAuth, String body, int stars) {
//        Review newRev = new Review(revAuth,body,4);
//        listOfReviews.add(newRev);
//    }




//    public void addRev(String revAuth, String body, int stars) {

