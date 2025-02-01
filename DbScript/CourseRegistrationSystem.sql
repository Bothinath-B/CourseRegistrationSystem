create database courseRegSys;
use courseRegSys;

select * from courses;
-- select * from customcid;

insert into courses values
(901,"Java Essentials",4,"Balaji"),
(902,"Python For ML",6,"Karthick"),
(903,"Spring Boot",8,"Balaji");

insert into course_registry(id,course_name,email_id,name)values(101,"Python For ML","saif@gmail.com","Saif");
-- select * from customcrid;
select * from course_registry;