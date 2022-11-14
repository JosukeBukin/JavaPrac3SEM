package ru.mirea.prac13.task3;
import java.util.StringTokenizer;
public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;
    public void SetAdress1(String str){
        String[] result = str.split(", ");
        this.country = result[0];
        this.region = result[1];
        this.city = result[2];
        this.street = result[3];
        this.house = result[4];
        this.building = result[5];
        this.flat = result[6];
    }
    public void SetAdress2(String str) {
        StringTokenizer token = new StringTokenizer(str, " ,.;");
        this.country = token.nextToken();
        this.region = token.nextToken();
        this.city = token.nextToken();
        this.street = token.nextToken();
        this.house = token.nextToken();
        this.building = token.nextToken();
        this.flat = token.nextToken();
    }
    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
