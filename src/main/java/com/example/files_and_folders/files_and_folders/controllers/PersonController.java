package com.example.files_and_folders.files_and_folders.controllers;

import com.example.files_and_folders.files_and_folders.models.Folder;
import com.example.files_and_folders.files_and_folders.models.Person;
import com.example.files_and_folders.files_and_folders.repositories.FolderRepository;
import com.example.files_and_folders.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> getAllPeople(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/persons/{id}")
    public ResponseEntity getPersonById(@PathVariable Long id){
        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/persons")
    public ResponseEntity<Person> postFile(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
}
