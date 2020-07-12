package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    public static void main(String[] args) {
        List<Integer> arrival = new ArrayList<>();
        arrival.add(1);
        arrival.add(2);
        arrival.add(3);
        arrival.add(4);
        arrival.add(5);

        List<Integer> load = new ArrayList<>();
        load.add(6);
        load.add(3);
        load.add(4);
        load.add(4);
        load.add(4);


    }

//    public static List<Integer> solution(int k, List<Integer> arrival, List<Integer> load) {
//        List<Integer> busyServerList = new ArrayList<>();
//        List<Solution3.Server> serverList = new ArrayList<>();
//        List<Solution3.Request> requestList = new ArrayList<>();
//        int numOfRequest = arrival.size();
//
//        for (int i = 1; i <= k; i++) {
//            serverList.add(new Solution3.Server(i));
//        }
//
//        for (int i = 0; i < numOfRequest; i++) {
//            requestList.add(new Solution3.Request(arrival.get(i), load.get(i)));
//        }
//
//        return busyServerList;
//    }
}
