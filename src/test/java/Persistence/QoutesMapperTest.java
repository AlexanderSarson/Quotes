/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class QoutesMapperTest {
    

    @Test
    public void testgetAllQoutes() {
        IQoutesMapper mapper = new QoutesMapper();
        List<String> qoutes = mapper.getAllQoutes();
        assertTrue(qoutes.size() > 0);
    }
    
}
