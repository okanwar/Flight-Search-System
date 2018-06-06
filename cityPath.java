/*
 * Name: Om Kanwar
 * Date: 05/01/18
 * Class: COMP285 Section 2
 * Assignment: Assignment #3
 * Summary: This file navigates the paths of the origin city entered to the
 * adjacent cities.
 */


public class cityPath{
    private City sourceCity;
    private City[] destCity = new City[10];
    int numCities = 0;

    public cityPath(City sourceCity) {
        this.sourceCity = sourceCity;
        this.sourceCity.hasVisited();
    }

    public void destCity(City destCity) {
        this.destCity[numCities] = destCity;
            this.numCities++;
    }

    public City getSourceCity() {
        return this.sourceCity;
    }
/*
    public void printAllDest() {
        for(int i = 0; i < numCities; i++) {
            System.out.println(destCity[i].getName());
        }
    }
*/
    public City nextCity() {
        for (int i = 0; i < numCities; i++) {
            if(destCity[i].visit() == false) {
                destCity[i].hasVisited();
                return destCity[i];
            }
        }
        return null;
    }
}
