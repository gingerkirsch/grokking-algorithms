package graphs;

import java.util.*;

public class Graphs {
    public static void main(String[] args){
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("you", new ArrayList<>(Arrays.asList("alice", "bob", "claire")));
        graph.put("bob", new ArrayList<>(Arrays.asList("anuj", "peggy")));
        graph.put("alice", new ArrayList<>(Arrays.asList("peggy"));
        graph.put("claire", new ArrayList<>(Arrays.asList("thom", "jonny"));
        graph.put("anuj", new ArrayList<>());
        graph.put("peggy", new ArrayList<>());
        graph.put("thom", new ArrayList<>());
        graph.put("jonny", new ArrayList<>());


        Map<String, Map<String, List<String>> graphWithWeight = new HashMap<>();
        graph.p
    }

    // BFS
    // queue of people, pop one - if condition then end, if no - add his children to the end of queue and pick next
    // if queue is empty in the end - condition cannot be fullfileld


    /* def search(name):
    search_queue = deque() search_queue += graph[name] searched = []
            while search_queue:
    person = search_queue.popleft() if not person in searched:
            if person_is_seller(person):
    print person + “ is a mango seller!” return True
    This array is how you keep track of which people you’ve searched before.
    Only search this person if you
    Marks this person as searched
        else:
    search_queue += graph[person] searched.append(person)
            return False search(“you”)*/



    // Dijkstra for weighted
    // find lowest cost node
}
