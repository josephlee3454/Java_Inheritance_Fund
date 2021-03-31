package Java.Fundamentals.Inheritance;

public class MovieReview extends Review{

    String movie;

    public MovieReview(String movie,String revAuth, String body, int stars){
        super(revAuth,body,stars);
        this.movie = movie;

    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }






}
