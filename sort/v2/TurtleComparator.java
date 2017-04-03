package com.sd.sort.v2;
import java.util.Date;
import com.sd.turtle.WeightTurtle;
import java.util.*;

public class TurtleComparator implements Comparator {
    public int compare(Object t1, Object t2) {
        return ((WeightTurtle)t1).getWeight()-((WeightTurtle)t2).getWeight();
    }
}