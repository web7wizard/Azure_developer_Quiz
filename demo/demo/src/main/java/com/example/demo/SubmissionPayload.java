package com.example.demo;

import java.util.List;

// This class MUST have getters and setters for Spring Boot's JSON processor to work correctly.
public class SubmissionPayload {

    private String name;
    private String rollNumber;
    private List<String> answers; // This list can safely contain null values

    // --- Getters and Setters ---

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}