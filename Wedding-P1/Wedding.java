public class Wedding {
    private Couple couple;
    private String localDate;
    private String location;

    public Wedding(Couple couple, String localDate, String location) {
        this.couple = couple;
        this.localDate = localDate;
        this.location = location;
    }

    public Couple getCouple() {
        return couple;
    }

    public String getDate() {
        return localDate;
    }

    public String getLocation() {
        return location;
    }
}
