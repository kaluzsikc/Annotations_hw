package com.example.homework.annotations_hw.components;

import com.example.homework.annotations_hw.models.File;
import com.example.homework.annotations_hw.models.Folder;
import com.example.homework.annotations_hw.models.User;
import com.example.homework.annotations_hw.repositories.FileRepository;
import com.example.homework.annotations_hw.repositories.FolderRepository;
import com.example.homework.annotations_hw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("Bob");
        userRepository.save(user1);

        User user2 = new User("Ben");
        userRepository.save(user2);

        Folder folder1 = new Folder("Java", user1 );
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Ruby", user2);
        folderRepository.save(folder2);

        File file1 = new File("Annotations", ".rb", 32, folder2);
        fileRepository.save(file1);

        File file2 = new File("Loops", ".java", 100, folder1);
        fileRepository.save(file2);

        folder1.addFile(file1);
        folder1.addFile(file2);
        folderRepository.save(folder1);
        folder1.addFile(file2);
        folderRepository.save(folder2);

        user1.addFolder(folder1);
        user2.addFolder(folder2);
        userRepository.save(user1);
        userRepository.save(user2);
    }
}




