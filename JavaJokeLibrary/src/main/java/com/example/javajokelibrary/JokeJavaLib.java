package com.example.javajokelibrary;


import java.util.ArrayList;

public class JokeJavaLib {


ArrayList<String> myJokes = new ArrayList<>();

private String myJoke;

    public JokeJavaLib() {
       myJoke =  getJokeString();
    }

    private ArrayList<String> GetJokes(){

       myJokes.add("Q: How many programmers does it take to change a light bulb?\n" +
               "\n" +
               "    A: none, that's a hardware problem");
       myJokes.add(" Q: \"Whats the object-oriented way to become wealthy?\"\n" +
               "\n" +
               "    A: Inheritance");
       myJokes.add("Q: Why did the programmer quit his job?\n" +
               "\n" +
               "    A: Because he didn't get arrays.");
       myJokes.add("Q: What did the Java code say to the C code?\n" +
               "\n" +
               "    A: You've got no class.");
       myJokes.add("Q: Why are Assembly programmers always soaking wet?\n" +
               "\n" +
               "    A: They work below C-level.");
       myJokes.add(" Q: What do cats and programmers have in common?\n" +
               "\n" +
               "    A: When either one is unusually happy and excited, an appropriate question would be, \"did you find a bug?\"\n");
       myJokes.add(" Q: What is the most used language in programming?\n" +
               "\n" +
               "    A: Profanity.");
       myJokes.add("Q: Why did the database administrator leave his wife?\n" +
               "\n" +
               "    A: She had one-to-many relationships");
       myJokes.add("Q: Why do programmers always get Christmas and Halloween mixed up?\n" +
               "\n" +
               "    A: Because DEC 25 = OCT 31");
       myJokes.add(" Q: How did the programmer die in the shower?\n" +
               "\n" +
               "    A: He read the shampoo bottle instructions: Lather. Rinse. Repeat.");

       return myJokes;

   }

   private String  getJokeString()
   {
        GetJokes();
       int min = 0;
       int max = myJokes.size();
       int random = min + (int)(Math.random()*(max+1)) ;
       String jokeString = myJokes.get(random);
       return jokeString;

   }
   public String getJoke()
   {
       return myJoke;
   }
}

