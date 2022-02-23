import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    PersonService personService;

    @BeforeEach
    void setUp(){
        List<Person> personList = new ArrayList<>();

        Person johnSnow = new Person("John", "Snow", 22, 1);
        personList.add(johnSnow);
        Person daenerys = new Person("Daenerys", "Targaryen", 25, 2);
        personList.add(daenerys);
        Person littleFinger = new Person("Little" , "Finger", 45, 3);
        personList.add(littleFinger);

        personService = new PersonService(personList);

    }
    @Test
    public void findAllTest(){
        //given
        int expectedNumberOfPersons = 3;
        //when
        List<Person> personsInDataBase = personService.findAll();
        //then
        assertNotNull(personsInDataBase);
        assertEquals(expectedNumberOfPersons,personsInDataBase.size());
        assertNotEquals(4,personsInDataBase.size());
    }
    @Test
    public void findByIdTest(){
        //given
        Integer idInDataBase = 2;
        Person expected = new Person("Daenerys", "Targaryen", 25, 2);
        //when
        Person result = personService.findById(idInDataBase);

        //then
        assertNotNull(result);
        assertEquals(expected.getFirstName(),result.getFirstName());
        assertEquals(expected.getLastName(),result.getLastName());
        assertEquals(expected.getAge(),result.getAge());
    }
    @Test
    public void findByIdWithNullTest() {
        //given
        Integer idInDataBase = 4;
        //when
        Person result = personService.findById(idInDataBase);

        //then
        assertNull(result);
    }
    @Test
    public void findByFirstNameTest(){
        //given
        String firstName="JoHn";
        //when
        Person result = personService.findByFirstName(firstName);

        //then
        assertEquals("John",result.getFirstName());
        assertEquals("Snow",result.getLastName());
        assertEquals(22,result.getAge());
    }
    @Test
    public void addPersonTest(){
        //given
        Person person = new Person("Tyrion","abcd",25,4);
        int numberOfPersons = 4;
        int initialSize = personService.findAll().size();
        //when
        Person result = personService.addPerson(person);

        //then
        assertNotNull(person);
        assertNotEquals(numberOfPersons,initialSize);
        assertEquals(numberOfPersons,personService.findAll().size());
    }
    @Test
    public void addPersonWithSameIdTest(){
        //given
        Person person = new Person("abc","amd",22,1);
        //when
        Person result = personService.addPerson(person);

        //then
        assertNull(result);
    }
    @Test
    public void updatePersonTest(){
        //given
        Person person = new Person("John","Zapada",25,1);
        //when
        Person result = personService.updatePerson(person);

        //then
        assertEquals(person.getFirstName(),result.getFirstName());
        assertEquals(person.getLastName(),result.getLastName());
        assertEquals(person.getAge(),result.getAge());
    }
    @Test
    public void updatePersonWithInvalidPersonTest(){
        //given
        Person person = new Person("John","Zapada",25,4);
        //when
        Person result = personService.updatePerson(person);
        //then
        assertNull(result);
    }
    @Test
    public void deletePersonTest(){
        //given
        Person person = new Person("John","Zapada",25,1);
        int expectedSize =2;
        //when
        personService.deletePerson(person);

        //then
        assertEquals(expectedSize,personService.findAll().size());
    }
    @Test
    public void deletePersonWithInvalidIdTest(){
        //given
        Person person = new Person("John","Zapada",25,4);
        int expectedSize =3;
        //when
        personService.deletePerson(person);
        //then
        assertEquals(expectedSize,personService.findAll().size());
    }
}
