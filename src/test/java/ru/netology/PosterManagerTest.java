package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosterManagerTest {
    private PosterManager manager = new PosterManager();
    private  FilmData first = new FilmData("thinking Image", "Бладшот", "action", 1);
    private  FilmData second = new FilmData("thinking Image", "Вперед", "multiplication", 2);
    private  FilmData third = new FilmData("thinking Image", "Отель 'Белград'", "comedy", 3);
    private  FilmData fourth = new FilmData("thinking Image", "Джентельмены", "criminal", 4);
    private  FilmData fifth = new FilmData("thinking Image", "Человек невидимка", "horror", 5);
    private  FilmData sixth = new FilmData("thinking Image", "Троли Мировой тур", "multiplication", 6);
    private  FilmData seventh = new FilmData("thinking Image", "Номер один", "comedy", 7);
    private  FilmData eighth = new FilmData("thinking Image", "Человек паук", "action", 8);
    private  FilmData nineth = new FilmData("thinking Image", "Лига справедливости", "action", 9);
    private  FilmData tenth = new FilmData("thinking Image", "Тор", "action", 10);
    private  FilmData eleventh = new FilmData("thinking Image", "Водный мир", "post apocalyptic", 11);


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(nineth);
        manager.add(tenth);
    }

    @Test
    public void shouldAddFilm() {
        manager.add(eleventh);
        FilmData[] actual = manager.getAll();
        FilmData[] expected = new FilmData[]{
            first,
            second,
            third,
            fourth,
            fifth,
            sixth,
            seventh,
            eighth,
            nineth,
            tenth,
            eleventh,
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCreateManagerWithCount() {
        PosterManager managerWithCount = new PosterManager(5);
        int actual = managerWithCount.getCountGettingFilms();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetLastDefaultFilms() {
        FilmData[] actual = manager.getLast();
        FilmData[] expected = new FilmData[]{
                tenth,
                nineth,
                eighth,
                seventh,
                sixth,
                fifth,
                fourth,
                third,
                second,
                first,
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastCountFilms() {
        PosterManager managerWithCount = new PosterManager(5);
        managerWithCount.add(first);
        managerWithCount.add(second);
        managerWithCount.add(third);
        managerWithCount.add(fourth);
        managerWithCount.add(fifth);
        managerWithCount.add(sixth);
        managerWithCount.add(seventh);
        managerWithCount.add(eighth);
        managerWithCount.add(nineth);
        managerWithCount.add(tenth);
        FilmData[] actual = managerWithCount.getLast();
        FilmData[] expected = new FilmData[]{
                tenth,
                nineth,
                eighth,
                seventh,
                sixth,
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastFilmsLess() {
        PosterManager managerWithLessFilms = new PosterManager();
        managerWithLessFilms.add(first);
        managerWithLessFilms.add(second);

        FilmData[] actual = managerWithLessFilms.getLast();
        FilmData[] expected = new FilmData[]{
                second,
                first,
        };

        assertArrayEquals(expected, actual);
    }
}
