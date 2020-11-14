package lab2;

import org.apache.hadoop.io.WritableComparable;

public class Pair implements WritableComparable<Pair> {

    public int id;
    public Type type;

    Pair(){

    }
}
