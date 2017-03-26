package test;
 
import static org.junit.Assert.*;
 
import org.junit.Test;
 
public class testone {
 
    @Test
    public void testTriangle() {
        assertEquals("this is not triangle!",new one().triangles(1,1,3));
        assertEquals("this is a equilateral triangle!",new one().triangles(6,6,6));
        assertEquals("this is a isosceles triangle!",new one().triangles(2,2,3));
        assertEquals("this is a scalene triangle!",new one().triangles(3,4,5));
 
    }
 
}