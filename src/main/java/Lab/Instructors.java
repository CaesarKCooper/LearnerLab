package Lab;

    public final class Instructors extends People{

        public static final Instructors INSTANCE = new Instructors();


        private Instructors() {

            Instructor instructor1 = new Instructor(1, "rob");
            Instructor instructor2 = new Instructor(2, "liam");
            Instructor instructor3 = new Instructor(3, "pop");

            personList.add(instructor1);
            personList.add(instructor2);
            personList.add(instructor3);

        }

        public static Instructors getInstance(){
            return INSTANCE;
        }

}
