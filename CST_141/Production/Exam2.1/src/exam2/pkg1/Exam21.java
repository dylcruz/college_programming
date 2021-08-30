package test2q1;

public class Land //Modify this statement as a question on the exam.
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
  
  //Add 3 abstract methods here as a question on th exam.
}