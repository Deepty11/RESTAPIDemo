package com.rehnuma.web.RESTAPIDemo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rehnuma.web.RESTAPIDemo.model.Object;
import com.rehnuma.web.RESTAPIDemo.model.Person;
import com.rehnuma.web.RESTAPIDemo.model.PersonList;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.Closeable;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;

@Service
public class PersonService {


    public Object fetchData() throws IOException {
        int num=50;
        int seed=1;
        int page=1;
        String url="https://api.randomuser.me?results="+num+"&seed="+seed+"&page="+page;
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request=new HttpGet(url);
        HttpResponse response=client.execute(request);
        String jsonString=EntityUtils.toString(response.getEntity());
        ObjectMapper objectMapper= new ObjectMapper();
        Object object= objectMapper.readValue(jsonString,Object.class);
        return object;

    }

}
