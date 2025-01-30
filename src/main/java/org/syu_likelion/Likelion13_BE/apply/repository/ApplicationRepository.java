package org.syu_likelion.Likelion13_BE.apply.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.syu_likelion.Likelion13_BE.apply.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}