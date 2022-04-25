package com.exercise.firedragon;
//import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.concurrent.*;

class ReptileEgg 
{
    private Reptile reptile;
    private int hatchingTimes = 0;

    public ReptileEgg(Callable<Reptile> createReptile) throws Exception 
    {
        this.reptile = createReptile.call();
        if (this.reptile == null) 
        {
            throw new UnsupportedOperationException("The dragon didn't lay the egg well.");
        }
    }

    public Reptile hatch() throws Exception 
    {
        if (hatchingTimes <= 0) 
        {
            hatchingTimes += 1;
            return reptile;
        } 
        else 
        {
            throw new UnsupportedOperationException("The egg cannot hatch more than 1.");
        }
    }
}