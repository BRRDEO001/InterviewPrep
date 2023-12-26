import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    private String [] stream;
    private int pointer;

    public OrderedStream(int n) {
      stream = new String[n];
      pointer = 0;

    }

    public List<String> insert(int idKey, String value) {
            List<String> result = new ArrayList<>();
            stream[idKey-1] = value;

            while(pointer < stream.length && stream[pointer] != null){
                result.add(stream[pointer]);
                pointer++;
            }


        return result;
    }
}

