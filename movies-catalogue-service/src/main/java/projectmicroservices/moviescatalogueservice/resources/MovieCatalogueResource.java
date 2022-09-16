package projectmicroservices.moviescatalogueservice.resources;

import projectmicroservices.moviescatalogueservice.models.CatalogueItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResource {

    @RequestMapping("/all")
    public List<CatalogueItem> getCatalogue(){
        return Collections.singletonList(
                new CatalogueItem("Transformer", "sci-fi", 4)
        );
    }


}
