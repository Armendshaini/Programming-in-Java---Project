package Movie;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void testUser() {
        User user = new User(1, "Armend Shaini");
        assertEquals(1, user.getId());
        assertEquals("Armend Shaini", user.getName());
        Movie movie = new Movie(1, "The Shawshank Redemption", "Drama", 9);
        user.addWatchedMovie(movie);
        ArrayList<Movie> watchedMovies = user.getWatchedMovies();
        assertEquals(1, watchedMovies.size());
        assertEquals(movie, watchedMovies.get(0));
    }

}