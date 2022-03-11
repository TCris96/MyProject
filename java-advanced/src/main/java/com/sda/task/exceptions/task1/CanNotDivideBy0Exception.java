package com.sda.task.exceptions.task1;

public class CanNotDivideBy0Exception extends RuntimeException{
 public CanNotDivideBy0Exception(){
    super("You can't divide by 0. Try again with another number.");
 }
}
