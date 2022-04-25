package com.exercise.firedragon;
import java.util.concurrent.Callable;

public class FireDragonCallable implements Callable<Callable<Reptile>>
{
    public FireDragonCallable() 
    {
        super();
    }


    @Override
    public Callable<Reptile> call() throws Exception 
    {
       return new Callable<Reptile>() 
       {
           @Override
           public Reptile call() throws Exception 
           {
               return new FireDragon() {};
           }
       };
    }
}
