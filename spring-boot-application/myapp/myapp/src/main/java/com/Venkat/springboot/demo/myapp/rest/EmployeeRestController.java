package com.Venkat.springboot.demo.myapp.rest;

import com.Venkat.springboot.demo.myapp.entity.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private List<Employee> employeeList;

    @PostConstruct
    public void loadEmployee() {
        employeeList = new ArrayList<>();

        employeeList.add(new Employee("Venkat", "Korlakunta", 25, 1));
        employeeList.add(new Employee("Nitin", "Kokkori", 25, 2));
        employeeList.add(new Employee("Vikaranth", "Pulahari", 25, 3));
        employeeList.add(new Employee("Akhila", "Bollapalli", 25, 4));
    }


    @GetMapping("/employees/name/{fname}")
    public Employee getEmployee(@PathVariable String fname) {
        for (Employee emp : employeeList) {
            if (emp.getFname().equalsIgnoreCase(fname)) {
                return emp;
            }
        }
        return null;
    }

    @GetMapping("/employees/id/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        return employeeList.get(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee newEmployee) {
        employeeList.add(newEmployee);
        return newEmployee;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
        return employeeList;
    }

    @DeleteMapping("/employees/{id}")
    public List<Employee> deleteEmployee(@PathVariable int id){
        for(Employee emp : employeeList){
            if(emp.getId() == id){
                employeeList.remove(emp);
            }
        }
        return employeeList;
    }

    @PutMapping("/employees/id/{id}")
    public List<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee){
        for(Employee emp : employeeList){
            if(emp.getId() == id){
                employeeList.set(id, updatedEmployee);
            }
        }
        return employeeList;
    }
}

