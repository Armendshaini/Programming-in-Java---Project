package Movie;

public class Movie {
    private int id;     private String title;       private String genre;       private int rating;

    public Movie(int id, String title, String genre, int rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }
}
