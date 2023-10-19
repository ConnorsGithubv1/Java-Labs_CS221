# Lab 04: Format Checker

* Author: Connor Smith
* Class: CPSC-221 Section 002
* Semester: Fall 2023

## Overview
This program is used to check the format of code for .dat files that follow a specific format.

## Compiling and Using
To use this code:
1 run code by clicking the play button in top right of vs code
2 type into the terminal "javac FormatChecker.java" and hit enter
3 Then again type into the terminal "java FormatChecker "filename" (invalid1.dat, valid1.dat, etc.)
4 Program will run and tell you if the format is correct or invalid

## Discussion
This program was very hard to create. It still one bug to be fixed which is: not tracking when there are more then 2
positive ints in the first row.

I found this program very challenging because it pulls from alot of different exception classes, and specifically uses them
to help debug a program.

## Testing

I spent alot of time testing my program to atleast get the output correct. That is why i made a debug that i could see on the
console "Debug: Reading line: ..." This helped me alot to figure out what the code was seeing.

----------