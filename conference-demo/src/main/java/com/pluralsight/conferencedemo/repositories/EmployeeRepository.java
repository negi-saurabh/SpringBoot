package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee , Integer> {

}
