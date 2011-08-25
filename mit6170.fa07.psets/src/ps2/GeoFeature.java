package ps2;

import java.util.*;


/**
 * <p>
 * A GeoFeature represents a path from one location to another along
 * a single geographic feature.  GeoFeatures are immutable.
 * </p>
 *
 * <p>
 * GeoFeature abstracts over a sequence of GeoSegments, all of which
 * have the same name, thus providing a representation for nonlinear
 * or nonatomic geographic features.  As an example, a GeoFeature
 * might represent the course of a winding river, or travel along a
 * road through intersections but remaining on the same road.
 * </p>
 *
 * <p>
 * GeoFeatures are immutable.  New GeoFeatures can be constructed by
 * adding a segment to the end of a GeoFeature.  An added segment must
 * be properly oriented; that is, its p1 field must correspond to the
 * end of the original GeoFeature, and its p2 field corresponds to the
 * end of the new GeoFeature, and the name of the GeoSegment being
 * added must match the name of the existing GeoFeature.
 * </p>
 *
 * <p>
 * Because a GeoFeature is not necessarily straight, its length -- the
 * distance traveled by following the path from start to end -- is not
 * necessarily the same as the distance along a straight line between
 * its endpoints.
 * </p>
 *
 * @specfield start : GeoPoint         // location of the start of the geo feature
 * @specfield end : GeoPoint           // location of the end of the geo feature
 * @specfield startHeading : angle     // direction of travel at the start of the geo feature, in degrees
 * @specfield endHeading : angle       // direction of travel at the end of the geo feature, in degrees
 * @specfield geoSegments : sequence   // a sequence of segments that make up this geographic feature
 * @specfield name : String            // name of geographical feature
 * @derivedfield length : real         // total length of the geo feature, in miles
 *
 **/
public class GeoFeature {

    //FIELDS


    // Constructors

    /**
     * Constructs a new GeoFeature.
     * @requires gs != null
     * @effects Constructs a new GeoFeature, r, such that
     *          r.name = gs.name &&
     *          r.startHeading = gs.heading &&
     *          r.endHeading = gs.heading &&
     *          r.start = gs.p1 &&
     *          r.end = gs.p2
     **/
    public GeoFeature(GeoSegment gs) {
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
     * @return name of geographic feature
     **/
    public String getName() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return location of the start of the feature
     **/
    public GeoPoint getStart() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return location of the end of of the feature
     **/
    public GeoPoint getEnd() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return direction (in standard heading) of travel at the start
     * of the feature, in degrees
     **/
    public double getStartHeading() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return direction of travel at the end of the feature, in
     * degrees
     **/
    public double getEndHeading() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return total length of the geo feature, in miles.  NOTE: this
     * is NOT as-the-crow-flies, but rather the total distance
     * required to traverse the geo feature.  These values are not
     * necessarily equal.
     **/
    public double getLength() {
        throw new RuntimeException("Not yet implemented");
    }


    // Producers

    /**
     * Creates a new GeoFeature that is equal to this GeoFeature with
     * gs appended to its end.
     *
     * @requires gs != null && gs.p1 = this.end && gs.name = this.name
     * @return a new GeoFeature r such that
     *       r.end = gs.p2
     *    && r.endHeading = gs.heading
     *    && r.length = this.length + gs.length
     **/
    public GeoFeature addSegment(GeoSegment gs) {
        throw new RuntimeException("Not yet implemented");
    }


    // Observers

    /**
     * Returns a List of GeoSegment objects.  The concatentation
     * of the GeoSegments, in order, is equivalent to this GeoFeature.
     * All the GeoSegments should have the same name.
     * @return a List of GeoSegments such that
     * <pre>
     *      this.start        = a.get(0).p1
     *   && this.startHeading = a.get(0).heading
     *   && this.end          = a.get(a.size - 1).p2
     *   && this.endHeading   = a.get(a.size - 1).heading
     *   && this.length       =  sum (0 &lt;= i &lt; a.size) . a.get(i).length
     *   && for all integers i .
     *          (0 &lt;= i &lt; a.size - 1 =&gt; (a.get(i).name = a.get(i+1).name &&
     *                                              a.get(i).p2 = a.get(i+1).p1))
     * </pre>
     * @see ps2.GeoSegment
     */
    public List<GeoSegment> getGeoSegments() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Compares the argument with this GeoFeature for equality.
     * @return o != null && (o instanceof GeoFeature)
     *         && (o.geoSegments and this.geoSegments contain
     *             the same elements in the same order).
     **/
    public boolean equals(Object o) {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return a valid hashcode for this.
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

} // GeoFeature
