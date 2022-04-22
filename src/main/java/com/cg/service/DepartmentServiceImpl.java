package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.Department;
import com.cg.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	private DepartmentRepository deptRepo;
	
	@Autowired
	public DepartmentServiceImpl(DepartmentRepository deptRepo) {
		super();
		this.deptRepo = deptRepo;
	}

	@Override
	public Department addDepartment(Department dept) {
		// TODO Auto-generated method stub
		Department savedDept = deptRepo.save(dept);
		return savedDept;
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return (List<Department>) deptRepo.findAll();
	}

	@Override
	public void deleteDepartmentBydeptno(int deptno) {
		deptRepo.deleteById(deptno);
	}

}
