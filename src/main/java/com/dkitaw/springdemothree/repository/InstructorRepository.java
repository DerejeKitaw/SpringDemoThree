package com.dkitaw.springdemothree.repository;

import com.dkitaw.springdemothree.model.Instructor;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface  InstructorRepository extends JpaRepository<Instructor,Long> {

	Instructor findByEmail(String email);

}