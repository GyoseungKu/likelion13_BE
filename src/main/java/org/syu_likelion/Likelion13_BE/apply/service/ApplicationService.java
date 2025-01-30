package org.syu_likelion.Likelion13_BE.apply.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.syu_likelion.Likelion13_BE.apply.entity.Application;
import org.syu_likelion.Likelion13_BE.apply.repository.ApplicationRepository;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }
}