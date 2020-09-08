package com.rehnuma.web.RESTAPIDemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonList {
    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        String pListString = "PersonList{";
        int i = 1;
        for (Person person : personList) {
            pListString.concat(" Person (" + i + ") : " + person.getName());
        }
        return pListString;
    }
}
