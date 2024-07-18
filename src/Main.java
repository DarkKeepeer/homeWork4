import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
        int temperature = 2;
        if (temperature <= 5){
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        int speed = 58;
        if (speed >= 60){
            System.out.println(" Если скорость " + speed + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }
        int age1 = 13;
        boolean goToKinderGarten = age1 >= 2 && age1 < 6;
        if (goToKinderGarten){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад.");
        }
        boolean goToSchool = age1 >= 7 && age1 < 17;
        if (goToSchool){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу.");
        }
        boolean goToUniversity = age1 >= 18 && age1 <= 24;
        if (goToUniversity){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет.");
        }
        boolean goToWork = age1 > 24;
        if (goToWork){
            System.out.println("Если возраст человека равен " + age1 + " то ему пора ходить на работу.");
        }
        int ageChildren = 8;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то нельзя кататься на аттракционе");
        }
            boolean thereIsAnAdult = true;
            boolean childrenAge = ageChildren >=5 && ageChildren <= 14 && thereIsAnAdult;
        if (childrenAge) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " и есть сопровождающий взрослый, то кататься на аттракционе можно.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChildren + " и нет сопровождающего взрослого, то кататся на аттракционе нельзя. ");
        }
        boolean childrenAge2 = ageChildren > 14;
        if (childrenAge2){
            System.out.println(" Если возраст ребенка равен " + ageChildren + " то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        int carriageCapacity = 102;
        int seatPlace = 60;
        int standingRoom = carriageCapacity - seatPlace;
        int peoplesSitting = 56;
        int peopleAreStanding = 15;
        boolean freePlaces = peoplesSitting + peopleAreStanding < carriageCapacity;
        if (freePlaces){
            System.out.println("В вагоне есть свободные места!");
        } else {
            System.out.println("Мест в вагоне нет!");
        }
        boolean freeSeatPlaces = peoplesSitting < seatPlace;
        if (freeSeatPlaces && freePlaces){
            System.out.println("В вагоне есть свободные сидячие места.");
        } else {
            System.out.println("В вагоне нет свободных сидячих мест.");
        }
        boolean freeStandingRooms = peopleAreStanding < standingRoom;
        if (freeStandingRooms && freePlaces){
            System.out.println("В вагоне есть свободные стоячие места");
        } else {
            System.out.println("В вагоне нет свободных стоячих мест.");
        }
        int one = 15;
        int two = 6;
        int three = 20;
        boolean comparison = one > two && one > three;
        if (comparison) System.out.println("Переменная один самая большая");
        else {
            System.out.println("Переменная один не самая большая");
        }
        boolean comparison2 = two > one && two > three;
        if (comparison2) {
            System.out.println("Переменная два самая большая");
        }else {
            System.out.println("Переменная два не самая большая");
        }
        boolean comparison3 = three >one && three > two;
        if (comparison3) {
            System.out.println("Переменная три самая большая");
        }else {
            System.out.println("Переменная три не самая большая");
        }
    }
}