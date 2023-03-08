package seminar;

public class University {

    int uniID;
    String uniName;
    City city;

    public int getUniID() {
        return uniID;
    }

    public void setUniID(int uniID) {
        this.uniID = uniID;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "University{" +
                "uniID=" + uniID +
                ", name='" + uniName + '\'' +
                ", city=" + city +
                '}';
    }
}
