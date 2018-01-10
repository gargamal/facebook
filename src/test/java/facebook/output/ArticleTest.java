package facebook.output;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author gargamal
 */
public class ArticleTest
{

    public ArticleTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        final Article article = new Article();
        article.setDateofpost("2016-01-21T18:56:46+0000");
        System.out.println(article.getDateofpost());
        assertEquals("21 janv. 2016 à 18:56", article.getDateofpost());
    }

}
