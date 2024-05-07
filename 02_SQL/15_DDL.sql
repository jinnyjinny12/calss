/*DDL (data Definition language)*/

/*create*/
-- 테이블을 생성하는 구문이다.
-- tb1 대신 tbl 씀
create table if not exists tb1(
	pk int primary key,
	fk int ,
	coll varchar(255), -- 문자열을 저장할 수 있는 자료형 : varchar
	check(coll in('y','n')) -- check 제약조건 : 데이터를 넣을 떄 조건을 확인.
)engine = INNODB;

describe tb1;

insert into tb1 values (1,10,'y'); -- y, n이 들어가는 값에 z처럼 다른 거가 들어갈 수 없음



-- Alter: 테이블의 구조를 바꾸는 거 
-- 테이블에 추가, 변경, 수정, 삭제하는 모든 것을 alter 명령어를 사용해 적용한다.


alter table tb1
add col2 int not null;
-- not null 제약조건으로 인해 null 을 포함할 수 없다.
insert into tb1 values ( 2,10,'n',null);
describe tb1;

-- column 을 삭제하는 경우
alter table tb1
drop column col2;
describe tb1;

-- 열 이름 및 데이터 형식 변경
alter table tb1
change column fk change_fk int not null; -- fk 라는 컬럼과 제약조건으로 변경
describe tb1;


-- 테이블 생성
create table if not exists tb2(
	pk int primary key auto_increment, -- null 로 놔도 자동으로 값을 채워줌
	fk int ,
	coll varchar(255), -- 문자열을 저장할 수 있는 자료형 : varchar
	check(coll in('y','n')) -- check 제약조건 : 데이터를 넣을 떄 조건을 확인.
)engine = INNODB;

describe tb2; 

-- auto_increment 가 걸려 있는 칼럼은 primart key 제거가 안되므로 auto_increment 를 modify 명령어로 제거한다.
-- modify는 칼럼의 정의를 바꾸는 것이다.
alter table tb2
modify pk int;
-- 테이블의 primary key 는 하나만 가질 수 있어 별도의 칼럼을 지정하지않아도 primary 삭제가 가능하다
alter table tb2
drop primary key;

select * from tb1;

-- 테이블 삭제하기
create table if not exists tb3(
	pk int primary key auto_increment, -- null 로 놔도 자동으로 값을 채워줌
	fk int ,
	coll varchar(255), -- 문자열을 저장할 수 있는 자료형 : varchar
	check(coll in('y','n')) -- check 제약조건 : 데이터를 넣을 떄 조건을 확인.
)engine = INNODB;
 
create table if not exists tb4(
	pk int primary key auto_increment, -- null 로 놔도 자동으로 값을 채워줌
	fk int ,
	coll varchar(255), -- 문자열을 저장할 수 있는 자료형 : varchar
	check(coll in('y','n')) -- check 제약조건 : 데이터를 넣을 떄 조건을 확인.
)engine = INNODB;

create table if not exists tb5(
	pk int primary key auto_increment, -- null 로 놔도 자동으로 값을 채워줌
	fk int ,
	coll varchar(255), -- 문자열을 저장할 수 있는 자료형 : varchar
	check(coll in('y','n')) -- check 제약조건 : 데이터를 넣을 떄 조건을 확인.
)engine = INNODB;

drop table if exists tb3,tb4,tb5, tbl;
show tables;



-- truncate 확인을 위한 테이블 생성
create table if not exists tb3(
	pk int primary key auto_increment, -- null 로 놔도 자동으로 값을 채워줌
	fk int ,
	coll varchar(255), -- 문자열을 저장할 수 있는 자료형 : varchar
	check(coll in('y','n')) -- check 제약조건 : 데이터를 넣을 떄 조건을 확인.
)engine = INNODB;

-- 데이터 insert
insert into tb3 values(null,10,'n');
insert into tb3 values(null,10,'n');
insert into tb3 values(null,10,'n');
insert into tb3 values(null,10,'n');

select * from tb3;
delete from tb3; 
-- delete 했다 추가하면 5부터 시작

-- truncate
-- truncate 했다가 추가하면 1부터 시작
truncate tb3;



-- delete와 의 차이















