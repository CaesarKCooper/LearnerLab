package Lab;

import java.util.Arrays;
import java.util.HashMap;

public class ZipCodeWilmington {

    public static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();


    Students students = Students.INSTANCE;
    Instructors instructors = Instructors.INSTANCE;
    Student student;

    private ZipCodeWilmington(){

    }

    public void hostLecture(Teacher teacher, double numberOfHours){

        Learner[] learners = Arrays.copyOf(students.toArray(), students.count(), Learner[].class);

        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){

        Teacher teacher = (Teacher) instructors.findById(id);

        hostLecture(teacher, numberOfHours);

    }

    public HashMap getStudyMap(){

        HashMap<Student, Double> studymap = new HashMap<>();

        for(Object s: Students.getInstance()){
            studymap.put((Student) s, student.getTotalStudyTime() );
        }

        return studymap;
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }




}
