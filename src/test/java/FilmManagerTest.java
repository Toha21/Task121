import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {


    @Test
    public void test() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Film10");
        String[] actual = manager.findLast();
        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void orderOfAdditionTest() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");


        String[] actual = manager.findAll();
        String[] expected = {"Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void exceedingTheLimitTest() {
        FilmManager manager = new FilmManager(12);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Film10");
        manager.addFilm("Film11");
        manager.addFilm("Film12");
        String[] actual = manager.findLast();
        String[] expected = {"Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void exceedingTheLimitTest12() {
        FilmManager manager = new FilmManager(10);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");

        String[] actual = manager.findLast();
        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        ;
        Assertions.assertArrayEquals(actual, expected);
    }
}

