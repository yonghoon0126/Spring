create table mvc_bbs(
  bNo 				number(3) 	primary key,	/*메시지 번호*/
  bName				varchar2(20),				/*작성자 이름*/
  bSubject			varchar2(80),				/*게시 제목*/
  bContent 			varchar2(300),				/*작성 내용*/
  bDate 			date default sysdate,		/*작성일*/
  bHit number(3) 	default 0,					/*조회수*/
  bGroup number(4),								/*그룹*/
  bStep number(4),								/*그룹의 순서*/
  bIndent number(4)								/*그룹 레벨*/
);

create sequence seq_bbs;

select * from mvc_bbs;
