package facebook.output;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gargamal
 */
@XmlRootElement
public class Presse
{

    private List<Article> article = new ArrayList<>();

    public List<Article> getArticle()
    {
        return article;
    }

    public void setArticle(List<Article> article)
    {
        this.article = article;
    }

    @Override
    public String toString()
    {
        return "Presse{" + "article=" + article + '}';
    }
}
