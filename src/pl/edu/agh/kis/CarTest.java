package pl.edu.agh.kis;

import static org.junit.Assert.*;

/**
 * Created by wojtek on 22.05.17.
 */
public class CarTest {
    @org.junit.Test
    public void setColor() throws Exception {
        Pojazd p = new Car("TKA",2010,2,"green");
        Car c = (Car) p;
        c.setColor("red");

        assertEquals("red",c.getColor());
    }

    @org.junit.Test
    public void setColor2() throws Exception {
        Car c = new Car("TKA",2010,2,"green");
        c.setColor("yellow");

        assertEquals("yellow",c.getColor());
    }

    @org.junit.Test
    public void setColor3() throws Exception {
        Car c = new Car("TKA",2010,2,"green");
        c.setColor("yellow");

        assertEquals("yellow",c.getColor());
    }

    @org.junit.Test
    public void setColor4() throws Exception {
        Car c = new Car("TKA",2010,2,"green");
        c.setColor("yellow");

        assertEquals("yellow",c.getColor());
    }

    @org.junit.Test
    public void setColor5() throws Exception {
        Car c = new Car("TKA",2010,2,"green");
        c.setColor("yellow");

        assertEquals("yellow",c.getColor());
    }

    @org.junit.Test
    public void setColor6() throws Exception {
        Car c = new Car("TKA",2010,2,"green");
        c.setColor("yellow");

        assertEquals("yellow",c.getColor());
    }


}