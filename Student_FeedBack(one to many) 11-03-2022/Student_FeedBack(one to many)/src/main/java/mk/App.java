package mk;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{

	public static void main(String[] args) 
	{
		System.out.println("------ONE TO MANY-----");
		Configuration cf = new Configuration();
		cf = cf.configure("hibernate.cfg.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t= s.beginTransaction();
	try {
		
	   	Student stu =new Student();
	       stu.setStu_name("mani");
	       stu.setFeedBack("your class is good");
	       Student stu2 =new Student();
	       stu2.setStu_name("dinesh");
	       stu2.setFeedBack("your class is poor");  
	       Student stu3 =new Student(); 
	       stu3.setStu_name("ravi");
	       stu3.setFeedBack("your class is average");
	      
	    	ArrayList<Student> x = new ArrayList<>();
	    	x.add(stu);
	    	x.add(stu2);
		    x.add(stu3);
		   
		   Staff f = new Staff();
		   f.setStaff(x);
		   f.setStaff_name("ayan");
		   f.setAsk_q("Give me feedback student");
		   
		   s.save(stu);
		   s.save(stu2);
		   s.save(stu3);
		   s.save(f);
     		t.commit();
			s.close();
			System.out.println("save successfully");

	}
		   
		   catch(HibernateException m ) {
			   System.out.println("hibernate is error" +m);
		   }
	 	

	}
	
}

