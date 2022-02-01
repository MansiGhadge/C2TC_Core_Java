package corejava;


public class SampleEmp
{
void empIDCheck(int EmpID) throws EmployeeException{
if(EmpID<=0 || EmpID>999){
throw new EmployeeException("Invalid Employee ID");
}
else {
	System.out.println("valid id");
}
}
public static void main(String args[])
{
SampleEmp emp = new SampleEmp();
try
{
emp.empIDCheck(0);
}
catch (EmployeeException e)
{
System.out.println("Exception caught");
System.out.println(e.getMessage());
}
}
}
class EmployeeException extends Exception
{
public EmployeeException(String s)
{
super(s);
}
}
