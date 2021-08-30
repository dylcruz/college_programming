package test2q1;

import java.util.Date;

public abstract class Land //Modify this statement as a question on the exam.
{
  private int id;
  private double lotSize;
  
  public Land(int id, double lotSize) {
    this.id = id;
    this.lotSize = lotSize;
  }
  
  public void setId(int id)
  {
      this.id = id;
  }
  
  public void setLotSize(double lotSize)
  {
      this.lotSize = lotSize;    
  }
  
  public int getId() {
    return id;
  }
  
  public double getLotSize()
  {
      return lotSize;
  }
  
  public abstract double getSquareFeet();
  public abstract double getNumberOfBedrooms();
  public abstract Date getWhenBuilt();
}