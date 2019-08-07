package com.corrtec.MavenProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("mediatak") 
//default value non qualified and De 
//capitalized and this value is packaged name and also got this
// component by this name in AppConfig in ConfgiurationScan. 

@Component
//@Primary If you're not going for primary then use @Qualifier in
//the bottom of @Autowired to know the compiler which class can run.
public class MediaTak implements MobileProcessor {

	public void process() {
		System.out.println("2nd Best CPU");

	}

}
