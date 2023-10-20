//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmployeeMockAddition {
    private EmployeeMock mockEmployeeRepo;

    public TestEmployeeMockAddition() {
    }

    @BeforeEach
    public void initialize() {
        this.mockEmployeeRepo = new EmployeeMock();
    }

    @BeforeEach
    public void setup() {
        this.mockEmployeeRepo = new EmployeeMock();
    }

    @Test
    public void validateEmployeeWithCorrectCNP() {
        Employee emp = new Employee("Mark", "Smith", "9876543210987", DidacticFunction.ASISTENT, 6500.0);
        Assertions.assertTrue(this.mockEmployeeRepo.addEmployee(emp));
    }

    @Test
    public void validateNameFormat() {
        Employee emp = new Employee("Mark", "Smith", "9876543210987", DidacticFunction.ASISTENT, 6500.0);
        Assertions.assertTrue(this.mockEmployeeRepo.addEmployee(emp));
    }

    @Test
    public void rejectEmployeeWithOversizedCNP() {
        Employee emp = new Employee("Mark", "Smith", "98765432109871", DidacticFunction.ASISTENT, 6500.0);
        Assertions.assertFalse(this.mockEmployeeRepo.addEmployee(emp));
    }

    @Test
    public void rejectEmployeeWithUndersizedCNP() {
        Employee emp = new Employee("Mark", "Smith", "987654321098", DidacticFunction.ASISTENT, 6500.0);
        Assertions.assertFalse(this.mockEmployeeRepo.addEmployee(emp));
    }


    @Test
    public void validateFirstNameLength() {
        Employee emp = new Employee("Mar", "Smith", "9876543210987", DidacticFunction.ASISTENT, 6500.0);
        Assertions.assertTrue(this.mockEmployeeRepo.addEmployee(emp));
    }

    @Test
    public void validateFirstNameLengthOversize() {
        Employee emp = new Employee("Mark", "Smith", "9876543210987", DidacticFunction.ASISTENT, 6500.0);
        Assertions.assertTrue(this.mockEmployeeRepo.addEmployee(emp));
    }

    @Test
    public void rejectShortFirstName() {
        Employee emp = new Employee("Ma", "Smith", "9876543210987", DidacticFunction.ASISTENT, 6500.0);
        Assertions.assertFalse(this.mockEmployeeRepo.addEmployee(emp));
    }

    @Test
    public void validateMinimumSalary() {
        Employee emp = new Employee("Mark", "Smith", "9876543210987", DidacticFunction.ASISTENT, 0.1);
        Assertions.assertTrue(this.mockEmployeeRepo.addEmployee(emp));
    }
    @Test
    public void validateAboveMinimumSalary() {
        Employee emp = new Employee("Mark", "Smith", "9876543210987", DidacticFunction.ASISTENT, 0.2);
        Assertions.assertTrue(this.mockEmployeeRepo.addEmployee(emp));
    }

    @Test
    public void reject0Salary() {
        Employee emp = new Employee("Mark", "Smith", "9876543210987", DidacticFunction.ASISTENT, 0.0);
        Assertions.assertFalse(this.mockEmployeeRepo.addEmployee(emp));
    }
    @Test
    public void rejectSalaryBelow0() {
        Employee emp = new Employee("Mark", "Smith", "9876543210987", DidacticFunction.ASISTENT, -0.1);
        Assertions.assertFalse(this.mockEmployeeRepo.addEmployee(emp));
    }

}