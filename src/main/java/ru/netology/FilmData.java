package ru.netology;

public class FilmData {
    private String imgSrc;
    private String name;
    private String genre;
    private int filmId;

    public FilmData(String img, String name, String genre, int id){
        this.imgSrc = img;
        this.name = name;
        this.genre = genre;
        this.filmId = id;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
}
