public class Edge {
    // This class connects two Tasks with an edge.
    
    // Field declarations
    private Task origin;
    private Task destination;
    
    // Constructor
    public Edge(Task origin, Task destination){
        this.origin = origin;
        this.destination = destination;
    }
}