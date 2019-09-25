/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class QoutesTest {
    
    /**
     * Test of getRandomQoute method, of class Qoutes.
     */
    @org.junit.Test
    public void testGetRandomQoute() {
        System.out.println("getRandomQoute");
        Map<String, Integer> map = new HashMap();
        Qoutes instance = new Qoutes();
        for(int i = 0; i < 100; i++){
            String result = instance.getRandomQoute();
            if(map.containsKey(result)){
                int value = map.get(result);
                map.put(result, value+1);
            } else{
                map.put(result, 1);
            }
        }
        map.size();
        int expResult = 6;// expected 6 because there is 6 qoutes total
        assertEquals(expResult, map.size());
    }
    
}
