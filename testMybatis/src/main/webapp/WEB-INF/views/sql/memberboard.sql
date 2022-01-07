
/* Drop Tables */

DROP TABLE tab_comment CASCADE CONSTRAINTS;
DROP TABLE tab_board CASCADE CONSTRAINTS;
DROP TABLE tab_board_info CASCADE CONSTRAINTS;
DROP TABLE tab_user CASCADE CONSTRAINTS;


/* Drop Sequences */

DROP SEQUENCE seq_board;
DROP SEQUENCE seq_board_info;
DROP SEQUENCE seq_comment;


/* Create Sequences */

CREATE SEQUENCE seq_board;
CREATE SEQUENCE seq_board_info;
CREATE SEQUENCE seq_comment;


/* Create Tables */

CREATE TABLE tab_board
(
	no number NOT NULL,
	title varchar2(100) NOT NULL,
	content varchar2(4000) NOT NULL,
	regdate date DEFAULT sysdate NOT NULL,
	count number DEFAULT 0 NOT NULL,
	good number DEFAULT 0 NOT NULL,
	bad number DEFAULT 0 NOT NULL,
	user_id varchar2(20) NOT NULL,
	bno number NOT NULL,
	PRIMARY KEY (no)
);


CREATE TABLE tab_board_info
(
	bno number NOT NULL,
	bname varchar2(100) NOT NULL,
	user_id varchar2(20) NOT NULL,
	PRIMARY KEY (bno)
);


CREATE TABLE tab_comment
(
	cno number NOT NULL,
	no number NOT NULL,
	bno number NOT NULL,
	user_id varchar2(20) NOT NULL,
	bcomment varchar2(300) NOT NULL,
	regdate date DEFAULT sysdate NOT NULL,
	PRIMARY KEY (cno)
);

/* Create Foreign Keys */

ALTER TABLE tab_comment
	ADD FOREIGN KEY (no)
	REFERENCES tab_board (no);


ALTER TABLE tab_board
	ADD FOREIGN KEY (bno)
	REFERENCES tab_board_info (bno);


ALTER TABLE tab_comment
	ADD FOREIGN KEY (bno)
	REFERENCES tab_board_info (bno);


ALTER TABLE tab_board_info
	ADD FOREIGN KEY (user_id)
	REFERENCES tab_user (user_id);


ALTER TABLE tab_comment
	ADD FOREIGN KEY (user_id)
	REFERENCES tab_user (user_id);

ALTER TABLE tab_board
	ADD FOREIGN KEY (user_id)
	REFERENCES tab_user (user_id);
	
/* ************************************************  */

/* Create Tables */
drop table tab_user;
CREATE TABLE tab_user
(
	user_id 		varchar2(20) NOT NULL,
	user_name 		varchar2(20) NOT NULL,
	user_pwd 		varchar2(100) NOT NULL,
	user_pwd_hint 	varchar2(200) NOT NULL,
	user_pwd_answer varchar2(100) NOT NULL,
	user_gender 	number(1) DEFAULT 1 NOT NULL,
	user_email 		varchar2(60),
	user_phone v	archar2(16),
	user_zipcode 	varchar2(7) NOT NULL,
	user_addr1 		varchar2(100) NOT NULL,
	user_addr2 		varchar2(50) NOT NULL,
	user_regdate 	date DEFAULT sysdate NOT NULL,
	user_lastip 	varchar2(30),
	user_level n	umber(3) DEFAULT 0 NOT NULL,
	user_status 	number(1) DEFAULT 0 NOT NULL,
	PRIMARY KEY (user_id)
);


CREATE TABLE  "ZIPCODE" 
   (	"ID" NUMBER(*,0), 
	"ZIPCODE" VARCHAR2(7), 
	"SIDO" VARCHAR2(10), 
	"GUGUN" VARCHAR2(19), 
	"DONG" VARCHAR2(36), 
	"RI" VARCHAR2(51), 
	"BUNJI" VARCHAR2(20), 
	 PRIMARY KEY ("ID") ENABLE
   ) ;


select user_id, user_name
	from tab_user
	where user_id = 'test1' and  user_pwd ='1234';



SELECT zipcode, sido||' '||gugun||' '||dong||' '||ri||' '||bunji as addr1 
	from zipcode where dong like '%' ||'공덕' ||'%' ;

delete  from tab_user;
	
select * from tab_user;


create table cash(money number, 
name varchar2(100));

create table bank(money number, name varchar2(100));

insert into cash values(100000, '홍길동');

insert into bank values(100000, '홍길동');

select * from bank;




