package com.dkitaw.springdemothree.controller;

import java.util.List;

import com.dkitaw.springdemothree.model.Instructor;
import com.dkitaw.springdemothree.model.InstructorDetail;
import com.dkitaw.springdemothree.repository.InstructorRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/instructor")
public class InstructorController {
  private InstructorRepository instructorRepository;

  private InstructorController(InstructorRepository instructorRepository) {
    this.instructorRepository = instructorRepository;
  }

  @GetMapping(value = "/all")
  public List<Instructor> findAll() {
    return instructorRepository.findAll();
  }

  @PostMapping(value = "/create")
  public Instructor createInstructor(@RequestBody final Instructor instructor) {
    instructorRepository.save(instructor);

    return instructorRepository.findByEmail(instructor.getEmail());
  }
  @PostMapping(value = "/update/{email}")
  public Instructor createInstructor(@PathVariable final String email ,@RequestBody final InstructorDetail instructorDetail) {
    Instructor instructor = new Instructor();
    instructor=instructorRepository.findByEmail(email);
    instructor.setInstructorDetail(instructorDetail);
    instructorRepository.save(instructor);

    return instructorRepository.findByEmail(instructor.getEmail());
  }
}