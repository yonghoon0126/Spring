create table mvc_bbs(
  bNo 				number(3) 	primary key,	/*�޽��� ��ȣ*/
  bName				varchar2(20),				/*�ۼ��� �̸�*/
  bSubject			varchar2(80),				/*�Խ� ����*/
  bContent 			varchar2(300),				/*�ۼ� ����*/
  bDate 			date default sysdate,		/*�ۼ���*/
  bHit number(3) 	default 0,					/*��ȸ��*/
  bGroup number(4),								/*�׷�*/
  bStep number(4),								/*�׷��� ����*/
  bIndent number(4)								/*�׷� ����*/
);

create sequence seq_bbs;

select * from mvc_bbs;
