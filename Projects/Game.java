/*
 * This is a simple adventure game that I have create with Java.
 * 
 * Hope you have fun!
 * 
 * PS. Sorry for any mistakes with my english :-)
 */

import java.util.Scanner;

public class Game {
 
 String playerName;
 String start;
 String restart;
 int choise; 
 int choise2;
 int playerHP;
 int manHP;
 Scanner myReply = new Scanner(System.in);
 
 public static void main(String[] args) {
  
  Game x;
  
  x = new Game();
  
  x.start();
  x.town();
  
  
 }
  public void start() {
   
   playerHP = 10;
   manHP = 15;
   
   
   System.out.println("Hi, Welcome in this game :-)");
   System.out.println();
   System.out.println("Please enter your name:");
   playerName = myReply.nextLine();
   System.out.println("Hello " + playerName + " let's start the game!");
   System.out.println("Your HP: " + playerHP);
   
 }
  
  public void town() {
   
   
   System.out.println();
   System.out.println("You are at the gate of the town.");
   System.out.println("A guard is standing in front of you.");
   System.out.println();
   System.out.println("What do you want to do?");
   System.out.println();
   System.out.println("1. Talk to the guard");
   System.out.println("2. Attack the guard");
   System.out.println("3. Leave");
   System.out.println();
   
   choise = myReply.nextInt();
   
   if(choise == 1) {
    ending();
   }
    
   
   else 
    if(choise == 2) {
     playerHP= playerHP - 10;
     System.out.println("Guard: Hey! Dont't be stupid!");
     System.out.println("The guard hit you so hard that you are dead.");
     System.out.println("Your HP= " + playerHP);
     System.out.println("Game over!");
     
    }
    else
     if(choise == 3) {
      story();
     }
     else {
      town();
     }
  }

  public void ending() {
 
    System.out.println("Welcome in this town " + playerName + "!");
    System.out.println("Thanks for not hitting me!");
    System.out.println();
    System.out.println("THE END");
    System.out.println();
    
}
  
  public void story() {
   
   System.out.println();
   System.out.println("You are at a crossroad.");
   System.out.println("If you go south, you will go back to the town.");
   System.out.println("where do you want to go?");
   System.out.println("1: North");
   System.out.println("2: East");
   System.out.println("3: West");
   System.out.println("4: South");
   System.out.println();
   
   choise = myReply.nextInt();
   
   if (choise == 1) {
    north();
   }
   else
    if(choise == 2) {
     east();
    }
    else
     if(choise == 3){
      west();
     }
     else 
      if(choise == 4) {
       town();
      }
      else {
       story();
      }
  }
  
  public void north() {
   System.out.println();
   System.out.println("You are walking on a road.");
   System.out.println("A man is coming towards you...");
   System.out.println("What do you want to do?");
   System.out.println("1: Go to the man");
   System.out.println("2: Run away");
   
   choise = myReply.nextInt();
   
   if(choise == 1) {
    System.out.println();
    System.out.println("The man is a thief.");
    System.out.println("He want to rob you.");
    System.out.println("What do you want to do?");
    System.out.println("1: Fight him.");
    System.out.println("2. Run away");
    
    choise2 = myReply.nextInt();
    
    if(choise2 == 1) {
     System.out.println();
     System.out.println("You hit him.");
     System.out.println("He fell to the ground");
     fight();
    }
    else
     if(choise2 == 2) {
      System.out.println();
      System.out.println("He reaches you and he kills you.");
      System.out.println("You are dead.");
      System.out.println("Game over!");
     }
     else {
      north();
     }
   }
   
   else
    if(choise == 2) {
     System.out.println();
     System.out.println("The man is a thief, he reaches you and he kills you.");
     System.out.println("You are dead.");
     System.out.println("Game over!");
    }
   
    else {
     north();
    }
   
  }
  
  public void fight() {
   System.out.println();
   System.out.println("The man gets up and hits you.");
   playerHP = playerHP - 4;
   System.out.println("Your HP: " + playerHP);
   System.out.println("What do you want to do?");
   System.out.println("1: Hit him. ");
   System.out.println("2: Speak with him.");
   
   choise = myReply.nextInt();
   
   if(choise == 1) {
    System.out.println();
    System.out.println("The man fell down");
    manHP = manHP - 10;
    System.out.println("Man HP: "+ manHP);
    System.out.println("What do you want to do?");
    System.out.println("1: Finish him");
    
    choise2 = myReply.nextInt();
    
    if(choise2 == 1) {
     System.out.println();
     manHP = manHP - 5;
     System.out.println("Man HP: " + manHP);
     System.out.println("The man is passed out.");
     ending2();
     
     
    }
   }
   else
    if(choise == 2) {
     System.out.println();
     System.out.println("The man doesn't want to speak with you and hits you another time.");
     System.out.println("Your HP: " + (playerHP - 6) );
     System.out.println("You are dead.");
     System.out.println("Game over!");
    }
    else {
     fight();
    }
   
   
  }
  
  public void ending2() {
   System.out.println();
   System.out.println("Finaly you reached the town in the north.");
   System.out.println("Congratulation " + playerName + " you win!");
   
  }
  
  public void east() {
   System.out.println("You are walking...");
   System.out.println("Suddenly you find a house, it seems uninhabited.");
   System.out.println("What do you want to do?");
   System.out.println("1: Enter in the house.");
   System.out.println("2: Come back.");
   
   choise = myReply.nextInt();
   
   if(choise == 1) {
    house();
   }
   else
    if(choise == 2) {
     story();
    }
    else {
     east();
    }
  }
  
  public void house() {
   System.out.println("The house is uninhabited.");
   System.out.println("You find a table in the center of the room with a sheet of paper on it.");
   System.out.println("What do you want to do?");
   System.out.println("1: Read it");
   System.out.println("2: Run away");
   
   choise = myReply.nextInt();
   
   if(choise == 1) {
    read();
   }
   else 
    if(choise == 2) {
     east();
    }
  }
  
  public void read() {
   System.out.println("This is what it says:");
   System.out.println("You are in the wrong place " + playerName);
   System.out.println("Someone stabs you with a sword while you read.");
   System.out.println("You are dead.");
   System.out.println("Game over!");
   System.out.println();
   start();
   
  }
  
  
  
  public void west() {
   System.out.println();
   System.out.println("There's a river and near it a girl sitting on a rock.");
   System.out.println("What do you want to do?");
   System.out.println("1: I go to the girl.");
   System.out.println("2: I think.");
   
   choise = myReply.nextInt();
   
   if(choise == 1) {
    System.out.println();
    System.out.println("The girl looks scared...");
    System.out.println("She says she doesn't know how to get home.");
    System.out.println("What do you want to do?");
    System.out.println("1. I help her.");
    System.out.println("2. I want to rob her.");
    
    choise2 = myReply.nextInt();
    
     if(choise2 == 1) {
      System.out.println();
      System.out.println("You find the way to the girl's house.");
      System.out.println("The girl thanks you and shows you the way to a city in the north.");
      System.out.println("You decide to follow the girl's directions.");
      north();
     }
     else 
      if(choise2 == 2) {
       System.out.println();
       System.out.println("The girl had a hidden knife and stabbed you.");
       System.out.println("You are dead!");
       System.out.println("Game over!");
       System.out.println();
       
      }
      else {
       west();
      }
   }
   else
    if(choise == 2) {
     System.out.println("You need to do something.");
     west();
    }
    else {
     west();
    }
  }
}
