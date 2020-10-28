/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgtry;

/**
 *
 * @author compu magic
 */
public class RouteMangment {
    private String RouteName;
    private String Distance;

    public RouteMangment() {
    }

    
    public RouteMangment(String RouteName, String Distance) {
        this.RouteName = RouteName;
        this.Distance = Distance;
    }

    public String getRouteName() {
        return RouteName;
    }

    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String Distance) {
        this.Distance = Distance;
    }
    
    
}
