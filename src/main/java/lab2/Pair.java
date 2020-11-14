package lab2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Pair implements WritableComparable<Pair> {

    public IntWritable id, type;

    Pair(){
        id = new IntWritable();
        type = new IntWritable();
    }

    public Pair(Integer id, Integer type){
        this.id = new IntWritable(id);
        this.type = new IntWritable(type);
    }

    @Override
    public int compareTo(Pair o) {
        return 0;
    }

    @Override
    public void write(DataOutput out) throws IOException {

    }

    @Override
    public void readFields(DataInput in) throws IOException {

    }
}
