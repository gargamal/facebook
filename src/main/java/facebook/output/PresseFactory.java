package facebook.output;

import facebook.input.Data;
import facebook.input.Datas;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author gargamal
 */
public class PresseFactory
{

    private PresseFactory()
    {
    }

    public static void put(final Path xmlPath, final Datas datas, final int maxWords) throws JAXBException, IOException
    {
        final Presse presse = build(datas, maxWords);

        JAXBContext jaxbContext = JAXBContext.newInstance(Presse.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        try (OutputStream os = Files.newOutputStream(xmlPath))
        {
            jaxbMarshaller.marshal(presse, os);
        }
        jaxbMarshaller.marshal(presse, System.out);
    }

    private static Presse build(final Datas datas, final int maxWords)
    {
        final Presse presse = new Presse();

        for (Data data : datas.getData())
        {
            final Article article = new Article();
            article.setDateofpost(data.getCreatedTime());
            article.setImage(data.getPicture());
            article.setLink(data.getLink());
            article.setText(prepareMessage(data.getMessage(), maxWords));

            presse.getArticle().add(article);
        }

        return presse;
    }

    private static String prepareMessage(final String fullWord, final int maxWords)
    {
        if (fullWord == null || fullWord.isEmpty())
        {
            return "";
        }

        final String[] words = fullWord
                .replace("\n\r", " ")
                .replace("\r\n", " ")
                .replace("\n", " ")
                .replace("\r", " ")
                .replace("\t", " ")
                .split(" ");

        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (int length = words.length; i < maxWords && i < length; i++)
        {
            builder.append(words[i]).append(" ");
        }

        if (i == maxWords)
        {
            builder.append("[...]");
        }

        return builder.toString();
    }
}
