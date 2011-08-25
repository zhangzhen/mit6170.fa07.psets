package ps2;

import java.util.Iterator;
import java.text.*;


/**
 * <p>
 * A RouteFormatter class knows how to create a textual description of
 * directions from one location to another.  The class is abstract to
 * support different textual descriptions.
 * </p>
 *
 * <p>

 * These classes may be thought of as <i>views</i> on the Route model.
 * (see <a
 * href="http://java.sun.com/blueprints/patterns/MVC-detailed.html">Sun's
 * buzzword-filled explanation</a> of this design pattern)
 * </p>
 **/
public abstract class RouteFormatter {

    /**
     * <p>
     * Give directions for following this Route, starting at its
     * start point and facing in the specified heading.
     * </p>
     *
     * <p>
     * This method should call <tt>computeLine</tt> for each
     * geographical feature in this route and concatenate the results
     * into a single String.
     * </p>
     *
     * @requires 0 &lt;= heading &lt; 360 && route != null
     * @param route The route for which to print directions.
     * @param heading The initial heading.
     * @return A newline-terminated directions <tt>String</tt> giving
     * human-readable directions from start to end along this route.
     **/
    public String computeDirections(Route route, double heading) {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Computes a single line of a multi-line directions String that
     * represents the intructions for traversing a single geograhpical
     * feature.
     *
     * @requires geoFeature != null
     * @param geoFeature The geographical feature to traverse.
     * @param origHeading The initial heading
     * @return A newline-terminated <tt>String</tt> that gives
     * directions on how to traverse this geographical feature.
     **/
    public abstract String computeLine(GeoFeature geoFeature,
                                       double origHeading);

  
    /**
     * Computes directions to turn based on the heading change.  Let
     * the angle from the original heading to the new heading be a.
     * The turn should be annotated as:<p>
     *
     * <pre>
     * Continue             if a &lt; 10
     * Turn slight right    if 10 &lt;= a &lt; 60
     * Turn right           if 60 &lt;= a &lt; 120
     * Turn sharp right     if 120 &lt;= a &lt; 179
     * U-turn               if 179 &lt;= a 
     * </pre>
     *
     * and likewise for left turns.
     *
     * @requires 0 &lt;= oldHeading &lt; 360
     * @requires 0 &lt;= newHeading &lt; 360
     * @param origHeading the start heading
     * @param newHeading the desired new heading
     * @return English directions to go from the old heading to the
     * new one.
     */
    protected String getTurnString(double origHeading, double newHeading) {
        throw new RuntimeException("Not yet implemented");
    }
}
