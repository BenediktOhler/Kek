package Tests;

import org.junit.Before;
import org.junit.Test;
import pages.BookFlight;

public class BookFlightTest {

    BookFlight bookFlight;

    @Before
    public void setup(){
        bookFlight = new BookFlight();
    }

    @Test
    public void validBookFlightTest(){
        bookFlight.with("benedikt","testpasswort");
        bookFlight.assertValidBookFlight();
    }
}
