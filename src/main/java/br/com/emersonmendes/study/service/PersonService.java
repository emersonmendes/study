package br.com.emersonmendes.study.service;

import br.com.emersonmendes.study.entity.Person;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service("personService")
public class PersonService {

    public Set<Person> getPerson() {
        final Set<Person> people = buildPersons();
        return people
            .stream()
            .sorted(Comparator.comparing(Person::getName))
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private Set<Person> buildPersons() {
        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Emerson Mendes", "O+", 33));
        persons.add(new Person("João Silva", "O-", 24));
        persons.add(new Person("Mauricio Medeiros", "O-", 25));
        persons.add(new Person("Jorge Lacerda", "A-", 22));
        persons.add(new Person("Jorge Marcos da silva", "O+", 23));
        persons.add(new Person("Carlos da silva", "O+", 50));
        persons.add(new Person("Maria da conceição", "O+", 60));
        persons.add(new Person("Godofredo de souza", "A-", 90));
        persons.add(new Person("Alberto de castro e souza", "AB-", 90));
        return persons;
    }

    public Map<String, List<Person>> getPersonsGroupedByBloodType() {
        final Set<Person> people = buildPersons();
        return people.stream().collect(Collectors.groupingBy(Person::getBloodType));
    }

    public String getServiceObjectString() {
        return toString();
    }

}
