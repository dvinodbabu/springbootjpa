package com.example.jpa.dao;

import com.example.jpa.model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel, Integer> {
}
