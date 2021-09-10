import java.util.*;

class MinimumStack {


    ArrayList<Integer> list;
    int min;

    public MinimumStack() {
        this.list = new ArrayList<>();
        this.min = Integer.MAX_VALUE;
    }

    public void append(int val) {
        min = val < min ? val: min;
        list.add(val);
    }
    public int peek() {
        return list.get(list.size()-1); 
    }
    public int min() {
        return this.min;
    }
    public int pop() {
        int element = list.get(list.size()-1);
        if (element == min) {
            min = Integer.MAX_VALUE;
            for (int num: this.list) {
                min = num < min && num != element ? num: min;
            }
        }
        list.remove(list.size()-1);
        return element;
    }

}
