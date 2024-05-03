select 
 	menu_code,
 	menu_name,
 	menu_price
 from tbl_menu
 
order by menu_price asc; -- asc : 오름 차순 정렬, desc: 내림차순 정렬

-- order by 절을 사용하여 결과 집합의 여러 열로 정렬

select 
	menu_code,
	menu_name,
	menu_price
	from tbl_menu
order by
	menu_price desc,  -- 먼저 온 애가 우선이다. 가격을 기준으로 내림차순 먼저 진행
	menu_name asc;
	


-- 메뉴의 코드,이름, 메뉴 코드* 가격을 조회한다. 
-- 정렬 기준은 코드의 오름차순이다.

select 
	menu_code,
	menu_name,
	menu_price*menu_code 
	from tbl_menu
order by
	menu_code asc;
	
-- 
select 
	field('C', 'A','B','C');
-- 맨 앞에 값이 몇 번째랑 같은지 찾기
-- 맨 앞에 값이랑 A가 같으면 1


select 
	menu_code,
	menu_name,
	menu_price,
	field(orderable_status, 'N','Y')
	from tbl_menu;
-- N =1, Y=2이 아니면 2번.
	

select 
	*
	from tbl_menu
	order by field(orderable_status,'N','Y') 
	

select 
	
	category_code,
	category_name,
	ref_category_code 
	from tbl_category
order by ref_category_code is null desc; 
	
	
