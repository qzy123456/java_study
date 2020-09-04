package 汽车类;

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
		System.out.print("汽车编号:"+car1.getId()+",汽车颜色:"+car1.getColor());
	}
}
