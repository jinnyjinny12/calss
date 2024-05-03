-- limit
-- 출력하는 수의 제한을 둔다.

select 
	menu_code,
	menu_name,
	menu_price
	from tbl_menu
	order by menu_price ;

-- 가격이 높은 메뉴 3가지
select 
	menu_code,
	menu_name,
	menu_price
	from tbl_menu
	order by menu_price desc
	limit 3;


-- 2번 행부터 5번 행까지 조회
select 
	menu_code,
	menu_name,
	menu_price
	from tbl_menu
	order by menu_code
	limit 3,5; -- 3번 이후부터 5개를 출력한다.

	-- 상위행 5개 추가
select 
	menu_code,
	menu_name,
	menu_price
	from tbl_menu
	order by 
		menu_PRICE desc, -- 이거 필기 다시해야 함.
		menu_name asc
	limit 5;	

	

