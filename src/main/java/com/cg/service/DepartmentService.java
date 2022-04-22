package com.cg.service;

import java.util.List;

import com.cg.model.Department;

public interface DepartmentService {

	public Department addDepartment(Department dept);
	public List<Department> getAllDepartments();
	public void deleteDepartmentBydeptno(int deptno);
}
