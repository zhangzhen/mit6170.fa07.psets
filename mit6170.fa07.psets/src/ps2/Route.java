package ps2;

import java.util.*;


/**
 * <p>
 * A Route is a path that traverses arbitrary GeoSegments, regardless
 * of their names.
 * </p>
 *
 * <p>
 * Routes are immutable.  New Routes can be constructed by adding a
 * segment to the end of a Route.  An added segment must be properly
 * oriented; that is, its p1 field must correspond to the end of the
 * original Route, and its p2 field corresponds to the end of the new
 * Route.
 * </p>
 *
 * <p>
 * Because a Route is not necessarily straight, its length -- the
 * distance traveled by following the path from start to end -- is not
 * necessarily the same as the distance along a straight line between
 * its endpoints.
 * </p>
 *
 * <p>
 * Lastly, a Route may be viewed as a sequence of geographical
 * features, using the <tt>getGeoFeatures()</tt> method which returns
 * a List<GeoFeature>.
 * </p>
 *
 * @specfield start : GeoPoint         // location of the start of the route
 * @specfield end : GeoPoint           // location of the end of the route
 * @specfield startHeading : angle     // direction of travel at the start of the route, in degrees
 * @specfield endHeading : angle       // direction of travel at the end of the route, in degrees
 * @specfield geoFeatures : sequence   // a sequence of geographic features that make up this Route
 * @specfield geoSegments : sequence   // a sequence of segments that make up this Route
 * @derivedfield length : real         // total length of the route, in miles
 * @derivedfield endingGeoSegment : GeoSegment   // last GeoSegment of the route
 **/
public class Route {
    //FIELDS


    // Constructors

    /**
     * @requires gs != null
     * @effects Constructs a new Route.
     **/
    public Route(GeoSegment gs) {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Checks that the representation invariant holds (if any).
     **/
    // Throws a RuntimeException if the rep invariant is violated.
    private void checkRep() throws RuntimeException {
        throw new RuntimeException("Not yet implemented");
    }


    // Observers

    /**
     * @return location of the start of the route
     **/
    public GeoPoint getStart() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return location of the end of the route
     **/
    public GeoPoint getEnd() {
        throw new RuntimeException("Not yet implemented");
    }

    /**
     * @return the last GeoSegment of the route
     **/
    public GeoSegment getEndingGeoSegment() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return direction (in compass heading) of travel at the start
     * of the route, in degrees
     **/
    public double getStartHeading() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return direction of travel at the end of the route, in
     * degrees
     */
    public double getEndHeading() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return total length of the route, in miles.  NOTE: this is NOT
     * as-the-crow-flies, but rather the total distance required to
     * traverse the route.  These values are not necessarily equal.
     */
    public double getLength() {
        throw new RuntimeException("Not yet implemented");
    }


    // Producers

    /**
     * Creates a new route that is equal to this route with gs
     * appended to its end.
     * @requires gs != null && gs.p1 = this.end
     * @return a new Route r such that
     *       r.end = gs.p2
     *    && r.endHeading = gs.heading
     *    && r.length = this.length + gs.length
     **/
    public Route addSegment(GeoSegment gs) {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Returns a List of GeoFeature objects.  The
     * concatenation of the GeoFeatures, in order, is equivalent to
     * this route.  No two consecutive GeoFeature objects have the
     * same name.<p>
     *
     * @return a List of GeoFeatures such that
     * <pre>
     *      this.start        = a.get(0).start
     *   && this.startHeading = a.get(0).startHeading
     *   && this.end          = a.get(a.length - 1).end
     *   && this.endHeading   = a.get(a.length - 1).endHeading
     *   && this.length       =  sum (0 &lt;= i &lt; a.size) . a.get(i).length
     *   && for all integers i .
     *          (0 &lt;= i &lt; a.size - 1 =&gt; (a.get(i).name != a.get(i+1).name &&
     *                                       a.get(i).end   = a.get(i+1).start))
     * </pre>
     * @see ps2.GeoFeature
     **/
    public List<GeoFeature> getGeoFeatures() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Returns a List of GeoSegment objects.  The concatentation
     * of the GeoSegments, in order, is equivalent to this route.
     * @return a List of GeoSegments such that
     * <pre>
     *      this.start        = a.get(0).p1
     *   && this.startHeading = a.get(0).heading
     *   && this.end          = a.get( a.size - 1 ).p2
     *   && this.endHeading   = a.get( a.size - 1 ).heading
     *   && this.length       =  sum (0 &lt;= i &lt; a.size) . a.get(i).length
     *
     * </pre>
     * @see ps2.GeoSegment
     */
    public List<GeoSegment> getGeoSegments() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Compares the specified Object with this Route for equality.
     * @return true iff (o instanceof Route)
     *         && (o.geoFeatures and this.geoFeatures contain
     *             the same elements in the same order).
     **/
    public boolean equals(Object o) {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return a valid hash code for this.
     **/
    public int hashCode() {
        // This implementation will work, but you may want to modify
        // it later for improved performance.  If you do change the
        // implementation, make sure it satisfies the hashCode
        // invariant.  That is, if equals returns true for two
        // objects, then they must have the same hashCode.

        return (1);
    }


    /**
     * @return a string representation of this.
     **/
    public String toString() {
        throw new RuntimeException("Not yet implemented");
    }

} //Route
