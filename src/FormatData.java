import java.util.ArrayList;
import java.util.List;

public class FormatData implements Format{
    @Override
    public List<String> stringToList(String data) {
        List<String> DataList = new ArrayList<>(List.of(data.split(" ")));
        return DataList;
    }
}
