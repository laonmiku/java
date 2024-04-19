create table professors(
    pcode char(3) primary key,
    pname varchar(15),
    dept varchar(30),
    hiredate date,
    title varchar(15),
    salary int
);
/*���̺� �ݱ�*/
drop table professors;
/*������ �Է�*/
insert into professors(pcode,pname,dept,hiredate,title,salary)
values('221','�̺���','����','75/04/03','������',3000000);
insert into professors(pcode,pname,dept,hiredate,title,salary) 
values('228','���籤','����','91/09/19','�α���',2500000);
insert into professors(pcode,pname,dept,hiredate,title,salary) 
values('311','������','����','94/06/09','�α���',2300000);
insert into professors(pcode,pname,dept,hiredate,title,salary) 
values('509','����ȯ','����','92/10/14','������',2000000);

/*������ ���*/
select pcode,pname from professors;
/*��� �������� ���*/
select * from professors;

/*������ �����,,,�����̸Ӹ�Ű���̴Ͼ ���� �� ������*/
delete from professors where pname='�̺���';
/*��� �������� ����*/
delete from professors where pcode is not null;

/*221�� ������ �̸��� �躴��,�а��� �������� ����*/
update professors SET pname ='�躴��',dept='����'
where pcode='221';

select * from professors;

/*�˻��Ҷ� ��±� ���Ǵ޾Ƽ� �˻�����*/
select * from professors where dept='����';

/*����ũ ����?��,,,,�ۼ�Ʈ�� �ڸ�ǥ��,,~ �̷�����*/
select * from professors where pname like '��%';
select * from professors where pname like '%��';
/*�̰� �յڿ��־����־ �� �˻��ǰ� �����ϰ�������*/
select * from professors where pname like '%��%';

/*�������� ���Ĺ�
    �������� �ڿ� �÷���� �÷������� ��� ��
     ASC/DESC���� �ø��� ��������,,
     �׳ɺ���θ� �ø����� �⺻��,,*/
select * from professors order by salary;
select * from professors order by salary asc;

select * from professors order by salary DESC;

/*�Է�?�ϴ°��ε�?*/
COMMIT;
/*�ƽ������ؼ� ���굵������!!+1*/
select max(pcode)+1 from professors;
/*����ٿ��ִ� as��,,,,*/
select max(pcode)+1 as code from professors;0

SELECT * from professors where pcode='228';

delete from professors where pcode='222';

/* where ���� �ȴ޾��ָ� ��ü�� �� ������,,�����̱�!!*/
update professors 
set dept='����',hiredate='24-05-20',title='������',salary=4000000
where pcode='510';