import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class Employee
{
	String name;
	int designation;
	double basicSalary;
	int hra;
	int da;
	public void getDetails()
	{	

		System.out.println("Deignation is 1for manager, 2 for Accountant ,3 for clerk, Enter accordingly.");
		System.out.println("Enter employee name:");
		Scanner scan = new Scanner(System.in);
		name = scan.next();
		System.out.println("Enter employee designation according to the standard:");
		designation = scan.nextInt();
		System.out.println("Enter employee basic Salary:");
		basicSalary = scan.nextDouble();
		
	}
	public double gross()
	{
		double gross ; 
		if(designation == 1)
		{
		int hra = 20;
		int da = 25;
		gross = basicSalary + (basicSalary*hra)/100+(basicSalary*hra)/100;
		return gross;
		}
		if(designation == 2)
		{
		int hra = 10;
		int da = 15;
		gross = basicSalary + (basicSalary*hra)/100+(basicSalary*hra)/100;
		return gross;
		}
		if(designation == 3)
		{
		int hra = 10;
		int da = 10;
		gross = basicSalary + (basicSalary*hra)/100+(basicSalary*hra)/100;
		return gross;
		}
	}

	public static void main(String args[])
	{
		SFrame f = new SFrame(); 
	}
	
	
}
class SFrame extends Jframe implements ActionListener
{
	//Jlabel //	
	
	JLabel 	designation , department , basicSalary;
	
	//JButtons//
	
	JButton submit , details;

	//Text Fields//

	JTextField tdesignation , tdepartment , tsalary;

	//Text Areas//

	JTextArea ta;

	public SFrame()
	{
	SFrame f = new SFrame(); 
	f.setLayout(new FlowLayout());  
	f.setTitle("Employee Details");
	f.setSize("700 , 500");
	f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	

	designation = new JLabel("Designation");
	designation.setBounds(20,50,100,20);
	f.add(designation);

	tdesignation = new JTextField();
	tdesignation.setBounds(130,50,100,20);
	f.add(tdesignation);

	department = new JLabel("Designation");
	department.setBounds(20,100,100,20);
	f.add(department);
	
	tdepartment = new JTextField();
	tdepartment.setBounds(130,100,100,20);
	f.add(tdepartment);

	basicSalary = new JLabel("Basic Salary");
	basicSalary.setBounds(20,150,100,20);
	f.add(basicSalary);
	
	tsalary = new JTextField();
	tsalary.setBounds(130,150,100,20);
	f.add(tsalary);






	f.setVisible(true);
	}

}

