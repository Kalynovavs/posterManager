package ru.netology;

public class PosterManager {
    private int countGettingFilms = 10;
    private FilmData[] films = new FilmData[0];

    public PosterManager() {}

    public PosterManager(int count) {
        countGettingFilms = count;
    }

    public int getCountGettingFilms() {
        return countGettingFilms;
    }

    public void setCountGettingFilms(int count) {
        countGettingFilms = count;
    }

    public void add(FilmData film) {
        int length = films.length + 1;
        FilmData[] tmp = new FilmData[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }

        int lastIndex = tmp.length-1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public FilmData[] getLast() {
        int resultLength = countGettingFilms;
        if (countGettingFilms > films.length) {
            resultLength = films.length;
        }
        FilmData[] result = new FilmData[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public FilmData[] getAll() {
        return films;
    }

}
