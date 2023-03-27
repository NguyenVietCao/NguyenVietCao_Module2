package ss16.doc_file_csv;

public class Country {

    private int id;
    private String name;
    private String country;

    public Country() {
    }

    public Country(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    /*Dung de in thong tin cho viec ghi file csv*/
    public String getInfoToCsv() {
        int classes = 0;
        return id + "," + name + "," + classes;
    }

}

