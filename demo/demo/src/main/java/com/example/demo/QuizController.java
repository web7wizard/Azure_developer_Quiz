package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
// To make development easier, allow requests from any origin.
// You can restrict this later if needed.
@CrossOrigin(origins = "*") 
@RequestMapping("/api/quiz")
public class QuizController {

    private final QuizService service;

    public QuizController(QuizService service) {
        this.service = service;
    }

    @PostMapping("/submit")
    // By using the DTO, Spring Boot automatically and safely handles the JSON conversion.
    // No more manual parsing and no more NullPointerException!
    public Submission submitQuiz(@RequestBody SubmissionPayload payload) {
        
        System.out.println("=========================================");
        System.out.println("✅ Submission Received via DTO!");
        System.out.println("Name: " + payload.getName());
        System.out.println("Roll Number: " + payload.getRollNumber());
        System.out.println("Answers List: " + payload.getAnswers()); // Will correctly print nulls
        System.out.println("=========================================");

        // Now, pass the clean data to your service layer
        return service.saveSubmission(payload.getName(), payload.getRollNumber(), payload.getAnswers());
    }

    @GetMapping("/submissions")
    public List<Submission> getAll() {
        return service.getAllSubmissions();
    }
}