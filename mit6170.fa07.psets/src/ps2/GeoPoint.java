package ps2;


/**
 * <p>
 * A GeoPoint models a point on the earth.  GeoPoints are immutable.
 * </p>
 *
 * <p>
 * North latitudes and east longitudes are represented by positive
 * numbers.  South latitudes and west longitudes are represented by
 * negative numbers.
 * </p>
 *
 * <p>
 * The code may assume that the represented points are nearby Boston.
 * </p>
 *
 * <p>
 * <b>Implementation hint</b>:<br> Boston is at approximately 42
 * deg. 21 min. 30 sec. N latitude and 71 deg. 03 min. 37 sec. W
 * longitude.  There are 60 minutes per degree, and 60 seconds per
 * minute.  So, in decimal, these corespond to 42.358333 North
 * latitude and -71.060278 East longitude.  The constructor takes
 * integers in millionths of degrees.  To create a new GeoPoint
 * located in Boston, use: <tt>GeoPoint boston = new
 * GeoPoint(42358333, -71060278);</tt>
 * </p>
 *
 * <p>
 * Near Boston, there are approximately 69.023 miles per degree of
 * latitude and 51.075 miles per degree of longitude.  An
 * implementation should use these values when determining distances
 * and headings.
 * </p>
 *
 * @specfield  latitude :  real     // measured in degrees latitude
 * @specfield  longitude : real     // measured in degrees longitude
 **/
public class GeoPoint {

    /** Minimum value the latitude field can have in this class. **/
    public static final int MIN_LATITUDE  =  -90 * 1000000;

    /** Maximum value the latitude field can have in this class. **/
    public static final int MAX_LATITUDE  =   90 * 1000000;

    /** Minimum value the longitude field can have in this class. **/
    public static final int MIN_LONGITUDE = -180 * 1000000;

    /** Maximum value the longitude field can have in this class. **/
    public static final int MAX_LONGITUDE =  180 * 1000000;


    /**
     * Approximation used to determine distances and headings using a
     * "flat earth" simplification.
     **/
    public static final double MILES_PER_DEGREE_LATITUDE = 69.023;

    /**
     * Approximation used to determine distances and headings using a
     * "flat earth" simplification.
     **/
    public static final double MILES_PER_DEGREE_LONGITUDE = 51.075;


    // FIELDS


    // Constructors

    /**
     * @requires the (latitude, longitude) point expressed in
     * millionths of a degree is valid, such that
     * MIN_LATITUDE <= latitude <= MAX_LATITUDE and
     * MIN_LONGITUDE <= longitude <= MAX_LONGITUDE
     *
     * @effects constructs a GeoPoint from a latitude and
     * longitude given in millionths of degrees.
     **/
    public GeoPoint(int latitude, int longitude) {
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
     * the latitude of the GeoPoint object, in millionths of degrees.
     **/
    public int getLatitude() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * the longitude of the GeoPoint object, in millionths of degrees.
     **/
    public int getLongitude() {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Computes the distance between GeoPoints.
     * @requires gp != null
     * @return The distance, in miles, from this to gp, using the
     * flat-surface, near Boston approximation.
     **/
    public double distanceTo(GeoPoint gp) {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Computes the compass heading between GeoPoints.
     * @requires gp != null && !this.equals(gp)
     * @return The compass heading h from this to
     * gp, in degrees, using the flat-surface, near Boston
     * approximation, such that 0 &lt;= h &lt; 360.  In compass
     * headings, north = 0, east = 90, south = 180, and west = 270.
     **/
    public double headingTo(GeoPoint gp) {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * Compares the specified Object with this GeoPoint for equality.
     * @return gp != null && (gp instanceof GeoPoint)
     *         && gp.latitude = this.latitude && gp.longitude = this.longitude
     **/
    public boolean equals(Object gp) {
        throw new RuntimeException("Not yet implemented");
    }


    /**
     * @return a valid hashcode for this GeoPoint.
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
     * @return a string representation of this GeoPoint.
     **/
    public String toString() {
        throw new RuntimeException("Not yet implemented");
    }

} // GeoPoint
