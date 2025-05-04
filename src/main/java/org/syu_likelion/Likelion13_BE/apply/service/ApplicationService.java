package org.syu_likelion.Likelion13_BE.apply.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.syu_likelion.Likelion13_BE.apply.entity.Application;
import org.syu_likelion.Likelion13_BE.apply.repository.ApplicationRepository;
import org.syu_likelion.Likelion13_BE.email.EmailService;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private EmailService emailService;

    public Application saveApplication(Application application) {
        Application savedApplication = applicationRepository.save(application);
        sendConfirmationEmail(savedApplication);
        return savedApplication;
    }

    private void sendConfirmationEmail(Application application) {
        String to = application.getEmail();
        String subject = "[멋쟁이사자처럼 삼육대학교] 지원 완료 안내";
        String track = "";
        switch (application.getTrack()) {
            case BACKEND:
                track = "백엔드";
                break;
            case FRONTEND:
                track = "프론트엔드";
                break;
            case PRODUCT_DESIGN:
                track = "기획/디자인";
                break;
        }
        String text = "안녕하세요, " + application.getName() + "님. 지원이 완료되었습니다.\n\n"
                + "-지원 내용-\n"
                + "이름: " + application.getName() + "\n"
                + "전화번호: " + application.getPhoneNum() + "\n"
                + "이메일: " + application.getEmail() + "\n"
                + "노트북 소지 여부: " + (application.isLaptop() ? "예" : "아니오") + "\n"
                + "세션 참여 여부: " + (application.isSession() ? "예" : "아니오") + "\n"
                + "선택한 트랙: " + track + "\n"
                + "트랙 지원 동기: " + application.getQ1() + "\n"
                + "트랙별 질문 1: " + application.getQ2() + "\n"
                + "트랙별 질문 2: " + application.getQ3() + "\n"
                + "트랙별 질문 3: " + application.getQ4() + "\n"
                + "포트폴리오 첨부: " + application.getQ5() + "\n\n"
                + "지원해주셔서 감사합니다. \n\n"
                + "본 메일은 발신 전용 메일입니다.\n"
                + "문의: 카카오톡 채널 '멋쟁이사자처럼 삼육대학교', 인스타그램 @likelion_syu";
        String[] cc = {"sahmyook.univ@likelion.org", "ku@gyoseung.me"};
        emailService.sendEmail(to, subject, text, cc);
    }
}