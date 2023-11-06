# Lab 01: RPG Characters

* Author: Connor Smith
* Class: CPSC 221 Section 002
* Semester: Fall 2023

## Overview

This program is used to show objected-oriented programmings using rpg characters that inherit from a parent class. This program uses inheritance, constructor overloading, method overriding, polymorphism and code reusability. The Adventure class demonstrates the creation of character instances and displays their characteristics and abilities. While the character class demonstrates the parent class that all created characters inherit from.

## Compiling and Using

To run this program you simply need open the adventure.java class and hit the run button. If you want to change specific characters traits or weapons you simply have to go into that characters class and change the constructor.

Example: 
public Cleric() {
        super(14, 17, "medium", "simple", true);
    }

    -->

public Cleric() {
        super(21, 21, "Heavy", "Staff", false);
    }

## Discussion

This program was easy to make due to limited assignment requirements. Character becomes the parent class while (knight,barbarian,ranger,etc..) are the child classes. While the runner class is Adventure.java. I learned a lot about method overiding and how parents classes are pushed onto the child classes.

I also learned that reusability should'nt be applied to all instances, for example, rogue and ranger both share sneaksaround() while all the other classes don't have, it wouldnt make sense to bring this out to its own class when you won't save much time by doing so and could make the code unneccesarily more complex later.

## Testing

For testing i decided to test once after i set up, ( adventure.java, character.java, and knight.java). Once i got that working i only ever tested after each following character was created.

----------