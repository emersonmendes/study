package br.com.emersonmendes.study.service;

import br.com.emersonmendes.study.AbstractTest;
import br.com.emersonmendes.study.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest extends AbstractTest  {

    @Autowired
    @Qualifier("personService")
    public PersonService service;

    @Test
    public void shouldGetAllPersonsGroupedByBloodTest()  {

        final Map<String, List<Person>> result = service.getPersonsGroupedByBloodType();

        final List<Person> aNegativePeople = result.get("A-");
        final List<Person> abPositivePeople = result.get("AB-");
        final List<Person> oPositivePeople = result.get("O+");
        final List<Person> oNegativePeople = result.get("O-");

        assertThat(aNegativePeople.size()).describedAs("A- People").isEqualTo(2);
        assertThat(abPositivePeople.size()).describedAs("AB+ People").isEqualTo(1);
        assertThat(oPositivePeople.size()).describedAs("O+ People").isEqualTo(4);
        assertThat(oNegativePeople.size()).describedAs("O- People").isEqualTo(2);

    }

}
