/* ����� ���� */
create user java identified by pass;

/* ����� ���� */
drop user java;

/* ���� �ο� */
grant connect, resource, dba to java;

create user product identified by pass;
grant connect, resource, dba to product;

create user campp identified by pass;
grant connect, resource, dba to campp;
