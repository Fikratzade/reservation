insert into customer (id,is_deleted,updated_date,inserted_date,"name",phone_number)
values  (1,false ,current_timestamp,current_timestamp,'Test1','+994000000001')

insert into customer (id,is_deleted,updated_date,inserted_date,"name",phone_number)
values (2,false ,current_timestamp,current_timestamp,'Test2','+994000000002')



insert into house (id,"name",is_deleted,updated_date,inserted_date)
values (1,'firstHome',(select is_deleted from customer where name='Test1'),
                      (select updated_date from customer where name='Test1'),
                      (select inserted_date from customer where name='Test1'))

insert into house (id,"name",is_deleted,updated_date,inserted_date)
values (2,'firstHome',(select is_deleted from customer where name='Test2'),
                      (select updated_date from customer where name='Test2'),
                      (select inserted_date from customer where name='Test2'))



insert into reservation(id,is_deleted,updated_date,inserted_date,customer_id,house_id)
values (1,(select is_deleted from customer where name='Test1'),
          (select updated_date from customer where name='Test1'),
          (select inserted_date from customer where name='Test1'),
          (select id from customer where name='Test1'),
          (select id from house where id=1))

insert into reservation(id,is_deleted,updated_date,inserted_date,customer_id,house_id)
values (2,(select is_deleted from customer where name='Test2'),
          (select updated_date from customer where name='Test2'),
          (select inserted_date from customer where name='Test2'),
          (select id from customer where name='Test2'),
          (select id from house where id=2))



insert into reservation_day (id,is_deleted,updated_date,inserted_date,reservation_id,"date")
values (1,(select is_deleted from customer where name='Test1'),
          (select updated_date from customer where name='Test1'),
          (select inserted_date from customer where name='Test1'),
          (select id from reservation where customer_id=1),'2023-05-01')

insert into reservation_day (id,is_deleted,updated_date,inserted_date,reservation_id,"date")
values (2,(select is_deleted from customer where name='Test1'),
          (select updated_date from customer where name='Test1'),
          (select inserted_date from customer where name='Test1'),
          (select id from reservation where customer_id=1),'2023-05-02')

insert into reservation_day (id,is_deleted,updated_date,inserted_date,reservation_id,"date")
values (3,(select is_deleted from customer where name='Test2'),
          (select updated_date from customer where name='Test2'),
          (select inserted_date from customer where name='Test2'),
          (select id from reservation where customer_id=2),'2023-05-05')





insert into reservation_detail (id,is_deleted,updated_date,inserted_date,reservation_id,request_date,is_family)
values (1,(select is_deleted from customer where name='Test1'),
          (select updated_date from customer where name='Test1'),
          (select inserted_date from customer where name='Test1'),
          (select id from reservation where house_id=1),'2023-05-01',true )

insert into reservation_detail (id,is_deleted,updated_date,inserted_date,reservation_id,request_date,is_family)
values (2,(select is_deleted from customer where name='Test2'),
          (select updated_date from customer where name='Test2'),
          (select inserted_date from customer where name='Test2'),
          (select id from reservation where house_id=2),'2023-05-05',false )




insert into reservation_payment (id,is_deleted,updated_date,inserted_date,reservation_id,calculated_price,actual_price,advance_payment)
values (1,(select is_deleted from customer where name='Test1'),
          (select updated_date from customer where name='Test1'),
          (select inserted_date from customer where name='Test1'),
          (select id from reservation where house_id=1),120,110,20)

insert into reservation_payment (id,is_deleted,updated_date,inserted_date,reservation_id,calculated_price,actual_price,advance_payment)
values (2,(select is_deleted from customer where name='Test2'),
          (select updated_date from customer where name='Test2'),
          (select inserted_date from customer where name='Test2'),
          (select id from reservation where house_id=2),60,60,10)
