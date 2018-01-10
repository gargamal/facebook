package facebook.output;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gargamal
 */
@XmlRootElement
public class Article
{

    private String image;
    private String text;
    private String dateofpost;
    private String link;

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getDateofpost()
    {
        return dateofpost;
    }

    public void setDateofpost(String dateofpost)
    {
        this.dateofpost = LocalDateTime.parse(dateofpost.replace("0000", "00:00"), DateTimeFormatter.ISO_DATE_TIME).format(DateTimeFormatter.ofPattern("d MMM uuuu à HH:mm"));
    }

    public String getLink()
    {
        return link;
    }

    public void setLink(String link)
    {
        this.link = link;
    }

    @Override
    public String toString()
    {
        return "Article{" + "image=" + image + ", text=" + text + ", dateofpost=" + dateofpost + ", link=" + link + '}';
    }
}
