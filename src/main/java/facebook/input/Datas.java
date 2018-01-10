package facebook.input;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gargamal
 */
@XmlRootElement
public class Datas
{

    private List<Data> data = new ArrayList<>();

    public List<Data> getData()
    {
        return data;
    }

    public void setData(List<Data> data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "Datas{" + "data=" + data + '}';
    }
}
