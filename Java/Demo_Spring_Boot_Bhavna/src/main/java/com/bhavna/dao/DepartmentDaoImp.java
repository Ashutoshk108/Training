package com.bhavna.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bhavna.bean.Department;
import com.bhavna.entity.DepartmentEntity;

@Repository
public class DepartmentDaoImp {
	@Autowired
	private DepartmentDao dao;

	public String addDepartment(Department department) {
		DepartmentEntity departmentEntity = new DepartmentEntity();
		departmentEntity.setdId(department.getdId());
		departmentEntity.setdName(department.getdName());
		departmentEntity.setdHead(department.getdHead());
		dao.save(departmentEntity);
		return "Department added successfully";
	}

	public Department updateDepartment(Department department) {
		DepartmentEntity departmentEntity = new DepartmentEntity();
		java.util.Optional<DepartmentEntity> departmentEntity1 = dao.findById(department.getdId());
		if (departmentEntity1.isPresent()) {
			departmentEntity = departmentEntity1.get();
			departmentEntity.setdId(department.getdId());
			departmentEntity.setdName(department.getdName());
			departmentEntity.setdHead(department.getdHead());
			dao.save(departmentEntity);
		} else {
			department = null;
		}
		return department;
	}

	public String deleteDepartment(int dId) {
		dao.deleteById(dId);
		return dId + " deleted successfully";
	}

	public List<Department> getDepartment() {
		Iterable<DepartmentEntity> itrable = dao.findAll();
		List<Department> list = new ArrayList<Department>();
		itrable.forEach(departmentEntity -> {
			Department department = new Department();
			BeanUtils.copyProperties(departmentEntity, department);
			list.add(department);
		});
		return list;

	}

}
