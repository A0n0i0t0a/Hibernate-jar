<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="org.hibernate.*,org.hibernate.cfg.Configuration,java.util.*,com.niit.hiber.Employee,org.hibernate.criterion.*,java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Session sess=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory().openSession();
Transaction t=sess.beginTransaction();

Employee  employee=new Employee();
employee.setEmployeeName("Anita");
Set<String> phoneNumbers=new HashSet<String>();
phoneNumbers.add("5564789");
phoneNumbers.add("3657894");
phoneNumbers.add("3358791");
employee.setPhoneNumbers(phoneNumbers);
sess.save(employee);
t.commit();

Query query=sess.createQuery("from Employee");
List<Employee> list=query.list();

Iterator<Employee> itr=list.iterator();
while(itr.hasNext())
{
	Employee emp=itr.next();
	out.println("Employee Name:  " + emp.getEmployeeName());
	
	Set<String> set=emp.getPhoneNumbers();
	Iterator<String> itr2=set.iterator();
	while(itr2.hasNext())
	{
		out.println(itr2.next());
	}
	out.println("<br/>");
	}
sess.close();
out.println("Success");
%>
</body>
</html>