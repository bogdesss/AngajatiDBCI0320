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

public class EmployeeMockTest {
    private EmployeeMock employeeMock;

    public EmployeeMockTest() {
    }

    @BeforeEach
    public void setup() {
        this.employeeMock = new EmployeeMock();
    }

    @Test
    public void testAddEmployeeValidCNP() {
        Employee emp = new Employee("John", "Doe", "1234567890123", DidacticFunction.ASSISTANT, 3000.0);
        Assertions.assertTrue(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeTooLongCNP() {
        Employee emp = new Employee("John", "Doe", "12345678901234", DidacticFunction.ASSISTANT, 3000.0);
        Assertions.assertFalse(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeTooShortCNP() {
        Employee emp = new Employee("John", "Doe", "123456789012", DidacticFunction.ASSISTANT, 3000.0);
        Assertions.assertFalse(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeValidFunctionASSI() {
        Employee emp = new Employee("John", "Doe", "1234567890123", DidacticFunction.ASSISTANT, 3000.0);
        Assertions.assertTrue(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeValidFunctionLECT() {
        Employee emp = new Employee("John", "Doe", "1234567890123", DidacticFunction.LECTURER, 3000.0);
        Assertions.assertTrue(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeValidFunctionPROF() {
        Employee emp = new Employee("John", "Doe", "1234567890123", DidacticFunction.PROFESSOR, 3000.0);
        Assertions.assertTrue(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeValidFunctionASSO() {
        Employee emp = new Employee("John", "Doe", "1234567890123", DidacticFunction.ASSOCIATE, 3000.0);
        Assertions.assertTrue(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeFirstNameMoreThanTwoChars() {
        Employee emp = new Employee("Joh", "Doe", "1234567890123", DidacticFunction.ASSISTANT, 3000.0);
        Assertions.assertTrue(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeFirstNameLessThanTwoChars() {
        Employee emp = new Employee("Jo", "Doe", "1234567890123", DidacticFunction.ASSISTANT, 3000.0);
        Assertions.assertFalse(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeLastNameMoreThanTwoChars() {
        Employee emp = new Employee("John", "Doe", "1234567890123", DidacticFunction.ASSISTANT, 3000.0);
        Assertions.assertTrue(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeLastNameLessThanTwoChars() {
        Employee emp = new Employee("John", "Do", "1234567890123", DidacticFunction.ASSISTANT, 3000.0);
        Assertions.assertFalse(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeValidSalary() {
        Employee emp = new Employee("John", "Doe", "1234567890123", DidacticFunction.ASSISTANT, 0.1);
        Assertions.assertTrue(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeZeroSalary() {
        Employee emp = new Employee("John", "Doe", "1234567890123", DidacticFunction.ASSISTANT, 0.0);
        Assertions.assertFalse(this.employeeMock.addEmployee(emp));
    }

    @Test
    public void testAddEmployeeNegativeSalary() {
        Employee emp = new Employee("John", "Doe", "1234567890123", DidacticFunction.ASSISTANT, -0.1);
        Assertions.assertFalse(this.employeeMock.addEmployee(emp));
    }


}