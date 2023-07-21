package com.vrind.movieinfoservice;

import com.vrind.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        return getMovie(movieId);
    }

    public Movie getMovie(String movieId){
        Map<String ,Movie> movies = new HashMap<String ,Movie>();
        movies.put("1234", new Movie("1234", "Harry Potter and the Sorcerer's Stone"));
        movies.put("5678", new Movie("5678", "Harry Potter and the Cursed Child"));
        return movies.get(movieId);
    }
}
