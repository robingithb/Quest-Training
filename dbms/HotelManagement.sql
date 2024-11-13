use hotel_management;

-- Customers: Information about customers who book rooms.
-- customer_id (PK)
-- first_name
-- last_name
-- email
-- phone_number
-- address
create table customers (customer_id int primary key auto_increment ,
			first_name varchar(30) not null ,
            last_name varchar(30) ,
            email varchar(50) unique not null,
            phone_number varchar(50) unique not null,
            address varchar(50) not null 
            );

-- Rooms: Information about rooms available in the hotel.
-- room_id (PK)
-- room_type (e.g., single, double, suite)
-- price_per_night
-- status (e.g., available, occupied, under maintenance)
-- floor_number
create table rooms (room_id int primary key auto_increment , 
			room_type varchar(10) not null,
            price_per_night decimal(10,2) not null,
            room_status varchar(20) not null,
            floor_number int not null
            );

-- Reservations: Customers can reserve rooms for specific dates.
-- reservation_id (PK)
-- customer_id (FK from Customers)
-- room_id (FK from Rooms)
-- reservation_date
-- check_in_date
-- check_out_date
-- status (e.g., confirmed, cancelled, completed)
--            
create table reservations ( reservations_id int primary key auto_increment ,
			customer_id int not null,
            room_id int not null,
            reservation_date date not null ,
            check_in_date date not null ,
            check_out_date date not null,
            reservation_status varchar(15) not null,
            foreign key (customer_id) references customers(customer_id),
            foreign key (room_id) references rooms(room_id),
            check ( check_in_date > reservation_date and check_in_date < check_out_date)
            );

-- Payments: Information about payments made for reservations.
-- payment_id (PK)
-- reservation_id (FK from Reservations)
-- payment_date
-- amount_paid
-- payment_method (e.g., credit card, cash)
create table payments (payment_id int primary key auto_increment,
			reservations_id int not null,
            payment_date date not null,
            amount_paid decimal(10,2) not null,
            payment_method varchar(15),
            foreign key (reservations_id) references reservations (reservations_id)
            );
            
-- Staff: Hotel staff members who handle reservations and check-ins.
-- staff_id (PK)
-- first_name
-- last_name
-- role (e.g., receptionist, manager, housekeeper)
-- hire_date
create table staff (staff_id int primary key auto_increment,
			first_name varchar(20) not null,
            last_name varchar(20),
            staff_role varchar(25) not null,
            hire_date date not null
			);

-- Room Assignments: Each room can be assigned to a staff member for cleaning or maintenance.
-- assignment_id (PK)
-- staff_id (FK from Staff)
-- room_id (FK from Rooms)
-- assignment_date
-- task_description
create table room_assignment ( assignment_id int primary key auto_increment,
			staff_id int not null,
            room_id int not null,
            assignment_date date not null,
            task_desc varchar(50) not null,
            foreign key (staff_id) references staff(staff_id),
            foreign key (room_id) references rooms(room_id)
            );


insert into customers (first_name,last_name,email,phone_number,address) values
			("Robin","Thomas","robin@gmail.com","8156822332","Kanjany, Thrissur"),
            ("Shobin","Pious","Shobin@gmail.com","8156822311","Manalur, Thrissur"),
            ("Praveen","Kumar","Praveen@gmail.com","8156822333","Kochi, Ekm"),
            ("Haneen","Salim","haneen@gmail.com","8156822344","Attingal, Tvm"),
            ("Hanna","Amal","hanna@gmail.com","8156822399","Aluva, Ekm");
            
insert into rooms (room_type,price_per_night,room_status,floor_number) values
			("single",1000,"available",2),
            ("double",2500,"available",3),
            ("suite",3500,"available",4),
            ("single",1000,"occupied",2),
            ("double",2500,"under_maintenance",3);
            
insert into reservations (customer_id,room_id,reservation_date,check_in_date,check_out_date,reservation_status) values
		(1,1,"2023-04-01","2023-04-05","2023-04-06","completed"),
        (2,2,"2023-05-01","2023-05-05","2023-05-06","cancelled"),
        (3,3,"2023-06-01","2023-06-05","2023-06-06","confirmed"),
        (4,4,"2023-07-01","2023-07-05","2023-07-06","cancelled"),
        (1,1,"2023-08-01","2023-08-05","2023-08-06","confirmed");
insert into reservations (customer_id,room_id,reservation_date,check_in_date,check_out_date,reservation_status) values
		(2,1,"2023-09-01","2023-09-05","2023-09-15","confirmed");
	
insert into payments (reservations_id,payment_date,amount_paid,payment_method) values
		(1,"2023-04-06",1000,"credit_card"),
        (3,"2023-06-01",3500,"cash"),
        (4,"2023-07-06",1000,"credit_card"),
        (5,"2023-08-06",1000,"credit_card");
