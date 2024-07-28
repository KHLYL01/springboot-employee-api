package com.example.employee_api.controller;

import com.example.employee_api.model.dto.EmployeeDto;
import com.example.employee_api.model.entity.Employee;
import com.example.employee_api.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.saveEmployee(employeeDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.updateEmployee(id,employeeDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
