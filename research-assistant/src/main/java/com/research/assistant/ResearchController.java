package com.research.assistant;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@AllArgsConstructor
public class ResearchController {
    private final ResearchService researchService;
//    @GetMapping("/test")
//    public String test() {
//        return "Backend running!";
//    }



    @PostMapping("/process")
    public ResponseEntity<String> processContent(@RequestBody ResearchRequest request) {
        String result = researchService.processContent(request);
        return ResponseEntity.ok(result);
    }
}