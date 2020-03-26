import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryMain 
{
	public static void main(String args[])
	{
		OperatingSystemFactory osf = new OperatingSystemFactory();
		//OS obj = ((OperatingSystemFactory) osf).getInstance("jbjkk");
		OS obj = osf.getInstance("jnnk");
		obj.spec();
	}
}
 