create database employee
use employee
create table employee(
EMPLOYEE_ID int primary key auto_increment,
FIRST_NAME varchar(55) not null,
LAST_NAME varchar(55) not null ,SALARY int,
JOINING_DATE  datetime,
DEPARTMENT varchar(55) not null);
insert into employee( FIRST_NAME,LAST_NAME,SALARY,JOINING_DATE,DEPARTMENT)
values('dinesh','kumar', 100000 ,'2014-02-20 09:00:00','HR'),
('Vishal ','Singhal',300000,'2014-02-20 09:00:00 ','HR'),
('Monika',' Arora' ,100000, '2014-02-20 09:00:00' ,'Admin'),
('Vipul ','Diwan', 200000 ,'2014-06-11 09:00:00' ,'Account');
select*from employee
select First_name as Employee_name from employee
select upper (First_name) from Employee
select distinct Department from Employee 
select substring(First_name,1,3) from Employee
select instr(First_name,binary'd')from Employee where First_name='dinesh'
select rtrim(First_name) from Employee
select ltrim(Department) from Employee
select distinct length(Department) from Employee
select replace(First_name,'a','A')from Employee
select concat(First_name,'',Last_name)as 'Complete_name' from Employee
select*from Employee order by First_name asc
select*from Employee order by First_name asc,Department desc
select*from Employee order by Department desc,Salary asc,First_name asc
select*from Employee where First_name in ('monika','dinesh')
select*from Employee where First_name not in('dinesh','monika')
select*from Employee where Department like 'Admin%'
select*from Employee where First_name like '%a%'
select*from Employee where First_name like '%a'
select*from Employee where First_name like '_____h'
select*from Employee where Salary between 100000 and 500000
select*from Employee where year(Joining_Date)=2014 and month(Joining_Date)=3
select count(*) from Employee where Department ='Admin'
select concat(First_name,'',Last_name)as Employee_name,Salary from Employee where Employee_Id in(select Employee_Id from Employee where Salary between 50000 and 100000)
select Department,count(Employee_ID) No_of_Employees from Employee group by Department order by No_of_Employees desc
select distinct W.First_name,T.Employee_Title from Employee W inner join Title T on W.Employee_ID = T.Employee_Ref_Id and T.Employee_Title in ('HR')
select Employee_Title,Affected_from,count(*) from Title group by Employee_Title,Affected_from having count(*)>1
select*from Employee where mod(Employee_ID,2)<>0
select*from Employee where mod(Employee_ID,2)=0
select curdate(),now()
select*from Employee order by Salary desc limit 10
select distinct Salary from Employee a where 3>=(select count(distinct Salary) from Employee b where a.Salary<=b.Salary)order by a.Salary desc
update Employee set First_name='dinesh' where Employee_ID=004
