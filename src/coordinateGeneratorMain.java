import java.util.ArrayList;
import java.util.concurrent.Exchanger;

public class coordinateGeneratorMain {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        Exchanger<String> exchangerMain = new Exchanger<String>();


        Runnable task = () -> {
            persons.add(new Person(persons.size()+ 1, 0.0001, 0.0001, 393));
//          Person director = new Person(1);
            try {
//                exchangerMain.exchange(persons.get(0).getInfo());


                for (int i = 0; i < 300; i++) {
                    persons.get(0).startMovingRandom();
                    exchangerMain.exchange(persons.get(0).getInfo());
                }

//                System.out.println(persons.get(0).getInfo());

            } catch (Exception e) {
                e.printStackTrace();
            }
//            director.startMovingRandom();
        };
        Thread thread = new Thread(task);
        thread.start();

        for (int i = 0; i < 250; i++) {
            try {
                System.out.println(exchangerMain.exchange("got"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /* while (true) {
            System.out.println("a");
            try {
                System.out.println(exchangerMain.exchange("got"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
//        System.out.println("kjk");
    }

}
