package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartamentDao();

        System.out.println("=== TEST 1: department findById =====");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n==== TEST 2: department findAll =====");
        List<Department> list = departmentDao.findAll();
        for (Department department1 : list) {
            System.out.println(department1);
        }

        System.out.println("\n=== TEST 3: department insert =======");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update =======");
        Department department2 = departmentDao.findById(1);
        department2.setName("Food");
        departmentDao.update(department2);
        System.out.println("Update copleted");

        System.out.println("\n=== TEST 5: department delete =======");
        System.out.println("Enter id for delete: ");
        int id = sc.nextInt();
        departmentDao.deletById(id);
        System.out.println("Delete Completed");

        sc.close();
    }
}
