package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.AdminUser;
import com.example.study.model.repository.AdminUserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class AdminUserRepositoryTest extends StudyApplicationTests {

    @Autowired
    private AdminUserRepository adminUserRepository;

    @Test
    public void create(){
        AdminUser adminUser = new AdminUser();
        adminUser.setAccount("AdminUser02");
        adminUser.setPassword("AdminUser02");
        adminUser.setStatus("REGISTERED");
        adminUser.setRole("Partner");
//        adminUser.setCreatedAt(LocalDateTime.now());
//        adminUser.setCreatedBy("AdminServer");

        AdminUser newAdminUser = adminUserRepository.save(adminUser);
        Assertions.assertNotNull(newAdminUser);

        newAdminUser.setAccount("CHANGE");
        adminUserRepository.save(newAdminUser);
    }
}
