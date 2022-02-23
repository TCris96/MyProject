import java.util.List;

public class PersonService {
    private List<Person> personList;

    public PersonService(List<Person> listOfPersons) {
        this.personList = listOfPersons;
    }


    public List<Person> findAll() {

        return personList;
    }

    public Person findById(Integer id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public Person findByFirstName(String firstName) {
        for (Person person : personList) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                return person;
            }
        }
        return null;
    }

    public Person addPerson(Person person) {
        Person personInDb = findById(person.getId());
        if (personInDb == null) {
            personList.add(person);
            return person;
        }
        return null;
    }


    public Person updatePerson(Person person) {
        Person personInDb = findById(person.getId());
        if (personInDb == null) {
            return null;
        }
        personInDb.setFirstName(person.getFirstName());
        personInDb.setLastName(person.getLastName());
        personInDb.setAge(person.getAge());

        return personInDb;
    }

    public void deletePerson(Person person) {
        Person personInDb = findById(person.getId());
        if (personInDb != null) {
            personList.remove(personInDb);
        }
    }

}
