package com.daldal.springboot.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.daldal.springboot.writedto.WriteMongoDto;

public interface MyDataMongoRepository extends MongoRepository<WriteMongoDto, Long>{

}
