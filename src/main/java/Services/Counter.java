package Services;

public class Counter implements AutoCloseable{
    private static Integer counter = 0;

    public static void add(){
        counter++;
    }

    public static void remove() {
        counter--;
    }

    public static Integer getCount(){
        return counter;
    }

    @Override
    public void close() throws Exception {

    }
}
