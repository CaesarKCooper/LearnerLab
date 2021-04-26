import Lab.Person;
import Lab.Student;
import Lab.Students;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentsTest {

    @Test
    public void test(){

        //given
        Student student1 = new Student(1,"bob", 5);

        //when


        //then
    Assert.assertEquals(student1.getName(), Students.getInstance().findById(1).getName());
    }

}
