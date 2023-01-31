package com.example.files_and_folders.files_and_folders.components;


import com.example.files_and_folders.files_and_folders.models.File;
import com.example.files_and_folders.files_and_folders.models.Folder;
import com.example.files_and_folders.files_and_folders.models.Person;
import com.example.files_and_folders.files_and_folders.repositories.FileRepository;
import com.example.files_and_folders.files_and_folders.repositories.FolderRepository;
import com.example.files_and_folders.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader(){

    }


    public void run(ApplicationArguments args)  {

        Person rory = new Person("Rory");
        personRepository.save(rory);



        Folder englishHW = new Folder("English_HW", rory);

        folderRepository.save(englishHW);

        Folder physicsHW = new Folder("Physics_HW", rory);
        folderRepository.save(physicsHW);



        File englishEssay1 = new File("Midsummer Nights Dream - A Tale To Send One To Sleep", ".doc", 125, englishHW);


        fileRepository.save(englishEssay1);


        File englishEssay2 = new File("A study of Witcher 3", ".doc", 125, englishHW);
        fileRepository.save(englishEssay2);


        File englishEssay3 = new File("How to make a really good sandwich", ".doc", 125, englishHW);
        fileRepository.save(englishEssay3);

        File englishEssay4 = new File("Rory's magic 2 step ramen recipe", ".doc", 125, englishHW);
        fileRepository.save(englishEssay4);

        File physicsHw = new File("Calculating the charge to mass ratio of an electron with a magnetic field on an electron beam", ".pdf", 200, physicsHW);
        fileRepository.save(physicsHw);



    }
}
