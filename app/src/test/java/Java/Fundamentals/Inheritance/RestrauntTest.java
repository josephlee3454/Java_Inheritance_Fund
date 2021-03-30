package Java.Fundamentals.Inheritance;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RestrauntTest {
    ArrayList<String> arr = new ArrayList<>();

    @Test public void testRestClass(){
        arr.add("this thing sucks ass");

        Restraunt test1 = new Restraunt("joes",5);

        System.out.println(test1.getName());
        assertEquals( "joes", test1.getName());
        System.out.println(test1.toString());
        assertEquals("the Restraunt name is joes the reating is 2  stars !!!! the price category is 5 the review is []", test1.toString());
        System.out.println(test1.getStars());
        assertEquals(2, test1.getStars() );
        System.out.println(test1.priceCat);
        assertEquals(5,test1.priceCat);


    }

    @Test public void testRevList (){

        Restraunt test2 = new Restraunt("joes",4);
        test2.addRev("joe","so goodd", 2);
        assertEquals(2,test2.avgStar, 1);
    }








}