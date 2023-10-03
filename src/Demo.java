
public class Demo {

	public static void main(String[] args) {
		
		CarOne c1=new CarOne();
		
		c1.cost=20000;
		c1.color="red";
		c1.model="bmw";
		c1.speed=30;
		
		c1.StartCar();
		c1.StopCar();
				
		CarThree c3=new CarThree();
		c3.cost=3900;
		c3.color="green";
		c3.model="swift";
		c3.speed=34;
		c3.mannual=" is mannual";
		c3.auto=" is auto";
		
		c3.mannual();

	}

}
