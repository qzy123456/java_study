package Java06.car;
public class CarSample 
 {
    private int id;
    private String color;	  
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}

	public static void main(String[] args)
	{
		Car car1=new Car();
		car1.setId("No0001");
		car1.setColor("red");
		System.out.print("�������:"+car1.getId()+",������ɫ:"+car1.getColor());
	}
}
