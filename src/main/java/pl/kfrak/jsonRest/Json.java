package pl.kfrak.jsonRest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-05-25.
 */
public class Json {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Point point = new Point(20, 40);
//        point.setX(20);
//        point.setY(40);

        String pointJson = objectMapper.writeValueAsString(point);
        System.out.println(pointJson);

        //ZAPIS JSONA DO PLIKU
        objectMapper.writeValue(new File("points.json"), point);

        List<Point> pointList = new ArrayList<Point>();
        pointList.add(new Point(1, 2));
        pointList.add(new Point(2, 3));
        pointList.add(new Point(3, 4));
        objectMapper.writeValue(new File("points.json"), point);

        //ZAMIANA JSONA NA OBIEKT JAVOVY
        //1. ZAMIANA JSONA: STRINGA, NAPISU
        String pointsJsonString = "{\n" +
                "  \"x\" : 100,\n" +
                "  \"y\" : 300\n" +
                "}";

        Point point1 = objectMapper.readValue(pointsJsonString, Point.class);

        //ZAMIANA JSONA Z PLIKU NA OBIEKT
//        Point point2 = objectMapper.readValue(new File("points.json"), Point.class);
//        List<Point> pointsListFromFile = objectMapper.readValue(new File("pointsList.json"), List.class);


        /**
         * Uwaga,
         * żeby JSON działał:
         * 1. musimy mieć gettery i settery
         * 2. musimy mieć konstruktor bezparametrowy
         *
         * !Struktura JSONa musi się zgadzać ze strukturą obiektu
         */

        //zamiana ze Stringa
        String jsonString = "{\n" +
                "  \"firstName\": \"Adam\",\n" +
                "  \"lastName\": \"Kowalski\",\n" +
                "  \"birthYear\": 1980,\n" +
                "  \"idNumber\": \"ABC\"\n" +
                "}";
        Customer customer = objectMapper.readValue(jsonString, Customer.class);
       // Customer customer = objectMapper.readValue(new File("customer.json"), Customer.class);
        System.out.println(customer);
    }
}
