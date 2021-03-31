package Java.Fundamentals.Inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    @Test
    public void testRestClass(){

        Shop test3 = new Shop("Ricks Tickle your pickle",4,"grosss" );


        System.out.println(test3.toString());
        assertEquals("welcome to Ricks Tickle your pickle this restraunt is fried pickles the price 4 dollars", test3.toString());
        System.out.println(test3.getName());
        assertEquals( "Ricks Tickle your pickle", test3.getName());
        System.out.println(test3.getDesc());
        assertEquals( "fried pickles", test3.getDesc());
//        System.out.println(test3.retDollNum());
//        assertEquals( 4, test3.retDollNum());

    }
}
