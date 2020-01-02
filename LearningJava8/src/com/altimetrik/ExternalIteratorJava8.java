package com.altimetrik;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExternalIteratorJava8 {

	public static void main(String[] args) {
		List<String> ll = Arrays.asList("neha", "veer", "rekha", "sahil");
		ll.forEach(System.out::println);

		for (String x : ll) {
			System.out.println(x);
		}

		Department hr = new Department("hr", 1);
		Department masterCard = new Department("masterCard", 2);
		Department citiBank = new Department("citiBank", 3);
		Department hr2 = new Department("hr", 1);
		Department masterCard3 = new Department("masterCard", 2);
		Department citiBank4 = new Department("citiBank", 3);

		Employee employeeMaster = new Employee(101, "neha", "Chandigarh", masterCard);
		Employee employeeCiti = new Employee(102, "veer", "punjab", citiBank);
		Employee employeeHr = new Employee(103, "aman", "pune", hr);
		Employee employeeMaster1 = new Employee(101, "neha", "Chandigarh", masterCard);
		Employee employeeCiti2 = new Employee(102, "veer", "punjab", citiBank);
		Employee employeeHr3 = new Employee(103, "aman", "pune", hr);
		
		//Optional<String> me=employeeMaster.getDepartment().getId();

	}
}
