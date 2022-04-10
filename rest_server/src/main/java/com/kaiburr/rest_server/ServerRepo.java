package com.kaiburr.rest_server;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ServerRepo extends MongoRepository<Server,String>{
    @Query("{id : ?0}")                                     
    List<Server> getServerById(String id);

    @Query("{name : ?0}")                                     
    List<Server> getServerByName(String name);
}
