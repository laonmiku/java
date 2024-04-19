desc product

drop table product; //2
drop table sale; //1 �ڽĺ���
drop sequence seq_sale;

create table product(
    code char(3) not null primary key,
    name varchar(200) not null,
    price int default 0
);
desc product;

create table sale(
    seq int  primary key,
    code char(3) not null,
    sale_date date default sysdate,
    qnt int default 1,
    price int default 0,
    foreign key (code) references product(code)
);
desc sale;

insert into product (code,name,price)
values ('101','�����',3500000);
insert into product (code,name,price)
values ('102','��Ź��',2300000);
insert into product (code,name,price)
values ('103','��Ÿ�Ϸ�',1700000);
insert into product (code,name,price)
values ('104','���ڷ�����',1200000);

select*from product;

create sequence seq_sale increment by 1 start with 1;
insert into sale(seq,code)
values(seq_sale.nextval,'101'); 
//�������ѹ����ϸ� ��,,�����̸Ӹ�Ű�� �������ѹ���,,
//������ ������ǰ�ǸŸ� ������ �Է°����ϴܼҸ�

select * from sale;

delete from product where code = '104';

update sale set qnt=12 where seq=1;
//������������ ��ü�� �� qnt12���� �ٲ�,,
delete from sale where seq>0;
//������1���̶� ���� ��������

select s. *,name,price
from product p, sale s
where p.code=s.code;
//�����ٶ� ��ĭ���� ������ ��,,

drop view view_sale;

create view view_sale as
select s. *,p.name
from product p, sale s
where p.code=s.code;

select * from sale where code='102';

insert into sale(seq,code,sale_date,qnt,price)
values (seq_sale.nextval,'101','24-04-01',3,3200000);
insert into sale(seq,code,sale_date,qnt,price)
values (seq_sale.nextval,'101','24-04-02',1,3200000);
insert into sale(seq,code,sale_date,qnt,price)
values (seq_sale.nextval,'101','24-04-02',1,3200000);
insert into sale(seq,code,sale_date,qnt,price)
values (seq_sale.nextval,'102','24-04-02',1,2100000);
insert into sale(seq,code,sale_date,qnt,price)
values (seq_sale.nextval,'101','24-04-03',1,3200000);

select sale_date,code,name,sum(qnt),sum(price*qnt)
from view_sale
group by sale_date,code,name
order by sale_date,code;

select sale_date,code,sum(qnt) as qnt,price,name
from view_sale
group by sale_date,code,price,name
order by sale_date,code;

select * from view_sale;

select sale_date,sum(qnt) as qnt,sum(qnt*price) as total
from view_sale
where code='102'
group by sale_date, price;

commit;