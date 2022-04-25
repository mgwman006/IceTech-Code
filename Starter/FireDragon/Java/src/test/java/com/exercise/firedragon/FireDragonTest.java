package com.exercise.firedragon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireDragonTest {

    @Test
    public void FireDragonIsIReptile(){
        FireDragon dragon = new FireDragon();
        assertTrue(dragon instanceof Reptile);
    }

    @Test
    public void FireDragonMakesFireDragons() throws Exception {
        FireDragon dragon = new FireDragon();
        assertTrue(dragon.lay().hatch() instanceof FireDragon);
    }

    @Test
    public void EggsCannotHatchTwice() throws Exception {
        FireDragon dragon = new FireDragon();
        ReptileEgg egg = dragon.lay();
        egg.hatch();
        assertThrows(UnsupportedOperationException.class, () -> {
            egg.hatch();
        });
    }
}