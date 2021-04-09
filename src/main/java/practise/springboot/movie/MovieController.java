package practise.springboot.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController {
	
	@Autowired
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
		return mv;
	}
}

