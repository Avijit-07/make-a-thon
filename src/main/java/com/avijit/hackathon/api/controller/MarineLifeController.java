package com.avijit.hackathon.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class MarineLifeController {

    /**
     *  GET to fetch all the complaints for the specific User
     */
    @GetMapping("/complaints")
    public ResponseEntity<String> getAllComplaints() throws Exception{
        return ResponseEntity.ok().body("List of Complaints");
    }

    /**
     *  GET any specific complaint based on complaint Id
    */
    @GetMapping("/complaints/{id}")
    public ResponseEntity<String> getComplaint(@PathVariable(value = "id") String complaintId){
        return ResponseEntity.ok().body("Complaint Details of Id :" +complaintId);
    }

    /**
     *  Create a new Complaint
     */
    @PostMapping("/complaint")
    public ResponseEntity<String> createComplaint(@RequestBody RequestBody request) throws Exception{
        return ResponseEntity.ok().body("Complaint has been created");
    }

    //TODO PUT to update an existing Complaint
    @PutMapping("/complaint/{id}")
    public ResponseEntity<String> updateComplaint(@PathVariable(value = "id") String complaintId){
        return ResponseEntity.ok().body("Complaint has been updated");
    }
}