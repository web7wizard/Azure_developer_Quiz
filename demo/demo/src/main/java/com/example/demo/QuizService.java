package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuizService {

    private final SubmissionRepository repo;

    public QuizService(SubmissionRepository repo) {
        this.repo = repo;
    }

    private final String[] correctAnswers = {
        "A", "C", "C", "A", "B", "C", "B", "D", "A", "C"
    };

    public int calculateScore(List<String> userAnswers) {
        int score = 0;
        for (int i = 0; i < correctAnswers.length && i < userAnswers.size(); i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers.get(i))) {
                score++;
            }
        }
        return score;
    }

    public Submission saveSubmission(String name, String rollNumber, List<String> answers) {
        int score = calculateScore(answers);
        Submission submission = new Submission(name, rollNumber, score);
        return repo.save(submission);
    }

    public List<Submission> getAllSubmissions() {
        return repo.findAll();
    }
}