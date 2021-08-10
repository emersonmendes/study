package br.com.emersonmendes.study.controller;

import br.com.emersonmendes.study.entity.Person;
import br.com.emersonmendes.study.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class PersonController {

    @Autowired
    @Qualifier("personService")
    public PersonService service;

    @Autowired
    @Qualifier("personServiceRequest")
    public PersonService serviceRequest;

    @Autowired
    @Qualifier("personServicePrototype")
    public PersonService servicePrototype;

    @Autowired
    @Qualifier("personServiceSession")
    public PersonService serviceSession;

    @GetMapping("/persons")
    public Set<Person> getPerson(){
        return service.getPerson();
    }

    /**
     * For study purposes
     */

    @GetMapping("/scope/singleton/persons/object")
    public String getServiceSingletonScopeObjectString(){
        return service.getServiceObjectString();
    }

    @GetMapping("/scope/request/persons/object")
    public String getServiceRequestScopeObjectString(){
        return serviceRequest.getServiceObjectString();
    }

    @GetMapping("/scope/prototype/persons/object")
    public String getServicePrototypeScopeObjectString(){
        return servicePrototype.getServiceObjectString();
    }

    @GetMapping("/scope/session/persons/object")
    public String getServiceSessionScopeObjectString(){
        return serviceSession.getServiceObjectString();
    }

}
