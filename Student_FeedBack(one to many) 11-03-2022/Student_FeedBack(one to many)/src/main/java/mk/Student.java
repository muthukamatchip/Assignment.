package mk;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Student")
public class Student {
  @Id
  @GeneratedValue(strategy =GenerationType.TABLE)
	private int Stu_id;
     private String stu_name,FeedBack;
public int getStu_id() {
	return Stu_id;
}
public void setStu_id(int stu_id) {
	Stu_id = stu_id;
}
public String getStu_name() {
	return stu_name;
}
public void setStu_name(String stu_name) {
	this.stu_name = stu_name;
}
public String getFeedBack() {
	return FeedBack;
}
public void setFeedBack(String feedBack) {
	FeedBack = feedBack;
}
}
  
