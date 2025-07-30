package model;

public class Movie {

    private int id;
    private String title;
    private String genre;
    private String type;
    private int releaseYear;
    private String description;

    public Movie() {
    }

    public Movie(int id, String title, String genre, String type, int releaseYear, String description) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.type = type;
        this.releaseYear = releaseYear;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
