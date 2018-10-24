package com.codeclan.homeworks.filesandfolders.components;

import com.codeclan.homeworks.filesandfolders.models.File;
import com.codeclan.homeworks.filesandfolders.models.Folder;
import com.codeclan.homeworks.filesandfolders.models.User;
import com.codeclan.homeworks.filesandfolders.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("name1");
        userRepository.save(user1);

        Folder folder1 = new Folder("folderName", user1);
        folderRepository.save(folder1);

        File file1 = new File("fileName", "txt", 24, folder1);
        fileRepository.save(file1);

    }
}
