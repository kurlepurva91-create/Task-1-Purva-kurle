# DecodeLabs Java Project 1 — Number Guessing Game

**Student:** Purva Kurle

**Project:** Project 1 — Number Guessing Game

**Language:** Java

## Objective

Create a Java program that generates a random number between 1 and 100 and asks the user to guess the number.

## Features

- Random number generation using Java `Random`
- User input using `Scanner`
- Feedback when the guess is too high or too low
- Repeated guessing using a `while` loop
- Maximum of 10 attempts
- Score calculation
- Game over message

## Concepts Used

- `Random` class
- `Scanner`
- `while` loop
- `if-else` conditions
- Boolean variables
- Basic scoring logic

## Scoring System

The score is calculated based on the number of attempts used.

**Formula:**

`Score = 10 - Attempts + 1`

For example:

- Attempt 1 → 10 points
- Attempt 2 → 9 points
- Attempt 5 → 6 points
- Attempt 10 → 1 point

If the number is not guessed within 10 attempts, the score is 0.

## How to Run

Open the project folder in VS Code or any Java IDE.

Compile:

```bash
javac NumberGame.java