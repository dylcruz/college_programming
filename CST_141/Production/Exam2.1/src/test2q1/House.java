package test2q1;

import java.util.Date;

public class House extends Land implements Cloneable, Comparable<House> //Modify this statement as a question on the exam.
{
  private double squareFeet;
  private double numberOfBedrooms;
  private java.util.Date whenBuilt;
  
  public House(int id, double lotSize, double squareFeet, double numberOfBedrooms)  //Rewrite this constructor including parameters as a question on the exam.
  {
      super(id, lotSize);
      this.squareFeet = squareFeet;
      this.numberOfBedrooms = numberOfBedrooms;
  }
  
  //Code overriding the 3 methods from Land as a question on the exam.
  @Override
  public double getSquareFeet(){
      return squareFeet;
  }
  
  
  @Override
  public double getNumberOfBedrooms(){
      return numberOfBedrooms;
  }
  
  @Override
  public Date getWhenBuilt(){
      return whenBuilt;
  }
  
  
  @Override
  public Object clone()   //Rewrite this method to perform a deep copy as a question on the exam.
  {
      try
      {
         return super.clone();
      }
      catch (CloneNotSupportedException ex)
      {
          return null;
      }
  }
  
  @Override //Rewrite this method as a question on the exam.
  public int compareTo(House o) {
     return o.compareTo(this);
  }  
  
  @Override
  public String toString()
  {
      return ("ID: " + getId() + " Lot Size: " + getLotSize() + 
              " Square Ft: " + squareFeet +
              " Number of Bedrooms: " + numberOfBedrooms +
              " Built: " + whenBuilt);
  }
    
}