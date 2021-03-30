package Java.Fundamentals.Inheritance;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RestrauntTest {
    ArrayList<String> arr = new ArrayList<>();

    @Test public void testRestClass(){
        arr.add("this thing sucks ass");

        Restraunt test1 = new Restraunt("joes", 2,5,arr);

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
        arr.add("this thing sucks ass");
        Restraunt test2 = new Restraunt("joes", 2,5,arr);
//        assertEquals(arr,test2.addRev("this thing sucks ass"));
        System.out.println(test2.addRev("this thing sucks ass",3));
        assertEquals("the Restraunt name is joes the reating is 3  stars !!!! the price category is 5 the review is [this thing sucks ass Stars are  3]", test2.toString());

    }








}