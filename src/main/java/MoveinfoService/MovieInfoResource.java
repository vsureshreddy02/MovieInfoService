package MoveinfoService;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

   @RequestMapping("/{movieId}")
	public List<Movie> getMovies(@PathVariable("movieId") String movieId){
	
	
	return Collections.singletonList(new Movie("1","test"));
}

}