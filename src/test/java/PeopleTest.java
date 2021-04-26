import Lab.People;
import Lab.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest {

    @Test
    public void testAdd(){

        //given
        List<Person> personList = new ArrayList<>();
        Person person = new Person(1, "bob");
        Person person1 = new Person(2,"lol");
        //when
        personList.add(person);
        personList.add(person1);
        //then
        Assert.assertTrue(personList.contains(person1));

    }

    @Test
    public void testRemove(){

        //given
        List<Person> personList = new ArrayList<>();
        Person person = new Person(2, "joe");
        //when
        personList.remove(person);
        //then
        Assert.assertFalse(personList.contains(person));
    }

    @Test
    public void testFindById(){

        //given
        List<Person> personList = new ArrayList<>();
        Person person = new Person(3,"mary");
        People people = new People();
        //when
        personList.add(person);
        //then
        Assert.assertEquals(person, people.findById(3)); //????????????
    }

}
