create table employee
(first_name  VARCHAR2(32 BYTE),
second_name VARCHAR2(32 BYTE),
date_birth DATE,
phone number,
position VARCHAR2(32 BYTE),
salary number);

begin
insert into employee (first_name,second_name,date_birth,phone,position,salary) values (John, Gashpar, 04041945, 878787877, head, 5000);
insert into employee (first_name,second_name,date_birth,phone,position,salary) values (Eric, Perez, 06041996, 878733877, hr, 3000);
insert into employee (first_name,second_name,date_birth,phone,position,salary) values (Monica, Livigston, 04071985, 875987177, security_officer, 8000);
insert into employee (first_name,second_name,date_birth,phone,position,salary) values (Fedor, fon_Bock, 04011907, 878297877, head_client, 15000);
insert into employee (first_name,second_name,date_birth,phone,position,salary) values (Mariya, Shmaka, 06091995, 872387877, waitor, 1000);
insert into employee (first_name,second_name,date_birth,phone,position,salary) values (Lionel, Muller, 06091967, 872387877, cook, 1000);
end;


create table prepared_food
(number_of_portion number,
portion number,
employee_first_name VARCHAR2(32 BYTE),
order number,
data data)

begin
insert into prepared_food (number_of_portion, portion, cook, order, data) values (1, Eggs, 400, Muller, 4, 02022016);
insert into prepared_food (number_of_portion, portion, cook, order, data) values (2, Meat, 400, Muller, 4, 02022016);
insert into prepared_food (number_of_portion, portion, cook, order, data) values (3, Milk, 400, Muller, 4, 02022016);
insert into prepared_food (number_of_portion, portion, cook, order, data) values (4, Beer, 50000, Muller, 4, 02022016);
insert into prepared_food (number_of_portion, portion, cook, order, data) values (5, Cheese, 400, Muller, 4, 02022016);
end;


create table order
(id_order number,
employee_first_name VARCHAR2(32 BYTE),
portion VARCHAR2(32 BYTE),
number_of_table number,
data data
)

begin
insert into order (id_order, employee_first_name, portion, number_of_table, data) values (1,Shmaka,400,Eggs, 5, 02022016); 
insert into order (id_order, employee_first_name, portion, number_of_table, data) values (2,Shmaka,400,Meat, 1, 02022016); 
insert into order (id_order, employee_first_name, portion, number_of_table, data) values (3,Shmaka,400,Milk, 3, 02022016); 
insert into order (id_order, employee_first_name, portion, number_of_table, data) values (4,Shmaka,50000,Beer, 6, 02022016); 
insert into order (id_order, employee_first_name, portion, number_of_table, data) values (5,Shmaka,400,Cheese, 7, 02022016); 
end;

create table portion
(name VARCHAR2(32 BYTE),
category VARCHAR2(32 BYTE),
ingredients VARCHAR2(32 BYTE),
price number,
weight VARCHAR2(32 BYTE)
);

begin
insert into portion (name, category,ingredients,price, weight) values (Eggs, food, eggs, 300, 500); 
insert into portion (name, category,ingredients,price, weight) values (Meat, food, meat, 600, 500);  
insert into portion (name, category,ingredients,price, weight) values (Milk, cocktails, milk, 600, 500);  
insert into portion (name, category,ingredients,price, weight) values (Beer, alcohol, eggs, 100, 1000);  
insert into portion (name, category,ingredients,price, weight) values (Cheese, food, eggs, 500, 500);
end;   


create table menu
(name VARCHAR2(32 BYTE),
portion_name VARCHAR2(32 BYTE)
);

begin
insert into menu (name, portion_name) value (drinks, Beer);
insert into menu (name, portion_name) value (food, Cheese);
insert into menu (name, portion_name) value (drinks, Milk);
insert into menu (name, portion_name) value (food, Eggs);
insert into menu (name, portion_name) value (food, Meat);
end;

create table ingredients (name
VARCHAR2(32 BYTE))

begin
insert into ingredients (name) value ('Milk'); 
insert into ingredients (name) value ('Beer'); 
insert into ingredients (name) value ('Egg'); 
insert into ingredients (name) value ('Meat'); 
end;

create table store (name_indegrient VARCHAR2(32 BYTE),
count number);

begin
insert into store (name_indegrient,count) value ('Beer', 100);
insert into store (name_indegrient,count) value ('Milk', 20);
insert into store (name_indegrient,count) value ('Meat', 10);
end;