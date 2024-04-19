create table profe(
    pcode char(3) not null primary key,
    pname varchar(15) not null,
    dept varchar(30),
    hiredate date,
    title varchar(15),
    salary int
);
drop table profe;

insert into profe (pcode,pname,dept,hiredate,title,salary)
values ('221','이병렬','전산','75/04/03','정교수','3000000'); 
insert into profe (pcode,pname,dept,hiredate,title,salary)
values ('228','이재광','전산','91/09/19','부교수','2500000'); 
insert into profe (pcode,pname,dept,hiredate,title,salary)
values ('311','강승일','전자','94/06/09','정교수','2300000'); 
insert into profe (pcode,pname,dept,hiredate,title,salary)
values ('509','오문완','건축','92/10/14','조교수','2000000'); 

select * from profe;

create table student(
    scode char(8) not null primary  key,
    sname varchar(15) not null,
    dept varchar(30), 
    year int default 1, 
    birthday date, 
    advisor char(3),
    foreign key (advisor) references profe (pcode) 
);
select * from student;
drop table student;

insert into student(scode,sname,dept,year,birthday,advisor) 
values('92414029','서연우','전산',3,'73/10/06','228');
insert into student(scode,sname,dept,year,birthday,advisor)
values('92414033','김창덕','전산',4,'73/10/26','221');
insert into student(scode,sname,dept,year,birthday,advisor) 
values('92514009','이지행','전자',4,'73/11/16','311');
insert into student(scode,sname,dept,year,birthday,advisor) 
values('92514023','김형명','전자',4,'73/08/29','311');
insert into student(scode,sname,dept,year,birthday,advisor)
values('92454018','이원구','건축',3,'74/09/30','509');
insert into student(scode,sname,dept,year,birthday,advisor) 
values('95454003','이재영','건축',4,'76/02/06','509');
insert into student(scode,sname,dept,year,birthday,advisor) 
values('95414058','박혜경','전산',4,'76/03/12','221');
insert into student(scode,sname,dept,year,birthday,advisor) 
values('96414404','김수정','전산',3,'77/12/22','228');

commit;