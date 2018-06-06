/* Name: Om Kanwar
 * Date: 05/01/18
 * Class: COMP285 Section 2
 * Assignment: This class initializes the constructor for the City and
 * helps implement the cityPath class.
 *
 */

public class City {
    private String name;
    private boolean visited;

    public City(String name) {
        this.name = name;
        visited = false;
    }

    void hasVisited() {
        this.visited = true;
    }

    public boolean visit() {
        return this.visited;
    }

    String getName() {
        return this.name;
    }
}