insert into payments (reservations_id,payment_date,amount_paid,payment_method) values
		(1,"2024-10-29",1000,"cash");

insert into staff (first_name,last_name,staff_role,hire_date) values
		("Ravi","Sree","receptionist","2022-01-01"),
        ("Reshame","Kumar","house_keeper","2023-01-01"),
        ("Jithin","Khan","cheff","2024-01-01"),
        ("Kalam","Sing","manager","2021-01-01"),
        ("Jaun","Kim","staff_head","2021-01-01");
insert into staff (first_name,last_name,staff_role,hire_date) values ("Edwin","Limson","house_keeper","2024-01-01"),
				("Syam","Jith","house_keeper","2022-01-01");
                
insert into room_assignment (staff_id,room_id,assignment_date,task_desc) values
		( 3,1,"2024-05-01","daily service"),
        ( 6,2,"2024-04-01","cleaning"),
        ( 7,3,"2024-06-01","daily service"),
        ( 5,4,"2024-05-01","feedback"),
        ( 4,5,"2024-05-04","checking");
insert into room_assignment (staff_id,room_id,assignment_date,task_desc) values
		( 7,5,"2024-05-01","maintenance");
insert into room_assignment (staff_id,room_id,assignment_date,task_desc) values
		( 7,3,"2024-10-21","maintenance");
select * from customers;
select * from rooms;
select * from reservations;
select * from payments;
select * from staff;
select * from room_assignment;

-- Retrieve all information about rooms available on a specific floor.
-- Use WHERE and JOIN with the Rooms and Reservations tables.
select r.room_type,
	r.price_per_night,
    s.reservation_date,
    s.check_in_date,
    s.check_out_date,
    s.reservation_status
	from rooms r inner join reservations s on r.room_id = s.room_id
    where r.room_status  = "available" and floor_number=2;
    
-- List all reservations with customer details (first name, last name, email) sorted by check-in date (earliest first).
-- Use ORDER BY to sort the results.
select c.first_name,
	c.last_name,
    c.email,
    r.reservation_date,
    r.check_in_date,
    r.check_out_date
    from customers c inner join reservations r on c.customer_id = r.customer_id  order by check_in_date asc;
    
-- Find all customers who have reserved rooms for more than 5 nights.
-- Use DATEDIFF function to calculate the number of nights.
select c.first_name,
	c.last_name
    from customers c inner join reservations r on c.customer_id = r.customer_id
    where datediff(r.check_out_date, r.check_in_date)>5;
		
-- Get the total amount paid for each reservation.
-- Use SUM() to aggregate the payment amounts and group by reservation.
select r.reservations_id , sum(p.amount_paid) from payments p
		inner join reservations r on p.reservations_id = r.reservations_id group by r.reservations_id;
        
-- Find the average room price for each room type.
-- Use GROUP BY with AVG().
select room_type,avg(price_per_night) from rooms group by room_type;

-- Display the total revenue generated from all reservations in the last month.
-- Use SUM() and WHERE with date filters.
select sum(p.amount_paid) from payments p inner join reservations r on p.reservations_id = r.reservations_id
		where p.payment_date >= date_sub(curdate(), interval 1 month);

-- Find the staff members who have been assigned the most rooms for cleaning or maintenance in the last month.
-- Use JOIN between Staff and Room Assignments, and GROUP BY to count the number of assignments.
select s.staff_id,
    s.first_name,
    s.last_name,
    count(r.assignment_id) as assignment_count
from staff s inner join room_assignment r on s.staff_id = r.staff_id
where r.assignment_date >= date_sub(curdate(), interval 1 month)
    and(r.task_desc = 'cleaning' or r.task_desc = 'maintenance') group by s.staff_id order by  assignment_count DESC;


-- Retrieve the most recent reservation for each customer.
-- Use JOIN, GROUP BY, and ORDER BY to get the latest reservation per customer.

select 
    r.reservations_id,
    r.customer_id,
    r.room_id,
    r.reservation_date,
    r.check_in_date,
    r.check_out_date,
    r.reservation_status
from reservations r where  r.reservation_date = (
        select max(reservation_date)
        from reservations
        where customer_id = r.customer_id
    );


-- Bonus Task:
-- Room Availability Check: Create a query that checks which rooms are available for a given date range (i.e., not reserved for those dates).
-- Use NOT EXISTS or LEFT JOIN to find rooms with no overlapping reservations

select r.room_id, r.room_type, r.price_per_night, r.room_status, r.floor_number
from rooms r
left join reservations res on r.room_id = res.room_id
    and (
        res.check_in_date <= 2023-05-05 and res.check_out_date >=  2023-09-05
    )
where res.reservations_id  is null and room_status = "available" ;



            