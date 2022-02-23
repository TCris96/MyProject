import java.util.ArrayList;
import java.util.List;

public class StartApp {
    public static void main(String[] args) {

//        List<Person> personList = initPersonList();

        List<Person> personList = new ArrayList<>();

        Person johnSnow = new Person("John", "Snow", 22, 1);
        personList.add(johnSnow);
        Person daenerys = new Person("Daenerys", "Targaryen", 25, 2);
        personList.add(daenerys);
        Person littleFinger = new Person("Little" , "Finger", 45, 3);
        personList.add(littleFinger);

        System.out.println("Initial database list: ");
        for(Person person : personList) {
            System.out.println(person);
        }

        PersonService service = new PersonService(personList);

        //find by id
        Person firstPerson = service.findById(1);
        System.out.println("Person with id 1 is: " );
        System.out.println(firstPerson);

        //add person
        Person kahlDrago = new Person("Kahl", "Drago", 29, 4);
        Person dragoAddedInDb = service.addPerson(kahlDrago);
        System.out.println("Added person: " );
        System.out.println(dragoAddedInDb);

        //update
        Person updatedSnow = new Person("john".toUpperCase(), "SNOW", 34, 1);
        Person snowInDb = service.updatePerson(updatedSnow);
        System.out.println("Updated person: " );
        System.out.println(snowInDb);

        //delete
        Person littleFingerToBeDeleted = new Person("Little", "Finger", 45, 3);
        service.deletePerson(littleFingerToBeDeleted);

        //find all
        System.out.println("List after deletion");
        List<Person> actualList = service.findAll();
        for(Person person : actualList) {
            System.out.println(person);
        }
    }

}
