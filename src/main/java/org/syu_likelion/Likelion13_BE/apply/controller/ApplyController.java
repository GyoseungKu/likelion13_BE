package org.syu_likelion.Likelion13_BE.apply.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.syu_likelion.Likelion13_BE.apply.entity.Application;
import org.syu_likelion.Likelion13_BE.apply.service.ApplicationService;

@RestController
@RequestMapping("/applications")
public class ApplyController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping
    public ResponseEntity<Application> createApplication(@RequestBody Application application) {
        Application savedApplication = applicationService.saveApplication(application);
        return ResponseEntity.ok(savedApplication);
    }
}