package solution;

import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        List<Integer> arrival = new ArrayList<>();
        arrival.add(1);
        arrival.add(2);
        arrival.add(12);
        arrival.add(5);
        arrival.add(6);
        arrival.add(30);
        arrival.add(32);

        List<Integer> load = new ArrayList<>();
        load.add(15);
        load.add(10);
        load.add(10);
        load.add(10);
        load.add(10);
        load.add(15);
        load.add(10);

        System.out.println(solution(3, arrival, load));
    }

    public static List<Integer> solution(int k, List<Integer> arrival, List<Integer> load) {
        List<Integer> busyServerList = new ArrayList<>();
        List<Server> serverList = new ArrayList<>();
        Queue<Server> serverQue = new ArrayDeque<>();
        List<Request> requestList = new ArrayList<>();
        int numOfRequest = arrival.size();
        int count = 0;

        for (int i = 1; i <= k; i++) {
            serverList.add(new Server(i));
//            serverQue.add(new Server(i));
        }

        for (int i = 0; i < numOfRequest; i++) {
            requestList.add(new Request(arrival.get(i), load.get(i)));
        }

        Collections.sort(requestList);

        viewRequests(requestList);
        viewServers(serverList);

        for (Request req : requestList) {
//                for (Server server : serverList) {
//                    if (server.getFinish() <= req.getArrival()) {
//                        System.out.println("Loaded Req:" + req.toString() + " / " + "Load Server : " + server.getServerNo() + " / " );
//                        server.setRequest(req);
//                        break;
//                    }
//                    serverQue.poll().peek
//                }
//
////            }
            for (int i = 0; i < k; i++) {
                System.out.println("cur count: " + count);
                Server server = serverList.get(count % 3);
                if (server.getFinish() <= req.getArrival()) {
                    System.out.println("Loaded Req:" + req.toString() + " / " + "Load Server : " + server.getServerNo() + " / " );
                    server.setRequest(req);
                    break;
                }
            }
            count++;
        }

        int a = serverList.stream().max((o1, o2) -> {
            return Integer.compare(o1.getLoaded(), o2.getLoaded());
        }).orElse(null).getLoaded();

        for (Server server : serverList) {
            System.out.println(server.toString());
            if (server.getLoaded() == a) {
                busyServerList.add(server.getServerNo());
            }
        }

        return busyServerList;
    }

    private static class Server {
        private int serverNo;
        private int loaded;
        private int finish;

        public Server(int serverNo) {
            this.serverNo = serverNo;
        }

        public int getServerNo() {
            return serverNo;
        }

        public int getLoaded() {
            return loaded;
        }

        public int getFinish() {
            return finish;
        }

        public void setRequest(Request req) {
            this.loaded += req.getLoad();
            this.finish = (req.getArrival() + req.getLoad()) - 1;
        }

        @Override
        public String toString() {
            return "Server{" +
                    "serverNo=" + serverNo +
                    ", loaded=" + loaded +
                    ", finish=" + finish +
                    '}';
        }
    }

    private static class Request implements Comparable<Request> {
        private Integer arrival;
        private Integer load;
        public Request(Integer arrival, Integer load) {
            this.arrival = arrival;
            this.load = load;
        }

        public Integer getArrival() {
            return arrival;
        }

        public Integer getLoad() {
            return load;
        }

        @Override
        public int compareTo(Request o) {
            return this.arrival.compareTo(o.getArrival());
        }

        @Override
        public String toString() {
            return "Request{" +
                    "arrival=" + arrival +
                    ", load=" + load +
                    '}';
        }
    }

    private static void viewRequests(List<Request> reqs) {
        for(Request req : reqs) {
            System.out.println(req.toString());
        }
        System.out.println("-------------------------------");
    }

    private static void viewServers(List<Server> servers) {
        for(Server server : servers) {
            System.out.println(server.toString());
        }
        System.out.println("-------------------------------");
    }
}
