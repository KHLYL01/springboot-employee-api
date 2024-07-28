package com.example.employee_api.service;

import com.example.employee_api.model.dto.EmployeeDto;
import com.example.employee_api.model.entity.Employee;
import com.example.employee_api.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).get();
    }

    public Employee saveEmployee(EmployeeDto employeeDto){
        Employee employee = Employee
                .builder()
                .fullname(employeeDto.getFullname())
                .birthdate(employeeDto.getBirthdate())
                .job(employeeDto.getJob())
                .salary(employeeDto.getSalary())
                .build();
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(int id,EmployeeDto employeeDto){
        Employee employee = Employee
                .builder()
                .id(id)
                .fullname(employeeDto.getFullname())
                .birthdate(employeeDto.getBirthdate())
                .job(employeeDto.getJob())
                .salary(employeeDto.getSalary())
                .build();
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(int id){
        employeeRepository.deleteById(id);
    }


}
