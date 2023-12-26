import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OrderedStreamTest {

    @Test
    public void testCase1(){

        String expected = "[][aaaaa][bbbbb, ccccc][][ddddd, eeeee]";
        String actual = "";
        OrderedStream os = new OrderedStream(5);

        actual += os.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
        actual += os.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        actual += os.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        actual += os.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
        actual += os.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].

        assertEquals(expected, actual);

    }

}