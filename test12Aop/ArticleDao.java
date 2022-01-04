package test12Aop;

public interface ArticleDao {
	
	// insert만 정의
	void insert(Article article);
	
	void updateReadCount(int id, int i);

}
