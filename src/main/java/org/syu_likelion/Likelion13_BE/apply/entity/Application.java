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
    @Column(name = "track_q")
    private String trackQ;

    // 백엔드 질문
    @Column(name = "be_q1")
    private String beQ1;

    @Column(name = "be_q2")
    private String beQ2;

    @Column(name = "be_q3")
    private String beQ3;

    @Column(name = "be_q4")
    private String beQ4;

    @Column(name = "be_q5")
    private String beQ5;

    // 프론트 질문
    @Column(name = "fe_q1")
    private String feQ1;

    @Column(name = "fe_q2")
    private String feQ2;

    @Column(name = "fe_q3")
    private String feQ3;

    @Column(name = "fe_q4")
    private String feQ4;

    @Column(name = "fe_q5")
    private String feQ5;

    // 기디 질문
    @Column(name = "pd_q1")
    private String pdQ1;

    @Column(name = "pd_q2")
    private String pdQ2;

    @Column(name = "pd_q3")
    private String pdQ3;

    @Column(name = "pd_q4")
    private String pdQ4;

    @Column(name = "pd_q5")
    private String pdQ5;

    @Column(name = "created_at", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    public boolean isSession() {
        return session;
    }

    public void setSession(boolean session) {
        this.session = session;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public String getTrackQ() {
        return trackQ;
    }

    public void setTrack_q(String trackQ) {
        this.trackQ = trackQ;
    }

    public String getBeQ1() {
        return beQ1;
    }

    public void setBeQ1(String beQ1) {
        this.beQ1 = beQ1;
    }

    public String getBeQ2() {
        return beQ2;
    }

    public void setBeQ2(String beQ2) {
        this.beQ2 = beQ2;
    }

    public String getBeQ3() {
        return beQ3;
    }

    public void setBeQ3(String beQ3) {
        this.beQ3 = beQ3;
    }

    public String getBeQ4() {
        return beQ4;
    }

    public void setBeQ4(String beQ4) {
        this.beQ4 = beQ4;
    }

    public String getBeQ5() {
        return beQ5;
    }

    public void setBeQ5(String beQ5) {
        this.beQ5 = beQ5;
    }

    public String getFeQ1() {
        return feQ1;
    }

    public void setFeQ1(String feQ1) {
        this.feQ1 = feQ1;
    }

    public String getFeQ2() {
        return feQ2;
    }

    public void setFeQ2(String feQ2) {
        this.feQ2 = feQ2;
    }

    public String getFeQ3() {
        return feQ3;
    }

    public void setFeQ3(String feQ3) {
        this.feQ3 = feQ3;
    }

    public String getFeQ4() {
        return feQ4;
    }

    public void setFeQ4(String feQ4) {
        this.feQ4 = feQ4;
    }

    public String getFeQ5() {
        return feQ5;
    }

    public void setFeQ5(String feQ5) {
        this.feQ5 = feQ5;
    }

    public String getPdQ1() {
        return pdQ1;
    }

    public void setPdQ1(String pdQ1) {
        this.pdQ1 = pdQ1;
    }

    public String getPdQ2() {
        return pdQ2;
    }

    public void setPdQ2(String pdQ2) {
        this.pdQ2 = pdQ2;
    }

    public String getPdQ3() {
        return pdQ3;
    }

    public void setPdQ3(String pdQ3) {
        this.pdQ3 = pdQ3;
    }

    public String getPdQ4() {
        return pdQ4;
    }

    public void setPdQ4(String pdQ4) {
        this.pdQ4 = pdQ4;
    }

    public String getPdQ5() {
        return pdQ5;
    }

    public void setPdQ5(String pdQ5) {
        this.pdQ5 = pdQ5;
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