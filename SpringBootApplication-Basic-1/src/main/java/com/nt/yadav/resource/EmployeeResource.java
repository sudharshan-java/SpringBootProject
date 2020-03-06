package com.nt.yadav.resource;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.yadav.entity.EmployeeEntity;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
	@RequestMapping("/{yadav}")
	public List<EmployeeEntity> getEmployee(@PathVariable String empId){
		EmployeeEntity entity=new EmployeeEntity();
		entity.setEmpId(101);
		entity.setEmpName("sudha");
		entity.setAddr("hyd");
		entity.setDomain("java");
		return (List<EmployeeEntity>) entity;
		
	}

}
