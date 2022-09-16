package projectmicroservices.moviescatalogueservice.models;

public class CatalogueItem {

    private String name;
    private String description;
    private int ratings;

    public CatalogueItem(String name, String description, int ratings){
        this.name = name;
        this.description = description;
        this.ratings = ratings;

    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public int getRatings(){
        return this.ratings;
    }

}
