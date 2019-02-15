/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationtests;

import java.io.IOException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import utils.HttpClient;


/**
 *
 * @author Hassuni
 */
public class WebCalculatorTest {
     // http://localhost:7777/WebCalculator/Calculator?operation=add&n1=2&n2=3

    static HttpClient client = new HttpClient("http://localhost:7777/mavenproject1/Calculator");;
    
   

    
    @Test
    public void testWebAdd() throws IOException{
    String res = client.makeHttpRequest("?operation=add&n1=2&n2=3");
    assertEquals("Result of: 2+3= 5", res);
    }
    
     @Test
    public void testWebSub() throws IOException{
    String res = client.makeHttpRequest("?operation=sub&n1=4&n2=2");
    assertEquals("Result of: 4-2= 2", res);
    }
    
     @Test
    public void testWebMul() throws IOException{
    String res = client.makeHttpRequest("?operation=mul&n1=2&n2=3");
    assertEquals("Result of: 2*3= 6", res);
    }
    
     @Test
    public void testWebDiv() throws IOException{
    String res = client.makeHttpRequest("?operation=div&n1=6&n2=3");
    assertEquals("Result of: 6/3= 2", res);
    }
}
