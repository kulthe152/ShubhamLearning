package Primary_Qualifier_AnnotationComponent;
import org.springframework.stereotype.Component;


@Component
////@Primary dd dq,dq
public class MediaTech implements MobileProcessor {

	public void process() 
	{
		System.out.println("2nd Base CPU");
	}

}
