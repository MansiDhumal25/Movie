package practise.springboot.movie;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private int movieid;
	private String mname;
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", mname=" + mname + "]";
	}
	
	
	
}
