package com.altimetrik;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("neha", "nitin", "veer", "aman", "bheem");
		//names.stream().sorted().forEach(System.out::println);
		
		
		Department hr=new Department("hr",1);
		Department masterCard=new Department("masterCard",2);
		Department citiBank=new Department("citiBank",3);
		Department hr2=new Department("hr",1);
		Department masterCard3=new Department("masterCard",2);
		Department citiBank4=new Department("citiBank",3);
		
		Employee employeeMaster=new Employee(101, "neha", "Chandigarh", masterCard);
		Employee employeeCiti=new Employee(102, "veer", "punjab", citiBank);
		Employee employeeHr=new Employee(103, "aman", "pune", hr);
		Employee employeeMaster1=new Employee(101, "neha", "Chandigarh", masterCard);
		Employee employeeCiti2=new Employee(102, "veer", "punjab", citiBank);
		Employee employeeHr3=new Employee(103, "aman", "pune", hr);
		
		List<Employee> empList= Arrays.asList(employeeMaster,employeeHr,employeeCiti,employeeMaster1,employeeHr3,employeeCiti2);
		List<Employee> sortedEmpList=empList.stream().sorted((Employee e1, Employee e2)->e1.getDepartment().getName().compareTo(e2.getDepartment().getName())).collect(Collectors.toList());
		//sortedEmpList.forEach(System.out::println);
		
		//List employee who lives in punjab
		
		List<Employee> set=empList.stream().filter(x->x.getAddress().equals("pune")).collect(Collectors.toList());
		//set.forEach(System.out::println);
		
		List<String> departments=empList.stream().map(x->x.getDepartment().getName()).distinct().collect(Collectors.toList());
		//departments.forEach(System.out::println);
		
		List<Employee> filetrOnEmpId=empList.stream().filter(x->x.getId()>101).collect(Collectors.toList());
		//filetrOnEmpId.forEach(System.out::println);
		
		List<Integer> empAllId=empList.stream().map(x->x.getId()).distinct().collect(Collectors.toList());
		//empAllId.forEach(System.out::println);
		
		List<String> depNames=empList.stream().map(x->x.getDepartment().getName()).distinct().collect(Collectors.toList());
		
		depNames.forEach(System.out::println);
	}

}
