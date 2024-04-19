create table product(
    code char (3) not null primary key,
    name VARCHAR (100) not null,
    /* null���� ������ ���������*/
    price int default 0
    /*���� ���������� 0�� �Էµ� ����Ʈ��!*/
);
/*�����մ°ŷ�,,*/
desc product;

insert into product(code, name, price)
values ('101','�����',3500000);
insert into product (code,name,price)
values ('102','��Ź��','2300000');
insert into product(code, name, price)
values ('103','��Ÿ�Ϸ�',1700000);

SELECT * from product;
/* SELECT name1 from product; <- �̰�name1�̾���ȶߴ°���*/
drop table product;



create table sale(
    seq int ,
    code  char (3) not null, /*�ڵ��̸��� ��������� Ÿ���� �������*/
    sale_date date default sysdate,
    qnt int default 1,
    primary key (code, sale_date), /*�ڵ�� ���ϵ���Ʈ�� ���!*/
    foreign key (code) REFERENCES product(code) /*����Ű,����Ű,�ܷ�Ű*/
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
/*���鶧�� �θ���� ����� ���ﶧ�� �ڽĺ��� ����*/

create sequence seq_sale increment by 1 start with 5;
/*�������� �����ϰ��ϱ� 5����*/
/*DROP sequence seq_sale;
�����ϱ�� �Ȱ��� ���*/

insert into sale(seq,code,sale_date,qnt)
values (seq_sale.nextval,'103','2024-04-05',10); 
/*�������ڿ� �ؽ�Ʈ���� �ٿ��ֱ�*/

delete from sale where seq=27;
/*1�� �����ϱ�*/

update sale set qnt=12 where seq=28;

select p.name, p.price,s.* from product  p, sale s
where p.code=s.code;
/*���δ�Ʈ���� �̸��̶� ���ݰ�������,���Ͽ��� ���ΰ������ٴ�
�ٵ� �̸��� �ٿ��ذ� �������� ������*/

create view view_sale as
select s.code,name,price,sale_date,qnt
from  product  p, sale s where p.code=s.code;
/*�������̺��� ��ġ�� �̸�(code)�� ���̺��̸��� �ٿ�����ϴµ� 
������ �̸��� �׳� �ܵ����νᵵ��,,*/
select * from view_sale order by qnt desc;
select * from view_sale where name='�����';
select * from view_sale where price>=1500000;
select * from view_sale where price>=1500000 order by price desc;
/*�並 ������ָ� ��������ģ�� ���̺�ó�� �� �� ����!! ������ְ� ����Ʈ*/

commit;

select max(code)+1 as code1 from product;
commit;

select * from product;
select * from sale;

delete from product where code='104';

