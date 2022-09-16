package projectmicroservices.ratingsdataservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projectmicroservices.ratingsdataservice.models.Ratings;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {

    @GetMapping("/{movieId}")
    public Ratings getRatings(@PathVariable String movieId){
        return new Ratings(movieId,4.9);
    }
}
