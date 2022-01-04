package test13Aop;

public class ReadArticleServiceImpl implements ReadArticleService{
	
	@Override
	public Article readArticle(Integer articleId) {
		return new Article();
	}

}
