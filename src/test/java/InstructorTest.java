import Lab.*;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation() {

        Instructor instructor = new Instructor(2, "jill");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {

        Instructor instructor = new Instructor(3, "jack");

        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void testTeach() {

        //Given
        Student student = new Student(5, "lilly", 0);
        Instructor instructor = new Instructor(4, "bill");

        //When
        instructor.teach(student, 5.0);

        //Then
        Assert.assertEquals(5, student.getTotalStudyTime(), 0);
    }

    @Test
    public void testLecture() {

        //Given
        Student student1 = new Student(6, "kevin", 0);
        Student student2 = new Student(7, "drake", 0);

        Student[] students = {student1, student2};

        Instructor instructor = new Instructor(7, "ben");


        //When
        instructor.lecture(students, 8);

        //Then
        Assert.assertEquals(4.0, student1.getTotalStudyTime(), 0);


    }
}
