package projectmicroservices.ratingsdataservice.models;

public class Ratings {

    String movieId;
    double ratings;

    public Ratings(String movieId, double ratings){
        this.movieId = movieId;
        this.ratings = ratings;
    }

    public String getMovieId(){
        return this.movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
