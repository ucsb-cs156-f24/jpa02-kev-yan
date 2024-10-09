package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    // @Test
    // public void getName_returns_correct_name() {
    //    assert(team.getName().equals("test-team"));
    // }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void checkEquals(){
        Team t1 = new Team("test");
        Team t2 = new Team("test1");

        assertTrue(t1.equals(t1));
        assertFalse(t1.equals(1));

        assertFalse(t1.equals(t2));
        t2.setName("test");
        assertTrue(t1.equals(t2));        
        t2.addMember("test");
        assertFalse(t1.equals(t2));
        t2.setName("newName");
        assertFalse(t1.equals(t2));
        
    }

    @Test
    public void checkHashCode(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
        // int result = team.hashCode();
        // int expectedResult = 0;
        // assertEquals(expectedResult, result);
    }
   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
