package com.example.devied.repository;

import com.example.devied.data.UserData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDataRepository extends MongoRepository <UserData,String> /* Permette di accedere al documento che si ha sul DB */
{

}
