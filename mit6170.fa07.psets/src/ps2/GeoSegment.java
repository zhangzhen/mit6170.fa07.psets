package ps2;

/**
 * <p>
 * A GeoSegment models a straight line segment on the earth.
 * GeoSegments are immutable.
 * </p>
 *
 * <p>
 * A compass heading is a nonnegative real number less than 360.  In
 * compass headings, north = 0, east = 90, south = 180, and west =
 * 270.
 * </p>
 *
 * <p>
 * When used in a map, a GeoSegment might represent part of a street,
 * boundary, or other feature.
 * As an example usage, this map
 * <pre>
 *  Penny Lane  a
 *              |
 *              i--j--k  Abbey Road
 *              |
 *              z
 * </pre>
 * could be represented by the following GeoSegments:
 * ("Penny Lane", a, i), ("Penny Lane", z, i),
 * ("Abbey Road", i, j), and ("Abbey Road", j, k).
 * </p>
 *
 * <p>
 * A name is given to all GeoSegment objects so that it is possible to
 * differentiate between two GeoSegment objects with identical
 * GeoPoint endpoints.  Equality between GeoSegment objects requires
 * that the names be equal String objects and the end points be equal
 * GeoPoint objects.
 * </p>
 * 
 * <p>
 * A GeoSegment must have a length greater than 0.
 * </p>
 *
 * @specfield  name : String       // name of the geographic feature identified
 * @specfield  p1 : GeoPoint       // first endpoint of the segment
 * @specfield  p2 : GeoPoint       // second endpoint of the segment
 * @specified  p1 != p2                    // p1 and p2 must be distinct GeoPoint objects
 * @derivedfield length : real     // straight-line distance between p1 and p2, in miles (must be > 0)
 * @derivedfield  heading : angle  // compass heading from p1 to p2, in degrees
 **/
public class GeoSegment  {

    // FIELDS

    // Constructors

    /**
     * @requires name != null && p1 != null && p2 != null && length > 0
     * @effects constructs a new GeoSegment with the specified
     * name and endpoints
     **/
    public GeoSegment(String name, GeoPoint p1, GeoPoint p2) {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Checks that the representation invariant holds (if any).
     **/
    // Throws a RuntimeException if the rep invariant is violated.
    private void checkRep() throws RuntimeException {
        throw new RuntimeException("Not yet implemented");
    }


    // Producers

    /**
     * Returns a new GeoSegment like this one, but with its endpoints
     * reversed.
     * @return a new GeoSegment gs such that
     *      gs.name = this.name
     *   && gs.p1 = this.p2
     *   && gs.p2 = this.p1
     **/
    public GeoSegment reverse() {
        throw new RuntimeException("Not yet implemented");
    }


    // Observers

    /**
     * @return the name of this GeoSegment.
     **/
    public String getName() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return first endpoint of the segment.
     **/
    public GeoPoint getP1() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return second endpoint of the segment.
     **/
    public GeoPoint getP2() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return the length of the segment, using the flat-surface,
     * near-Boston approximation.
     **/
    public double getLength() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return the compass heading from p1 to p2, in degrees, using
     * the flat-surface, near-Boston approximation.
     **/
    public double getHeading() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Compares the specified Object with with this GeoSegment for
     * equality.
     * @return    gs != null && (gs instanceof GeoSegment)
     *         && gs.name = this.name && gs.p1 = this.p1 && gs.p2 = this.p2
     **/
    public boolean equals(Object gs) {
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

} // GeoSegment
