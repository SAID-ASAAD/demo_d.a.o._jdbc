package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: findById ====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		System.out.println();
		
		System.out.println("==== TEST 2:findAll ====");
		List<Department> departments = departmentDao.findAll();
		for(Department d : departments) {
			System.out.println(d);
		}
		System.out.println();
		
		System.out.println("==== TEST 3: Department update ====");
		Department d = departmentDao.findById(2);
		d.setName("TV's");
		departmentDao.update(d);
		System.out.println("Update completed!");
		System.out.println();
		
		/* System.out.println("==== TEST 4: Insert ====");
		Department newDepartment = new Department(null, "VideoGames");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id: " + newDepartment.getId());
		System.out.println(); */
		
		System.out.println("TEST 5: Delete ====");
		System.out.println("Enter an id to delete Department test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete!");

		
		
		sc.close();
	}

}
