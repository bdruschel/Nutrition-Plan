/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thomas
 */
public class DBStuffTest {
    
    /**
     * Test of addFoodDB method, of class DBStuff.
     */
    @Test
    public void testAddFoodDB() {
        ArrayList<String> a = new ArrayList<String>();
        FoodObject food1 = new FoodObject("apple","fruit",100,a);
        FoodObject food2 = new FoodObject("salmon","fish",120,a);
        DBStuff.addFoodDB(food1);
        DBStuff.addFoodDB(food2);
        FoodObject food3 = DBStuff.getFoodDB("apple");
        food3.setAlg(a);
        assertEquals(food1.cal, food3.cal);
        assertEquals(food1.name, food3.name);
        assertEquals(food1.type, food3.type);
    }

    /**
     * Test of getFoodDB method, of class DBStuff.
     */
    @Test
    public void testGetFoodDB() {
        ArrayList<String> a = new ArrayList<String>();
        FoodObject food1 = new FoodObject("apple","fruit",100,a);
        FoodObject food2 = new FoodObject("salmon","fish",120,a);
        FoodObject food3 = null;
        DBStuff.addFoodDB(food1);
        DBStuff.addFoodDB(food2);
        food3 = DBStuff.getFoodDB(food1.getName());
        food3.setAlg(a);
        assertEquals(food1.cal, food3.cal);
        assertEquals(food1.name, food3.name);
        assertEquals(food1.type, food3.type);
        assertEquals(food1.alg, food3.alg);
    }
    
}