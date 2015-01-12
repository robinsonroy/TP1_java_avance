package Controller; /**
 * Created by Robinson on 12/01/15.
 */

import Model.Route;

/**
 * Created by Robinson on 05/01/15.
 */
public class mainController {

    public static void main(String[] args) {

        Route route = new Route();

        route.toString(route.getRoute("ece.fr"));

    }
}