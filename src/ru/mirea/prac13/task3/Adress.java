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
        /*
        тут с помощью сплита делим строку и раделитель запятая и пробел
         */
    }

    public void SetAdress2(String str){
        StringTokenizer token = new StringTokenizer("Russia, Ural, Perm, Ekaterininskaya, 30, 1, 15");
        this.country = token.nextToken();
        this.country = country.substring(0, country.length()-1);
        this.region = token.nextToken();
        this.region = region.substring(0, region.length()-1);
        this.city = token.nextToken();
        this.city = city.substring(0, city.length()-1);
        this.street = token.nextToken();
        this.street = street.substring(0, street.length()-1);
        this.house = token.nextToken();
        this.house = house.substring(0, house.length()-1);
        this.building = token.nextToken();
        this.building = building.substring(0, building.length()-1);
        this.flat = token.nextToken();
        this.flat = flat.substring(0, flat.length());
        /*
        здесь просто делим токенайзером строку и удаляем символ идущий после слова
        каким бы он не был
         */
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
        /*
        выводим данные
         */
    }
}
