package practise.springboot.movie;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieservice;	
	
	@RequestMapping("/movies")
	public List<Movie> getAllMovie() {
		return movieservice.getAllMovies();
		}
	@RequestMapping("/movies/{id}")
	public Optional<Movie> getMovie(@PathVariable Integer id) {
		return  movieservice.getMovie(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/movies")
	public void addMovie(@Valid @RequestBody Movie movie) {
		movieservice.addMovie(movie);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/movies/{id}")
	public void updateMovie(@RequestBody Movie movie,@PathVariable String id) {
		movieservice.updateMovie(id,movie);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/movies/{id}")
	public void deleteMovie(@PathVariable Integer id) {
		movieservice.deleteMovie(id);
	}
	/*@Autowired
	MovieRepository repo;
	
	@RequestMapping("/")
	public String home() {
		return "movie";
	}
	@RequestMapping("/addMovie")
	public String addMovie(Movie movie) {
		repo.save(movie);
		return "movie";
	}
	@RequestMapping("/getMovie")
	public ModelAndView getMovie(@RequestParam int movieid) {
		ModelAndView mv=new ModelAndView("showMovie");
		Movie movie=repo.findById(movieid).orElse(new Movie());
		mv.addObject(movie);
		
		//repo.findById(movieid);
		return mv;*/
	
}

