package facebook.param;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author gargamal
 */
public final class ParamFactory
{

    private ParamFactory()
    {
    }

    public static Param get() throws JAXBException
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(Param.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (Param) jaxbUnmarshaller.unmarshal(ParamFactory.class.getResource("params.xml"));
    }
}
