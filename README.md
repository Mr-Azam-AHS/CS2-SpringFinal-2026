# CS2-SpringFinal-2026

## Repeating Key Decoder
Write a Java program that decrypts a message using a repeating keyword cipher. This is similar to the Caesar shift cipher from the labs, but instead of one fixed shift for the whole message, the shift changes with each letter based on a keyword.

How it works:

Each letter of the keyword represents a shift value based on its position in the alphabet, A = 1, B = 2, C = 3, and so on up to Z = 26. The first letter of the message is shifted by the value of the first keyword letter, the second letter by the second keyword letter, and so on. When the keyword runs out, it repeats from the beginning. Non-alphabetic characters are ignored and the keyword position does not advance for them.
Example:

Keyword: DOG → shifts of 4, 15, 7

Encrypted message: HDNW PYI VYIPA TTAW

Decryption step by step:

H shifted back by 4 (D) → D
D shifted back by 15 (O) → O
N shifted back by 7 (G) → G
W shifted back by 4 (D) → S
  →   (space, keyword does not advance)
P shifted back by 15 (O) → A
Y shifted back by 7 (G) → R
I shifted back by 4 (D) → E
  →   (space, keyword does not advance)
...and so on


Decoded result: DOGS ARE GREAT PETS


### Requirements:

	- Read the encrypted message from a file called message.txt
	- Ask the user to enter a keyword at the terminal — convert it to uppercase before using it
	- Only use the alphabetic characters of the keyword — ignore any numbers or symbols if entered
	- Decrypt the message and print the result to the terminal
	- Non-alphabetic characters in the message (spaces, punctuation, numbers) must appear unchanged in the output
	- The keyword position must not advance when a non-alphabetic character is encountered
	- Output should be in all uppercase

---
## Task Two: Problem Solving
Login to Advent of Code and navigate to the 2019 contest. → https://adventofcode.com/2019

Write individual programs to solve both parts of Day1 and Day2. You do not have to complete them in order. Keep your solutions simple. It can be easy to over complicate your solution. This task is focussed more on your process and ability to break the problem down and create a solution, not writing elaborate and complex code. 

### Grading
This task is graded on both the number of problems solved and the quality of your code, with quality weighted slightly higher. A clean, well-written solution to three problems will score better than messy solutions to five. 

---
## Task Three: Coding and Git/GitHub Procedures
This task you will complete as you work on the other two. Make sure you are using good practices with Git:

    - Create a new branch for each new feature or program
    - Commit messages should be short but meaningful
    - Push each branch and open a Pull Request when it is ready

You will also be graded on the overall quality and readability of your code:

    - Comments that are meaningful and used where necessary
    - Method and variable names that are consistent and descriptive (i in a for-loop is fine, but single-letter or vague names everywhere is not)
    - Code is consistently and correctly formatted



## Submission
Before you leave, you will need to save, commit, and push all changes. Make sure that there is a PR for each branch pushed. Failure to push will result in the loss of points.
