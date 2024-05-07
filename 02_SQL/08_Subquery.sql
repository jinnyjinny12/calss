/*서브쿼리*/
-- 보조적으로 값을 찾아야할 때 쓰는 셀렉트 구문

select 
	category_code
	from tbl_menu
	where menu_name  = '민트미역국';

-- 민트미역국의 카테고리코드가 4번이다.
-- 카테고리 코드가 4번인 것만 고르고 싶다.

select 
 menu_code,
 menu_name,
 menu_price,
 category_code,
 orderable_status
 from tbl_menu
 where category_code = ( select
							category_code
							from tbl_menu
							where menu_name = '민트미역국');

select 
 menu_code,
 menu_name,
 menu_price,
 category_code,
 orderable_status
 from tbl_menu
 where category_code in ( select
							category_code
							from tbl_menu);
							where menu_name = '홍어마카롱');

						
-- from 절에 쓴인 서브쿼리
-- from 안에 들어간 테이블로 조회 테이블을 한정시킴.
					
select
--	max(count)
	*
	from(
	select
	count(*) as 'count'
	from tbl_menu
	group by category_code
	) as countmenu;

-- 카테고리별 평균 가격보다 높은 가격의 메뉴 조회
 select 
 	menu_code,
 	menu_price,
 	category_code,
 	orderable_status
 	from tbl_menu a
 	where menu_price > (select 
 						avg(menu_price) 
 						from tbl_menu 
 						where category_code = a.category_code);
 					

 					
-- exists
-- 조회 결과가 있을 때 true 아니면 false
 
select 
	category_name
	from tbl_category a
	where exists(
	select
		1
		from tbl_menu b
		where b.category_code = a.category_code);
			



