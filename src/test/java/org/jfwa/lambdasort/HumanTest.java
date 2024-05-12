package org.jfwa.lambdasort;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test //with class comparator
    public void testPreLambdaSort(){
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah",10));
        humans.add(new Human("Jake",20));
        humans.add(new Human("Mitch",1));

        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        assertEquals("Jake",humans.get(0).getName());
    }

    @Test //with class comparator
    public void testLambdaSort(){
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah",10));
        humans.add(new Human("Jake",20));
        humans.add(new Human("Mitch",1));

        humans.sort((h1,h2) -> h1.getName().compareTo(h2.getName()));

        assertEquals("Jake",humans.get(0).getName());
    }

    @Test //with class comparator
    public void testClassLambdaSort(){
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah",10));
        humans.add(new Human("Jake",20));
        humans.add(new Human("Mitch",1));

        humans.sort(Human::compareByNameThenAge);

        assertEquals("Jake",humans.get(0).getName());
    }

}