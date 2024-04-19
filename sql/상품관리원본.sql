create table product(
    code char (3) not null primary key,
    name VARCHAR (100) not null,
    /* null값이 있으면 못만들게함*/
    price int default 0
    /*값을 넣지않으면 0이 입력됨 디폴트값!*/
);
/*볼수잇는거래,,*/
desc product;

insert into product(code, name, price)
values ('101','냉장고',3500000);
insert into product (code,name,price)
values ('102','세탁기','2300000');
insert into product(code, name, price)
values ('103','스타일러',1700000);

SELECT * from product;
/* SELECT name1 from product; <- 이건name1이없어서안뜨는거임*/
drop table product;



create table sale(
    seq int ,
    code  char (3) not null, /*코드이름은 상관없지만 타입은 맞춰야함*/
    sale_date date default sysdate,
    qnt int default 1,
    primary key (code, sale_date), /*코드랑 세일데이트를 묶어서!*/
    foreign key (code) REFERENCES product(code) /*포린키,참조키,외래키*/
);

insert into sale(seq,code,sale_date,qnt)
values (1,'101','2024-04-01',12); 
insert into sale(seq,code,sale_date,qnt)
values (2,'102','2024-04-01',5); 
insert into sale(seq,code,sale_date,qnt)
values (3,'103','2024-04-02',6); 
insert into sale(seq,code,sale_date,qnt)
values (4,'101','2024-04-03',15); 

desc sale;
SELECT * from sale;
drop table sale;
/*만들때는 부모부터 만들고 지울때는 자식부터 지움*/

create sequence seq_sale increment by 1 start with 5;
/*시퀀스로 증가하게하기 5부터*/
/*DROP sequence seq_sale;
삭제하기는 똑같이 드랍*/

insert into sale(seq,code,sale_date,qnt)
values (seq_sale.nextval,'103','2024-04-05',10); 
/*시퀀스뒤에 넥스트벨류 붙여주기*/

delete from sale where seq=27;
/*1행 삭제하기*/

update sale set qnt=12 where seq=28;

select p.name, p.price,s.* from product  p, sale s
where p.code=s.code;
/*프로덕트에서 이름이랑 가격가져오고,세일에서 전부가져오겟다
근데 이름길어서 줄여준건 웨어절에 말해줌*/

create view view_sale as
select s.code,name,price,sale_date,qnt
from  product  p, sale s where p.code=s.code;
/*각자테이블에서 겹치는 이름(code)은 테이블이름을 붙여줘야하는데 
유일한 이름은 그냥 단독으로써도됨,,*/
select * from view_sale order by qnt desc;
select * from view_sale where name='냉장고';
select * from view_sale where price>=1500000;
select * from view_sale where price>=1500000 order by price desc;
/*뷰를 만들어주면 여러개합친걸 테이블처럼 볼 수 있음!! 만들어주고 셀렉트*/

commit;

select max(code)+1 as code1 from product;
commit;

select * from product;
select * from sale;

delete from product where code='104';

