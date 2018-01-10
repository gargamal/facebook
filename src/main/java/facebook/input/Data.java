package facebook.input;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gargamal
 * https://developers.facebook.com/docs/graph-api/reference/v2.5/post/
 */
@XmlRootElement
public class Data
{

    private String message;
    private String link;
    private String createdTime;
    private String id;
    private String picture;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getLink()
    {
        return link;
    }

    public void setLink(String link)
    {
        this.link = link;
    }

    public String getCreatedTime()
    {
        return createdTime;
    }

    @XmlElement(name = "created_time")
    public void setCreatedTime(String createdTime)
    {
        this.createdTime = createdTime;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getPicture()
    {
        return picture;
    }

    public void setPicture(String picture)
    {
        this.picture = picture;
    }

    @Override
    public String toString()
    {
        return "Data{" + "message=" + message + ", link=" + link + ", createdTime=" + createdTime + ", id=" + id + ", picture=" + picture + '}';
    }
}
