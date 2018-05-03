import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer1;

    @Before
    public void before(){
        developer1 = new Developer("Ed", 776510, 100000);
    }

    @Test
    public void getName(){
        assertEquals("Ed", developer1.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals(776510, developer1.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(100000, developer1.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        developer1.raiseSalary(10000);
        assertEquals(110000, developer1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, developer1.payBonus(), 0.01);
    }
}
