package com.rehnuma.web.RESTAPIDemo.controller;

import com.rehnuma.web.RESTAPIDemo.model.Object;
import com.rehnuma.web.RESTAPIDemo.model.Person;
import com.rehnuma.web.RESTAPIDemo.model.PersonList;
import com.rehnuma.web.RESTAPIDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class RESTController {

    @Autowired
    private PersonService personService;


    @GetMapping("/api")
    public String getPerson(ModelMap model) throws IOException {
        Object object=personService.fetchData();
        model.put("personList",object);
        String firstName= object.getResults()[0].getName().getFirst();
        System.out.println("firstname :"+firstName);
        return "index";
    }
}
