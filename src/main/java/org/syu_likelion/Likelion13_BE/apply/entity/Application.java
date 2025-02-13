package org.syu_likelion.Likelion13_BE.apply.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 이름
    @Column(nullable = false, length = 100)
    private String name;

    // 학번
    @Column(name = "student_num", nullable = false, length = 20, unique = true)
    private String studentNum;

    // 전화번호
    @Column(name = "phone_num", nullable = false, length = 20)
    private String phoneNum;

    // 이메일
    @Column(nullable = false, length = 100, unique = true)
    private String email;

    // 노트북 보유 여부
    @Column(nullable = false)
    private boolean laptop;

    // 세션 참여 여부
    @Column(nullable = false)
    private boolean session;

    // 트랙 선택
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Track track;

    // 트랙 지원 동기
    @Column(name = "q1")
    private String Q1;

    // 트랙별 질문 1
    @Column(name = "q2")
    private String Q2;

    // 트랙별 질문 2
    @Column(name = "q3")
    private String Q3;

    // 트랙별 질문 3
    @Column(name = "q4")
    private String Q4;

    // 포트폴리오 첨부
    @Column(name = "q5")
    private String Q5;


    @Column(name = "created_at", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // 이름
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 학번
    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    // 전화번호
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    // 이메일
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 노트북 보유 여부
    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    // 세션 참여 여부
    public boolean isSession() {
        return session;
    }

    public void setSession(boolean session) {
        this.session = session;
    }

    // 트랙 선택
    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    // 트랙 지원 동기
    public String getQ1() {
        return Q1;
    }

    public void setQ1(String Q1) {
        this.Q1 = Q1;
    }

    // 트랙별 질문 1
    public String getQ2() {
        return Q2;
    }

    public void setQ2(String Q2) {
        this.Q2 = Q2;
    }

    // 트랙별 질문 2
    public String getQ3() {
        return Q3;
    }

    public void setQ3(String Q3) {
        this.Q3 = Q3;
    }

    // 트랙별 질문 3
    public String getQ4() {
        return Q4;
    }

    public void setQ4(String Q4) {
        this.Q4 = Q4;
    }

    // 포트폴리오 첨부
    public String getQ5() {
        return Q5;
    }

    public void setQ5(String Q5) {
        this.Q5 = Q5;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public enum Track {
        BACKEND, FRONTEND, PLAN_DESIGN
    }
}