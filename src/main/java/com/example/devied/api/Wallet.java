package com.example.devied.api;

import com.example.devied.data.UserData;
import com.example.devied.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController //gestisce le rotte delle richieste
@RequestMapping("/Wallet") //indirizzo rotta localhost
public class Wallet {

    @Autowired //collega la Repository qui
    UserDataRepository userDataRepository;

    @PostMapping(produces = "application/json", consumes = "application/json") //serve per delle specifiche su Postman
    public Hello ciao(@RequestBody UserData userData){
      UserData userData1 =  new UserData();
      userData1.setName(userData.getName()); //setta il nome che gli arriva da Postman
        userDataRepository.insert(userData1);
        Hello hello = new Hello();
        hello.setText("Ciao: " + userData1.getName());
        return hello;
    }

    @GetMapping(path = "/user", produces = "application/json")
    public ArrayList<User> listaUtenti (){
        ArrayList<UserData> listaUserData = (ArrayList<UserData>) userDataRepository.findAll();
        ArrayList<User> listaUser = new ArrayList<User>();

        for (UserData userData : listaUserData) { //per ogni oggetto di UserData presente nella tabella DB crea oggetto User prendendo i dati da li
            User user = new User();
            user.setName(userData.getName());
            listaUser.add(user);
        } return listaUser;
    }

}
