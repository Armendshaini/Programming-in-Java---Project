package Movie;

import java.util.ArrayList;

public class User {
    private int id;       private String name;     private ArrayList<Movie> watchedMovies;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.watchedMovies = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void addWatchedMovie(Movie movie){
        watchedMovies.add(movie);
    }

    public ArrayList<Movie> getWatchedMovies() {
        return watchedMovies;
    }
}
