package Lab;

public final class Students extends People {

    public static final Students INSTANCE = new Students();


    private Students() {
        Student student1 = new Student(1,"bob", 5);
        Student student2 = new Student(2,"ann", 4);
        Student student3 = new Student(3,"mary", 3);

        personList.add(student1);
        personList.add(student2);
        personList.add(student3);

    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {

        System.out.println();
        //System.out.println(getInstance().findById(1));

    }

    @Override
    public String toString() {
        return "Students{" + personList +
                '}';
    }

}



