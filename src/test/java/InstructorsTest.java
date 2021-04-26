import Lab.Instructor;
import Lab.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void test(){

        Instructor instructor1 = new Instructor(1, "rob");

        Assert.assertEquals(instructor1.getName(), Instructors.getInstance().findById(1).getName());
    }

}
