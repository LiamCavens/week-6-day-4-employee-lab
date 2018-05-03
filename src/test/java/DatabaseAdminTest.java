import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin1;

    @Before
    public void before(){
        databaseAdmin1 = new DatabaseAdmin("Ed", 776510, 100000);
    }

    @Test
    public void getName(){
        assertEquals("Ed", databaseAdmin1.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals(776510, databaseAdmin1.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(100000, databaseAdmin1.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        databaseAdmin1.raiseSalary(10000);
        assertEquals(110000, databaseAdmin1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, databaseAdmin1.payBonus(), 0.01);
    }
}
