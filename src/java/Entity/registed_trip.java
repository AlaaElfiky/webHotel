package Entity;

/**
 *
 * @author snow
 */
public class registed_trip {
    // id, tourism_email, trip_name, num

    private String tourism_email;
    private String trip_name;
    private int num;

    public String getTourism_email() {
        return tourism_email;
    }

    public void setTourism_email(String tourism_email) {
        this.tourism_email = tourism_email;
    }

    public String getTrip_name() {
        return trip_name;
    }

    public void setTrip_name(String trip_name) {
        this.trip_name = trip_name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
