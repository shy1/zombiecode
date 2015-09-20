package test.zipcoder.zombiecode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import io.zipcoder.zombiecode.Person;
import io.zipcoder.zombiecode.App;
import org.junit.experimental.theories.suppliers.TestedOn;

/**
 * Created by syoung on 9/17/15.
 */
public class ZombieTest {
    Person person1 = new Person("Sean", 27, 72, 170, 4, 4, 5);
    Person person2 = new Person("Shawn", 20, 68, 140, 1, 1, 1);
    App app = new App();
   // addPerson(person1);
    //addPerson(person2);

    @Test
    public void testUpdate() {
        System.out.println(person2.getRank());
        person2.setSkills(5, 5, 5);
        assertEquals("Should update rank", "Pawn", person2.getRank());
    }


    @Test
    public void testFitness() {
        assertEquals("Should return correct fitness level", 0, person1.calcFitnessLevel());
    }

/*    @Test
    public void testSkill() {
        assertEquals("Should return correct skill level", 0, person.calcSkillLevel());
    }
*/
    @Test
    public void testRank() {
        assertEquals("Should return correct rank", "Pawn", person1.calcRank());
    }

    @Test
    public void testRankAttribute(){
        person1.calcRank();
        assertEquals("Should return rank attribute", "Elite", person1.getRank());
    }

    @Test
    public void testAge(){
        assertEquals("Should return correct age", 17, person1.getAge());
    }

    @Test
    public void testPeople() {
        app.addPerson(person1);
        app.addPerson(person2);
        assertEquals("Should return length of array", 1, app.getPeople("Elite"));
    }

}

