package Java.Fundamentals.Inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    @Test
    public void testRestClass(){

        Shop test3 = new Shop("Ricks Tickle your pickle", "fried pickle ricks",3);


        System.out.println(test3.toString());
        assertEquals("welcome to Ricks Tickle your pickle this restraunt is Ricks Tickle your pickle the price 3 dollars", test3.toString());
        System.out.println(test3.getName());
        assertEquals( "Ricks Tickle your pickle", test3.getName());
        System.out.println(test3.retDesc());
        assertEquals( "fried pickle ricks", test3.retDesc());
        System.out.println(test3.retDollNum());
        assertEquals( 3, test3.retDollNum());



    }
}
