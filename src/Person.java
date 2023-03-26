import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Person {
    private Generator generator;
    private int id;
    private double lati;
    private double longi;
    private double height;
    private static Random r = new Random();

    Person(int id, double lati, double longi, double height) {
        generator = new Generator();
        this.id = id;
        this.lati = lati;
        this.longi = longi;
        this.height = height;
    }
    Person(int id) {
        generator = new Generator();
        this.id = id;
        this.lati = 0;
        this.longi = 0;
        this.height = 0;
    }

    public String getInfo() {
        String coordinates = Integer.toString(id) + ": " + Double.toString(lati) + ", " + Double.toString(longi) + ", " + Double.toString(height);
        return coordinates;
    }

    public int getId() {
        return id;
    }

    public void startMovingRandom(){
        for (int i = 0; i < 300; i++) {
            lati = lati + lati * r.nextDouble();
            longi = longi + longi * r.nextDouble();
            height = height + height * r.nextInt();


            //System.out.println(Double.toString(lati) + " " + Double.toString(longi) + " " + Double.toString(height));
        }
        /*double latitudeMAX = 52.253641;
        double latitudeMIN = 52.247730;
        double dLatitude = latitudeMAX-latitudeMIN;

        double longitudeMAX = 104.365622;
        double longitudeMIN = 104.348348;
        double dLongitude = longitudeMAX - longitudeMIN;

        int idMAX = 14;
        int idMIN = 0;

        double newLatitude, newLongitude;
        int newId;
        Random r = new Random();


        for(int t = 0; t < 15; t++){
            ArrayList<Double> temp = new ArrayList<>();
            temp.add(latitudeMIN + dLatitude * r.nextDouble());
            temp.add(longitudeMIN + dLongitude * r.nextDouble());
            positions.add(temp);
        }

        double tempLatitude;
        double tempLongitude;

        while (i < 300){
            newId = ThreadLocalRandom.current().nextInt(idMIN, idMAX + 1);
            newLatitude = ThreadLocalRandom.current().nextDouble(0, dLatitude);
            newLongitude = ThreadLocalRandom.current().nextDouble(0, dLongitude);


            if (r.nextBoolean())
                tempLatitude = (positions.get(newId).get(0) - newLatitude);
            else
                tempLatitude = (positions.get(newId).get(0) + newLatitude);

            if (r.nextBoolean())
                tempLongitude = (positions.get(newId).get(1) - newLongitude);
            else
                tempLongitude = (positions.get(newId).get(1) + newLongitude);


            ArrayList<Double> temp = new ArrayList<>();
            temp.add(tempLatitude);
            temp.add(tempLongitude);

            positions.set(newId, temp);

            String message;
            message = newId + " " + tempLatitude + " " + tempLongitude;
            if (mChat.getState() == BluetoothChatService.STATE_CONNECTED)
                sendMessage(message);

            i+=1;
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
    }
}
