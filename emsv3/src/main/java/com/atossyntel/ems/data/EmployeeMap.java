package com.atossyntel.ems.data;

import java.util.HashMap;
import java.util.Map;

import com.atossyntel.ems.model.Employee;

public enum EmployeeMap {
INSTANCE;
	
private Map<Integer, Employee> map;

private EmployeeMap() {
map=new HashMap<>();

Employee e1=new Employee("pradeep", "chinchole", 1499443.441,"9158652627","dmxpc9834f");
Employee e2=new Employee("ram", "chinchole", 2499443.442,"7158652627","bmxpc9834f");
Employee e3=new Employee("mahesh", "chinchole", 3499443.443,"8158652627","cmxpc9834f");

map.put(e1.getEmployeeId(), e1);
map.put(e2.getEmployeeId(), e2);
map.put(e3.getEmployeeId(), e3);

}
	

public Map<Integer, Employee> getMap() {
	return map;
}
	
	
	
	
}
