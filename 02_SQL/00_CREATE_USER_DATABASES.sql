-- 관리자 계정으로 사용 가능한 구분
-- USE mysql;
-- 
-- 새로운 계정 만들기
-- CREATE USER 'gangnam'@'%' IDENTIFIED BY 'gangnam';
-- 
-- 데이터베이스 목록 보기
-- SHOW DATABASES;
-- 
-- mysql 데이터베이스 사용하기
-- USE mysql;
-- 
-- 현재 접속한 데이터베이스의 테이블 목록을 확인한다
-- SHOW TABLES;
-- 
-- user 테이블의 모든 칼럼을 조회한다.
-- select * from user;
-- 
-- gangnam 데이터베이스를 만든다.
-- create database gangnam;

-- gangnam 이라는 데이터베이스에 gangnam 계정에서 권한을 부여하며 사용할 수 있도록 함.
Grant all Privileges on gangnam.* to 'gangnam'@'%';

