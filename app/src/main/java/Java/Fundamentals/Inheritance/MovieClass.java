package Java.Fundamentals.Inheritance;


import java.util.ArrayList;

public class MovieClass{
            String movie;
            String body;
            String revAuthor;
            int numRev = 0;
            double avgStars = 0;
            int sumStars = 0;
            double stars;



    ArrayList<MovieReview> revList = new ArrayList<>();
            public MovieClass(String movie) {
                this.movie = movie;

            }
            public ArrayList<MovieReview> getRevList() {
                return revList;
            }

            public String getRevAuthor() {
                return revAuthor;
            }

            public void setRevAuthor(String revAuthor) {
                this.revAuthor = revAuthor;
            }

            public int getNumRev() {
                return numRev;
            }

            public void setNumRev(int numRev) {
                this.numRev = numRev;
            }

            public double getAvgStars() {
                return avgStars;
            }

            public void setAvgStars(double avgStars) {
                this.avgStars = avgStars;
            }

            public int getSumStars() {
                return sumStars;
            }

            public void setSumStars(int sumStars) {
                this.sumStars = sumStars;
            }

            public double getStars() {
                return stars;
            }

            public void setStars(double stars) {
                this.stars = stars;
            }

            public String getMovie() {
                return movie;
            }

            public void setMovie(String movie) {
                this.movie = movie;
            }



}



