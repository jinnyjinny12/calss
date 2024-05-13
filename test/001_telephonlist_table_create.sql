-- 테이블명
-- call_list : 전화번호부
-- call_link : 전화번호 링크
-- user_info : 회원정보
-- call_number : 전화번호



-- user_info : 회원정보
DROP TABLE user_info;
create table if not exists user_info(
	user_no int auto_increment primary key comment '유저번호',
	user_name varchar(255) not null comment '유저이름',
	user_address varchar(255) not null comment '유저주소'
)engine=innodb comment '회원정보';

-- call_list : 전화번호부
DROP TABLE call_list;
create table if not exists call_list(
	call_list_code int auto_increment primary key comment '전화번호부코드',
	user_no int unique comment '유저번호',
	call_name varchar(255) not null comment '전화번호 구분',
 	call_number varchar(255) not null comment '전화번호',
 	main_call varchar(255) check(main_call in ('y', 'n')) comment '상태(대표번호)',
-- 	constraint pk_call_list_code primary key(call_list_code),
	constraint fk_user_no foreign key(user_no) references user_info (user_no)
)engine = innodb comment '전화번호부';

-- call_number : 전화번호
 
DROP TABLE call_number;

create table if not exists call_number(
 	call_code int primary key auto_increment comment '전화번호코드',
 	user_no int not null comment '유저번호',
 	call_name varchar(255) not null comment '전화번호 구분',
 	call_number varchar(255) not null comment '전화번호',
 	main_call varchar(255) check(main_call in ('y', 'n')) comment '상태(대표번호)',
	CONSTRAINT fk_ref_user_no foreign key(user_no) references user_info (user_no)
 ) Engine = innodb comment '전화번호';

-- 전화번호 링크

DROP TABLE call_link;
 create table if not exists call_link(
 	call_list_code int comment '전화번호부 코드',
 	call_code int comment '전화번호 코드',
 	constraint fk_call_list_code foreign key (call_list_code) references user_info(user_no),
 	constraint fk_call_code foreign key (call_code) references call_number (call_code)
 ) engine = innodb comment '전화번호 링크';




