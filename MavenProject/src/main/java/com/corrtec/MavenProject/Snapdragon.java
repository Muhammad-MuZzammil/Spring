package com.corrtec.MavenProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("Snapdragon") 
//default value non qualified and De 
//capitalized and this value is packaged name and also got this
//component by this name in AppConfig in ConfgiurationScan.

@Component
//@Primary If you're not going for primary then use @Qualifier in
// the bottom of @Autowired to know the compiler which class can run.
public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("World Best Processor");
	}

}
