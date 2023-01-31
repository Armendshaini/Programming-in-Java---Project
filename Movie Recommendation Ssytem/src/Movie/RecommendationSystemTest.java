package Movie;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RecommendationSystemTest {
    @Test

    public void testRecommendationSystem() {
        RecommendationSystem system = new RecommendationSystem();
        Movie movie1 = new Movie(1, "The Shawshank Redemption", "Drama", 9);
        Movie movie2 = new Movie(2, "The Godfather", "Crime", 9);
        Movie movie3 = new Movie(3, "The Godfather: Part II", "Crime", 9);
        system.addMovie(movie1);
        system.addMovie(movie2);
        system.addMovie(movie3);
        User user = new User(1, "Armend Shaini");
        user.addWatchedMovie(movie1);
        system.addUser(user);
        ArrayList<Movie> recommendedMovies = system.recommendMovies(user);
        assertEquals(2, recommendedMovies.size());
        assertTrue(recommendedMovies.contains(movie2));
        assertTrue(recommendedMovies.contains(movie3));
    }

}