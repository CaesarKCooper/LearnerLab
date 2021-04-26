package Lab;

import jdk.jshell.PersistentSnippet;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {

    List<Person> personList = new ArrayList<>();

    public void add(Person person) {

        personList.add(person);

    }

    public Person findById(long id) {

        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }



    public boolean contains(Person person) {

        if (personList.contains(person)) {
            return true;
        }

        return false;
    }

    public void removePerson(Person person) {

        personList.remove(person);
    }

    public void removePersonById(long id) {

        for (Person p : personList) {
            if (p.getId() == id) {
                personList.remove(p);
            }
        }
    }

    public void removeAll() {

        personList.removeAll(personList);

    }

    public Integer count() {

        return personList.size();
    }

    public Object[] toArray() {

        return personList.toArray();
    }


    @Override
    public Iterator iterator() {

        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        return null;

    }








    public static void main(String[] args) {

        People people = new People();
        Person bob = new Person(1, "bob");
        Person joe = new Person(2, "joe");

        people.personList.add(bob);
        people.personList.add(joe);

        //System.out.println(people.contains(joe));

        System.out.println(people.findById(1));
    }
}
