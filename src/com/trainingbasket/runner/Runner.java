package com.trainingbasket.runner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.trainingbasket.beans.EmployeeClass;
import com.trainingbasket.beans.ManagerClass;
import com.trainingbasket.beans.ReceptionistClass;
import com.trainingbasket.beans.EmployeeClass;
import com.trainingbasket.beans.ManagerClass;
import com.trainingbasket.beans.ReceptionistClass;

public class Runner {
	public static void main(String[] args) throws IOException {
		ReadUtil readUtil = new ReadUtil();
		ArrayList<ManagerClass> listofmanager = new ArrayList<ManagerClass>();
		while (readUtil.readString("press 1 to continue or other key to exit", "warningmessage").equals("1")) 
		{
			ManagerClass m = new ManagerClass();
			m.setAddress(readUtil.readString("Address", "warningmessage"));
			m.setContactNumber(readUtil.readString("Contact Number", "warningmessage"));
			m.setName(readUtil.readString("Name", "warningmessage"));
			m.setDepartment(readUtil.readString("Department", "warningmessage"));
			m.setSalary(readUtil.readDouble("Salary", "warningmessage"));
			listofmanager.add(m);
		}
		String datafromManagerClass="Id , Name , ContactNumber , Address , Salary , Department";
		//Enhanced for loop
		for (ManagerClass manager : listofmanager) 
		{
			System.out.println(manager);
		
			datafromManagerClass +=manager.getId()+","+manager.getName()+","
			+manager.getContactNumber()+","+manager.getAddress()+
					","+manager.getSalary()+","+manager.getDepartment()+"\n";
							
		}
		//need to send the list of managers to excel
		Files.write(Paths.get("D:\\Managers.csv"), datafromManagerClass.getBytes());
	}
}
