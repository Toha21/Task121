import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {


    //     @Test
    //    public void addFilmTest(){
    //            FilmManager manager = new FilmManager();
    //            manager.addFilm("Film");

    //   }
    @Test
    public void test() {
        FilmManager manager = new FilmManager(3);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Films10");
        String[] actual = manager.findLast();
        String[] expected = {"Film9", "Film8", "Film7"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test1() {
        FilmManager manager = new FilmManager(10);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Films10");
        String[] actual = manager.findLast();
        String[] expected = {"Film9", "Film8", "Film7"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test2() {
        FilmManager manager = new FilmManager(10);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Films10");
        String[] actual = manager.findLast();
        String[] expected = {"Film10","Film9", "Film8", "Film7","Film6","Film5","Film4","Film" +
                "3","Film2","Film1",};
        Assertions.assertArrayEquals(actual, expected);
    }
}
