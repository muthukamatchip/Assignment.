package mk;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Staff")
public class Staff 
{	
		@Id  
	    @GeneratedValue(strategy=GenerationType.TABLE)  
		private int staff_id;
		private String staff_name;
		private String Ask_q;
		@OneToMany(targetEntity=Student.class,cascade=CascadeType.ALL)
		@JoinColumn(name="staff_id")
		private List<Student> Staff;
		
		public List<Student> getStaff() {
			return Staff;
		}
		public void setStaff(List<Student> staff) {
			Staff = staff;
		}
		public String getAsk_q() {
			return Ask_q;
		}
		public void setAsk_q(String ask_q) {
			Ask_q = ask_q;
		}
		public int getStaff_id() {
			return staff_id;
		}
		public void setStaff_id(int staff_id) {
			this.staff_id = staff_id;
		}
		public String getStaff_name() {
			return staff_name;
		}
		public void setStaff_name(String staff_name) {
			this.staff_name = staff_name;
		}
		
	
		
	
	}

