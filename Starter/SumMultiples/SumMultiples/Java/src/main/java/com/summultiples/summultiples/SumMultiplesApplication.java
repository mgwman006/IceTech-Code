package com.summultiples.summultiples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Given positive integers below 12 that are multiples of 2 or 5, we get 2, 4, 5, 6, 8 and 10. The sum of these multiples is 35.
//Complete the solution so the Sum method calculates and returns the result of the sum of multiples of 2 or 5 below the number that is passed in to it.
//In the case where you find a number that is a multiple of both 2 and 5, only count it once.

@SpringBootApplication
public class SumMultiplesApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SumMultiplesApplication.class, args);
    }

}
