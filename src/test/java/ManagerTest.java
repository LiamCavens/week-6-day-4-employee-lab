import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager1;

    @Before
    public void before(){
        manager1 = new Manager("Ed", 776510, 100000, "software");
    }

    @Test
    public void getName(){
        assertEquals("Ed", manager1.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals(776510, manager1.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(100000, manager1.getSalary(), 0.01);
    }

    @Test
    public void getDepartment() {
        assertEquals("software", manager1.getDepartment());
    }

    @Test
    public void canRaiseSalary() {
        manager1.raiseSalary(10000);
        assertEquals(110000, manager1.getSalary(), 0.01);
    }

    @Test
    public void canNotLowerSalary(){
        manager1.raiseSalary(-10000);
        assertEquals(100000, manager1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, manager1.payBonus(), 0.01);
    }

    @Test
    public void setName(){
        manager1.setName("Bob");
        assertEquals("Bob", manager1.getName());
    }

    @Test
    public void setNameInvalid() {
        manager1.setName("");
        assertEquals("Ed", manager1.getName());
    }
}
