
public class Toyota extends Car {
	private int ServiceMonths;

	public Toyota(int serviceMonths) {
		super("Toyota", "4W", 4, 5, 6, true);
		ServiceMonths = serviceMonths;
	}
	public void accelerate(int rate) {
		//Add rate to the previous speed to get the new speed :
		int newspeed=getCurrentspeed()+rate;
		//if the current speed is 0 then call stop method and change gear to 0:
		if(newspeed==0) {
			stop();
			Changegear(1);
		}
		//if not test if the current speed between 0 and 10 then change gear by 1
		else if(newspeed>0 && newspeed<=10)
			Changegear(1);
		//if not test if the current speed between 0 and 10 then increase gear by 1
		else if(newspeed>10 && newspeed<=20)
			Changegear(2);
		
		else if(newspeed>20 && newspeed<=30)
			Changegear(3);
		
		else {
			Changegear(4);
		}
		
		if(newspeed>0)
			ChangeSpeed(newspeed, getCurrentDirction());
  
	}
}
