create table professors(
    pcode char(3) primary key,
    pname varchar(15),
    dept varchar(30),
    hiredate date,
    title varchar(15),
    salary int
);
/*테이블 닫기*/
drop table professors;
/*데이터 입력*/
insert into professors(pcode,pname,dept,hiredate,title,salary)
values('221','이병렬','전산','75/04/03','정교수',3000000);
insert into professors(pcode,pname,dept,hiredate,title,salary) 
values('228','이재광','전산','91/09/19','부교수',2500000);
insert into professors(pcode,pname,dept,hiredate,title,salary) 
values('311','강승일','전자','94/06/09','부교수',2300000);
insert into professors(pcode,pname,dept,hiredate,title,salary) 
values('509','오문환','건축','92/10/14','조교수',2000000);

/*데이터 출력*/
select pcode,pname from professors;
/*모든 ㄷㅔ이터 출력*/
select * from professors;

/*데이터 지우기,,,프라이머리키가이니어도 줄이 다 삭제됨*/
delete from professors where pname='이병렬';
/*모든 ㄷㅔ이터 삭제*/
delete from professors where pcode is not null;

/*221번 교수의 이름을 김병렬,학과를 컴정으로 수정*/
update professors SET pname ='김병렬',dept='컴정'
where pcode='221';

select * from professors;

/*검색할때 출력기 조건달아서 검색가능*/
select * from professors where dept='전산';

/*라이크 가드?문,,,,퍼센트로 자리표시,,~ 이런느낌*/
select * from professors where pname like '이%';
select * from professors where pname like '%이';
/*이건 앞뒤에있어서어디있어도 다 검색되게 포함하고있을때*/
select * from professors where pname like '%이%';

/*오더바이 정렬법
    오더바이 뒤에 컬럼대신 컬럼순서를 적어도 됨
     ASC/DESC으로 올림차 내림차임,,
     그냥비워두면 올림차가 기본임,,*/
select * from professors order by salary;
select * from professors order by salary asc;

select * from professors order by salary DESC;

/*입력?하는거인듯?*/
COMMIT;
/*맥스값구해서 연산도가능함!!+1*/
select max(pcode)+1 from professors;
/*별명붙여주는 as임,,,,*/
select max(pcode)+1 as code from professors;0

SELECT * from professors where pcode='228';

delete from professors where pcode='222';

/* where 조건 안달아주면 전체가 다 수정됨,,꼭붙이기!!*/
update professors 
set dept='전자',hiredate='24-05-20',title='정교수',salary=4000000
where pcode='510';