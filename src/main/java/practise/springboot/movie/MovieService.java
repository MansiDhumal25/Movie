package practise.springboot.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> getAllMovies(){
		List<Movie> movies=new ArrayList<>();
		movieRepository.findAll().forEach(movies::add);
		return movies;
		
	}
	public Optional<Movie> getMovie(Integer id) {
		
		return movieRepository.findById(id);
	}
	public void addMovie(Movie movie) {
		
		 movieRepository.save(movie);
	}
	public void updateMovie(String id, Movie movie) {
		movieRepository.save(movie);
			}
	
	public void deleteMovie(Integer id) {
		movieRepository.deleteById(id);;
	}
	

}