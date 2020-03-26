package Primary_Qualifier_AnnotationComponent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SnapDragon implements MobileProcessor {

	public void process() 
	{
		System.out.println("world best cpu");
	}

}
 