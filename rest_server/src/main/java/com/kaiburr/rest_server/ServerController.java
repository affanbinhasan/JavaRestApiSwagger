package com.kaiburr.rest_server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServerController {
    @Autowired
    ServerRepo ServerRepo;

    static String navigations = "Navigations provided : \n localhost8080/getservers \n localhost8080/getserverbyid/{id} : Provide id you want to look up for in the Url\n localhost8080/getserverbyname/{name} : Provide name you want to look up for in the Url \n localhost8080/addserver : Provide a Request Body In Raw Json Format \n localhost8080/deleteserver/{id} : Provide the id you want to delete an entity of.";
    

    @GetMapping("/")
    public String home(){
        return navigations;
    }

    @GetMapping("/getservers")
    public List<Server> getAllServer() {
        return ServerRepo.findAll();
    }

    @GetMapping("/getserverbyid/{id}")
    public List<Server> findServerById(@PathVariable String id){
        return ServerRepo.getServerById(id);
    }

    @PutMapping("/addserver")
    public List<Server> addServer(@RequestBody Server person){
        ServerRepo.save(person);
        return ServerRepo.findAll();
    }

    @DeleteMapping("/deleteserver/{id}")
    public List<Server> deleteServer(@PathVariable String id){
        ServerRepo.deleteById(id);
        return ServerRepo.findAll();
    }

    @GetMapping("/getserverbyname/{name}")
    public List<Server> findServerByName(@PathVariable String name){
        
        return ServerRepo.getServerByName(name);
    }

}
