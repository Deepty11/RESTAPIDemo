package com.rehnuma.web.RESTAPIDemo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Object {
    @JsonProperty("results")
    private Person[] results;

    public Person[] getResults() {
        return results;
    }

    public void setResults(Person[] results) {
        this.results = results;
    }
}
