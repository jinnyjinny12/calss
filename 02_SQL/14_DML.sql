/*DML (Data manipulation language)*/
-- insert, update, delete, select(DQL)
-- : 데이터 조작 언어, 테이블에 값을 삽입하거나, 수정하거나
-- 삭제하거나, 조회하는 언어

-- 데이터의 상태를 변화시킴 : transaction 
-- transaction : 데이터를 삭제, 조회, 변경 등을 하는 부분(insert, update, delete 등등)
-- 데이터베이스는 동시성 문제가 있음.

-- Insert 
-- 새로운 행을 추가하는 구문이다.
-- 테이블 행의 수가 증가한다.
select * from tbl_menu;
select * from tbl_category;

insert into tbl_menu values (null, '바나나해장국', 8500, 4, 'Y');

insert into tbl_menu (menu_name, menu_price, category_code, orderable_status
			)values(
			'초콜릭죽', 6000, 7, 'Y');

-- 등록하는 칼럼의 순서는 상관없다.
-- 단 칼럼의 순서에 맞는 값을 매칭해야 한다.
insert into tbl_menu (menu_name, orderable_status, category_code, menu_price 
			)values(
			'뺵사이즈 아메리카노','Y', 7, 3000);

		
		
-- multi insert
-- 여러개를 넣어줄 수 있따. 
-- 단, 엑셀을 사용하거나 하기 때문에 잘 쓰지 않는다. 반복문이 더 편하다.
insert into tbl_menu 
	values(null, '해장국',8500, 4, 'Y'),
	(null, '뼈다귀 해장국',8500, 4, 'Y'),
	(null, '왕뚝배기 해장국',8500, 4, 'Y');
		
		
select * from tbl_menu;

-- update
-- 테이블에 기록된 칼럼의 값을 수정하는 구문이다.
-- 테이블의 전체 행 개수는 변화가 없다.

select 
	menu_code,
	category_code
	from tbl_menu
	where menu_name = "바나나해장국";

update tbl_menu
	set menu_name = '바나나 탕후루'
	where menu_code = 22;

update tbl_menu
	set category_code = 6
	where menu_code = (select 
							tmp.menu_code
						from (
							select 
							menu_code
							from tbl_menu
							where menu_name = '바나나 탕후루')as tmp);

						
-- DELETE
-- 가장 비싼 가격 2가지가 모두 삭제됨
delete from tbl_menu
order by menu_price; desc
limit 2;

select * from tbl_menu order by menu_price desc;


-- 8500 짜리 메뉴가 모두 삭제됨
delete from tbl_menu
where menu_price = 8500;
						


-- replace 
-- insert 시 primary key 또는 uniqe key가 충돌이 발생할 수 있다면
-- replace를 통해 중복된 데이터를 덮어쓸 수 있다.

replace into tbl_menu values (12, '참기름라떼', 5000, 10, 'Y');
insert into tbl_menu values (12, '참기름라떼', 5000, 10, 'Y');


select * from tbl_menu;






