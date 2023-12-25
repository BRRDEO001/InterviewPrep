import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    private String concatenatedList = "[";
    List <String> pairs;

    public OrderedStream(int n) {

        pairs = new ArrayList<>(n);

    }

    public List<String> insert(int idKey, String value) {
            pairs.set(idKey,value);

            for (int i = idKey; i < pairs.size(); i++){
                if (pairs.get(i+1) != null){
                    concatenatedList += pairs.get(i+1);
                }
        }

        return pairs;
    }
}

