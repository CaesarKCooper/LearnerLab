import Lab.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

/*
    private Person person;

    @Test
    public void setUp(){
        person = new Person(1,"joe");
    }
*/
    @Test
    public void testContructor(){
    //Given
        long id = 12;
        String givenName = "bob";


        //When
        Person person = new Person(id,givenName);

        //Then
        assertEquals(givenName, person.getName());
        assertEquals(id, person.getId());
    }


    @Test
    public void testSetName(){

        //When
        Person person = new Person(1, "" );
        person.setName("joe");

        //Then
        assertEquals("joe", person.getName());
    }


}
