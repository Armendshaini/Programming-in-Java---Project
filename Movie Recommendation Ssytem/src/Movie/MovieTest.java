package Movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    public void testMovie(){
        Movie movie = new Movie (1, "The God Father", "Drama", 9);
        assertEquals(1,movie.getId());
        assertEquals("The God Father",movie.getTitle());
        assertEquals("Drama",movie.getGenre());
        assertEquals(9,movie.getRating());
    }

}