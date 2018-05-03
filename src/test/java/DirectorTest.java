import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director1;

    @Before
    public void before(){
        director1 = new Director("Ed", 776510, 100000, "software", 1000000);
    }

    @Test
    public void getName(){
        assertEquals("Ed", director1.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals(776510, director1.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(100000, director1.getSalary(), 0.01);
    }

    @Test
    public void getDepartment() {
        assertEquals("software", director1.getDepartment());
    }

    @Test
    public void getBudget() {
        assertEquals(1000000, director1.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director1.raiseSalary(10000);
        assertEquals(110000, director1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000, director1.payBonus(), 0.01);
    }


}
