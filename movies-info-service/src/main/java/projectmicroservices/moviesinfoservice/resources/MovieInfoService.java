package projectmicroservices.moviesinfoservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import projectmicroservices.moviesinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoService {

    @GetMapping ("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId){
        return new Movie(movieId, "vivikananda");
    }

}
