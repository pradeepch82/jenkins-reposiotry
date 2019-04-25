package com.atossyntel.ems.reposiotry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.atossyntel.ems.model.Employee;


@Repository("employeeReposiotry")
public interface EmployeeReposiotry extends  MongoRepository<Employee, Integer> {

}
