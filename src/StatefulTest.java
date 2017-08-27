import org.junit.Test;

import static org.junit.Assert.*;

public class StatefulTest {
    Stateful tester1;
    Stateful tester2;

    @org.junit.Before
    public void setUp() throws Exception {
        tester1 = new Stateful();
        tester2 = new Stateful("READY", 4, false);
    }

    //Testing arbitrary Stateful values
    @Test
    public void arbitraryStatefulTextvalueisNothing(){
        assertEquals("Stateful text should be nothing", "", tester1.text());
    }
    @Test
    public void arbitraryStatefulNumvalueis0(){
        assertEquals("Stateful number should be 0", 0, tester1.number());
    }
    @Test
    public void arbitraryStatefulTruthvalueisTrue(){
        assertEquals("Stateful truth should be true", true, tester1.truth());
    }

    //Testing arbitrary Stateful flip
    @Test
    public void arbitraryStatefulflipvalueisfalse(){
        tester1.flip();
        assertEquals("Stateful flip should be false", false, tester1.truth());
    }

    //Testing arbitrary Stateful toString
    @Test
    public void arbitraryStatefultoString(){
        assertEquals("Stateful toString", "Stateful[true, 0, ]", tester1.toString());
    }

    //Testing set Stateful values
    @Test
    public void setStatefulTextvalueisNothing(){
        assertEquals("Stateful text should be READY", "READY", tester2.text());
    }
    @Test
    public void setStatefulNumvalueis0(){
        assertEquals("Stateful number should be 4", 4, tester2.number());
    }
    @Test
    public void setStatefulTruthvalueisfalse(){
        assertEquals("Stateful truth should be false", false, tester2.truth());
    }

    //Testing arbitrary Stateful flip
    @Test
    public void setStatefulflipvalueistrue(){
        tester2.flip();
        assertEquals("Stateful flip should be true", true, tester2.truth());
    }

    //Testing arbitrary Stateful toString
    @Test
    public void setStatefultoString(){
        assertEquals("Stateful toString", "Stateful[false, 4, READY]", tester2.toString());
    }
}
