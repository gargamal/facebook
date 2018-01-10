package facebook.param;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gargamal
 */
@XmlRootElement
public class Param
{

    private String id;
    private String token;
    private String url;
    private String pathxml;
    private int maxword;
    private int maxarticles;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getPathxml()
    {
        return pathxml;
    }

    public void setPathxml(String pathxml)
    {
        this.pathxml = pathxml;
    }

    public int getMaxword()
    {
        return maxword;
    }

    public void setMaxword(int maxword)
    {
        this.maxword = maxword;
    }

    public int getMaxarticles()
    {
        return maxarticles;
    }

    public void setMaxarticles(int maxarticles)
    {
        this.maxarticles = maxarticles;
    }

    @Override
    public String toString()
    {
        return "Param{" + "id=" + id + ", token=" + token + ", url=" + url + ", pathxml=" + pathxml + ", maxword=" + maxword + ", maxarticles=" + maxarticles + '}';
    }
}
