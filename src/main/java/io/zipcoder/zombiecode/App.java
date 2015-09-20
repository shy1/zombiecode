package io.zipcoder.zombiecode;

/**
 * Created by syoung on 9/14/15.
 */
public class App {

    private static Person[] people;

    /**
     * add Person object to the people[] array
     *
     */
    public static void addPerson(Person person) {


        if (people == null) {
            people = new Person[1];
            people[0] = person;
        } else {
            Person[] tempArray = new Person[people.length + 1];
            for (int i = 0; i < people.length; i++) {
                tempArray[i] = people[i];
            }
            tempArray[tempArray.length - 1] = person;
            people = tempArray;
        }
    }

    public static Person[] getPeople(String desiredRank) {
        int aIndex = 0;
        int dCount = 0;

        for (int j = 0; j < people.length; j++) {
            if (people[j].getRank() == desiredRank) dCount++;
        }

        Person[] dPeople = new Person[dCount];

        for (int i = 0; i < people.length; i++) {
            if (people[i].getRank() == desiredRank) {
                dPeople[aIndex] = people[i];
                aIndex++;
            }

        }


        return dPeople;
    }

    public static void main (String args[]) {
        App app = new App();
        Person[] elites;

        Person person1 = new Person("Sean", 27, 72, 170, 1, 1, 1);
        Person person2 = new Person("Shawn", 20, 68, 140, 5, 5, 5);

        addPerson(person1);
        addPerson(person2);

        // print name and rank for each person in the people array
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName() + ": " + people[i].getRank());
        }

        elites = getPeople("Elite");
        System.out.println();
        for (Person c : elites){
            System.out.println(c.getName());
        }

    }
}
