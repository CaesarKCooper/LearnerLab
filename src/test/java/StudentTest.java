import Lab.Learner;
import Lab.Person;
import Lab.Student;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){


        //Given

        //When
        Student student = new Student(1, "bob", 30.0);

        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){



        //Given

        //When
        Student student = new Student(2, "joe", 40.0);

        //Then
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void testLearn(){

        //Given

        //When
        Student student = new Student(3, "mary", 0);
        student.learn(10);

        //Then
        Assert.assertEquals(10, student.getTotalStudyTime(), 0);

    }
}
