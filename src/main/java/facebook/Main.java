package facebook;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import facebook.input.Datas;
import facebook.output.PresseFactory;
import facebook.param.Param;
import facebook.param.ParamFactory;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author gargamal
 */
public class Main
{

    public static void main(String[] args) throws JAXBException, IOException
    {
        Param param = ParamFactory.get();

        Client client = Client.create();
        WebResource webResource = client
                .resource(param.getUrl())
                .path(param.getId())
                .path("feed")
                .queryParam("fields", "message,link,created_time,picture")
                .queryParam("limit", String.valueOf(param.getMaxarticles()))
                .queryParam("access_token", param.getToken());

        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

        if (response.getStatus() != 200)
        {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
        }

        Datas datas = response.getEntity(Datas.class);
        PresseFactory.put(Paths.get(param.getPathxml()), datas, param.getMaxword());
    }
}
