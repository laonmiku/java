desc product

drop table product; //2
drop table sale; //1 자식부터
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
values ('101','냉장고',3500000);
insert into product (code,name,price)
values ('102','세탁기',2300000);
insert into product (code,name,price)
values ('103','스타일러',1700000);
insert into product (code,name,price)
values ('104','전자레인지',1200000);

select*from product;

create sequence seq_sale increment by 1 start with 1;
insert into sale(seq,code)
values(seq_sale.nextval,'101'); 
//같은거한번더하면 들어감,,프라이머리키가 시퀀스넘버라,,
//같은날 같은물품판매를 여러번 입력가능하단소리

select * from sale;

delete from product where code = '104';

update sale set qnt=12 where seq=1;
//웨어절없으면 전체가 다 qnt12개로 바뀜,,
delete from sale where seq>0;
//시작이1번이라 모든게 지워진다

select s. *,name,price
from product p, sale s
where p.code=s.code;
//별명줄땐 한칸띄우고 적으면 됨,,

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