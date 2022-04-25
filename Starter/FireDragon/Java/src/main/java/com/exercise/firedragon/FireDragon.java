package com.exercise.firedragon;

public class FireDragon implements Reptile
{

    public FireDragon()
    {
    }

    @Override
    public ReptileEgg lay() throws Exception
    {
	    return new ReptileEgg(new FireDragonCallable().call());
    }
}
