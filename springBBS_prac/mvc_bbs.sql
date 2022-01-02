create table mvc_bbs(
  bNo number(3) primary key,
  bName varchar2(20),
  bSubject varchar2(80),
  bContent varchar2(300),
  bDate date default sysdate,
  bHit number(3) default 0,
  bGroup number(4),
  bStep number(4),
  bIndent number(4)
);

create sequence seq_bbs;