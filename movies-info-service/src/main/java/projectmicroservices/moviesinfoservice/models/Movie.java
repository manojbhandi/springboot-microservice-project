package projectmicroservices.moviesinfoservice.models;

public class Movie {

    public String movieId;
    public String name;
//    public double ratings;

    public Movie(String movieId, String name)
    {
        this.movieId = movieId;
        this.name = name;
//        this.ratings = ratings;
    }

//    public double getRatings(){
//        return ratings;
//    }
//    public void setRatings(double ratings){
//        this.ratings = ratings;
//    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getMovieId(){
        return this.movieId;
    }
    public void setMovieId(String movieId){
        this.movieId = movieId;
    }
}
