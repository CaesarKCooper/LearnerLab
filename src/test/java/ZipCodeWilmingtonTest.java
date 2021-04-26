import Lab.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture() {

        List<Student> students = new ArrayList<>();

        Instructor instructor = new Instructor(2, "rob");
        Student student = new Student(1, "bob", 0 );
        students.add(student);

        Learner[] learners = Arrays.copyOf(students.toArray(), 1, Learner[].class);

        ZipCodeWilmington.getInstance().hostLecture(instructor, 5);

        instructor.lecture(learners, 5);

        Assert.assertEquals(5, student.getTotalStudyTime(), 0);


    }
}
