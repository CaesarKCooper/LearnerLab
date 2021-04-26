package Lab;

public class Instructor extends Person implements Teacher {


    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);

        }


    }
}
/*
    public static printNames(String[] listOfNames){
    for(String name : listOfNames){
        System.out.println(name);
    }
}

    public static void main(String[] args) {

    String[] array = {"bob", "joe"};

    }
}
*/
