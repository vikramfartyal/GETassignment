/*Assignment4*/
create table auto_zipcode_map(
zipcode int,
state varchar(20),
city varchar(20),
primary key(zipcode)
);

insert into auto_zipcode_map(zipcode,state,city)
values(332402,'Jharkhand', 'Ranchi'),
(302014,'Rajasthan', 'Jaipur');

select zipcode,city,state
from auto_zipcode_map
order by state,city;