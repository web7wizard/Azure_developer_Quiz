package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String rollNumber;
    private int score;

    public Submission() {}

    public Submission(String name, String rollNumber, int score) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.score = score;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
}