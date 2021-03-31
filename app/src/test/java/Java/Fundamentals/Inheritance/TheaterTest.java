package Java.Fundamentals.Inheritance;
import org.junit.Test;
import static org.junit.Assert.*;


public class TheaterTest {
    @Test public void testTheater() {
        Theater test5 = new Theater("Ricks ",5);

        test5.newReview("pulp fiction","Joe","Say what one more time mother fucka",5);
        test5.newReview("pulp fiction","Garhett","Say what one more time mother fucka",5);
        test5.newReview("Star Wars","quinton tarentino","they needed john travolta",4);
        assertEquals("Star Wars",test5.getRevList().get(1).getRevList().get(0).movie);
        assertEquals("pulp fiction",test5.getRevList().get(0).getRevList().get(0).movie);

        System.out.println(test5.getRevList().get(0).getRevList().get(0).movie);



    }



}
