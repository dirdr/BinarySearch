import java.util.*;

class Solution {
    public int solve(int[] tasks, int[] people) {
        if (people.length == 0 || tasks.length == 0) return 0;
       int current_people = people.length-1;
       int current_task = tasks.length-1;
       Arrays.sort(tasks);
       Arrays.sort(people);
       int count = 0;
       while (current_people >= 0 && current_task >= 0) {

           if (people[current_people] >= tasks[current_task]) {
               count++;
               current_task--;
               current_people--;
            }  else {
               current_task--;
           }
       }
       return count;
    }
}
