package com.pack.ltispringcore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.mainService.JoinOrganization;
import com.model.BankAccount;
import com.model.Employee;
import com.model.Insurance;
import com.service.BankAccountService;
import com.service.EmployeeService;

@SpringBootApplication
@ComponentScan("com")
public class LtiSpringCoreApplication {
	
	@Autowired
	JoinOrganization employeeService;
	
	/*@Autowired
	BankAccountService bankService;*/

	public static void main(String[] args) {
		ApplicationContext ctx=	SpringApplication.run(LtiSpringCoreApplication.class, args);
		
		JoinOrganization employeeService = ctx.getBean(JoinOrganization.class);
		Employee emp1= new Employee(101, "Sachin", "Delhi");
		Insurance ins = new Insurance(101, "family floater", 4000);
		BankAccount acc = new BankAccount(101, 5, 1000, "savings");
		
		employeeService.joinOrg(emp1, ins, acc);
		
		Employee emp2= new Employee(102, "George", "Seattle");
		Insurance ins2 = new Insurance(102, "individual floater", 6000);
		BankAccount acc2 = new BankAccount(102, 6, 2000, "checking");
		
		employeeService.joinOrg(emp2, ins2, acc2);
		
		employeeService.leaveOrg(emp1, ins, acc);
		
		/*BankAccountService bankService = ctx.getBean(BankAccountService.class);
		BankAccount acc = new BankAccount(101, 5, 1000, "savings");
		BankAccount acc2 = new BankAccount(102, 6, 500, "checking");
		
		bankService.addBankAccount(acc);
		bankService.addBankAccount(acc2);
		
		//bankService.deleteBankAccount(acc.getEmpId());
		
		List<BankAccount> lst = bankService.loadBankAccounts();
		
		for(BankAccount b : lst) {
			System.out.println(b);
		}*/
		
		
		
		/*EmployeeService employeeService= ctx.getBean(EmployeeService.class);
		
		Employee emp1= new Employee(101, "sachin", "Delhi");
		
		employeeService.addEmployee(emp1);
		
		List<Employee> lst = employeeService.loadEmployee();
		for(Employee e : lst) {
			System.out.println(e);
		}
		
		/*Employee e = employeeService.searchEmployee("sachin");
		System.out.println(e);
		
		System.out.println(employeeService.deleteEmployee(101));*/
	}

}
