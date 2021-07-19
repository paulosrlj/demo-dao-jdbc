package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n--- Test 1: Department: insert ---");
        Department department = new Department(null, "RH");
        departmentDao.insert(department);

        System.out.println("\n--- Test 2: Department: Update ---");
        department.setName("Recursos Humanos - RH");
        departmentDao.update(department);

        System.out.println("\n--- Test 3: Department: findById ---");
        department = departmentDao.findById(3);
        System.out.println(department);

    }
}
