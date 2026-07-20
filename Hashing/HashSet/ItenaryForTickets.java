// itinerary for the tickets.

import java.util.HashMap;

public class ItenaryForTickets {
    public static String getStarting(HashMap<String,String> tickets) {
       HashMap<String,String> revTicket = new HashMap<>();
        for(String i:tickets.keySet()){
            revTicket.put(tickets.get(i),i);
       }
       for (String key : tickets.keySet()) {
            if(!revTicket.containsKey(key)){
                return key;
            }
       }
       return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        // Finding startig Point
        String sk = getStarting(tickets);
        System.out.print(sk);
        for (String key : tickets.keySet()){
            System.out.print("->"+tickets.get(sk));
            sk = tickets.get(sk);
        }
        System.out.println();
    }
}
