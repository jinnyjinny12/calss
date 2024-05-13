-- 데이터 삽입

select * from user_info;
select * from call_number;
select * from call_list;
-- select * from call_link;

insert into user_info values (null, '김다영', '면목동');
insert into user_info values (null, '김재석', '고잔동');
insert into user_info values (null, '박하영', '군자동');
insert into user_info values (null, '서은진', '가산동');
insert into user_info values (null, '김민주', '암사동');

insert into call_number values (null, 1, '핸드폰', '010-8846-5954', 'Y');
insert into call_number values (null, 2, '핸드폰', '010-6368-9728', 'Y');
insert into call_number values (null, 3, '핸드폰', '010-8985-3027', 'Y');
insert into call_number values (null, 4, '핸드폰', '010-6270-4016', 'Y');
insert into call_number values (null, 5, '핸드폰', '010-2863-0788', 'Y');



truncate from call_number
where user_no = 5;

select 
	a.user_no,
	a.user_name,
	a.user_address,
	b.call_name,
	b.call_number,
	b.main_call
	from user_info a
	join call_number b on a.user_no = b.user_no;

SELECT
            A.USER_NO,
            A.USER_NAME,
            A.USER_ADDRESS,
            B.CALL_NAME,
            B.CALL_NUMBER,
            B.MAIN_CALL
        FROM USER_INFO A
        JOIN CALL_NUMBER B ON A.USER_NO = B.USER_NO
        WHERE A.USER_NAME = '서은진';