package io.zipcoder.zombiecode;

/**
 * Created by syoung on 9/15/15.
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private int resources;
    private int combat;
    private int repair;
    private String rank;

    /**
     * calculates Body Mass Index using height and weight and then converts BMI to a score
     * between 1 and 5
     * @return int
     */
    public int calcFitnessLevel() {
        float fweight = weight;
        float fheight = height;
        float bmi = (fweight / (fheight * fheight)) * 703;
        if (bmi >= 18.5 && bmi < 25) {
            return 5;
        } else if ((bmi >= 16 && bmi < 18.5) || (bmi >= 25 && bmi < 27.5)) {
            return 4;
        } else if (bmi >= 27.5 && bmi < 30) {
            return 3;
        }  else if (bmi >= 30 && bmi < 35) {
            return 2;
        } else return 1;
    }

    /**
     * calculate the average of the three skill attributes
     * @return float
     */
    public float calcSkillLevel() {
        float fresources = resources;
        float fcombat = combat;
        float frepair = repair;
        float skillLevel = (fresources + fcombat + frepair) / 3;
//        System.out.println(skillLevel);
        return skillLevel;
    }

    /**
     * use the fitness(BMI) and skill level scores created by the previous
     * two functions to calculate a rank score which is then converted
     * into a rank label string. also sets the rank attribute for the person object.
     * @return String
     */
    public String calcRank () {
        float calc = calcFitnessLevel() + (calcSkillLevel() * 2);
//        System.out.println(calc);
        if (calc <= 7) {
            rank = "Liability";
            return rank;
        } else if (calc >= 12) {
            rank = "Elite";
            return rank;
        } else {
            rank = "Pawn";
            return rank;
        }

    }

    /**
     * person object constructor
     * @param name
     * @param age
     * @param height
     * @param weight
     * @param resources
     * @param combat
     * @param repair
     */
    public Person(String name, int age, int height, int weight, int resources, int combat, int repair) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.resources = resources;
        this.combat = combat;
        this.repair = repair;
        calcRank();
    }

    /**
     * sets/updates age, height, and weight attributes for the person object
     * and runs calcRank() to update the person's rank
     * @param age
     * @param height
     * @param weight
     */
    public void setPhysicalAttributes (int age, int height, int weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        calcRank();
    }

    /**
     * sets/updates the three skill attributes for the person object
     * and runs calcRank() to update the person's rank
     * @param resources
     * @param combat
     * @param repair
     */
    public void setSkills (int resources, int combat, int repair) {
        this.resources = resources;
        this.combat = combat;
        this.repair = repair;
        calcRank();
    }


    /**
     * the following functions get the various attributes for the person object
     * @return various attributes
     */
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getResources() {
        return resources;
    }

    public int getCombat() {
        return combat;
    }

    public int getRepair() {
        return repair;
    }

    public String getRank() {
        return rank;
    }
}
