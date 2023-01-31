package Movie;

import java.util.ArrayList;

public class RecommendationSystem {
    private ArrayList<Movie> movies;
    private ArrayList<User> users;

    public RecommendationSystem() {
        this.movies = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }
    public void addUser(User user){
        users.add(user);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Movie> recommendMovies(User user){
        ArrayList<Movie> recommendedMovies = new ArrayList<>();
    for (Movie movie : movies){
        boolean isWatched = false;
        for(Movie watchedMovie : user.getWatchedMovies()){
            if(watchedMovie.getId() == movie.getId()){
                isWatched = true;
                break;
            }
        }
        if(!isWatched){
            recommendedMovies.add(movie);
        }
    }
    return recommendedMovies;
    }
}
