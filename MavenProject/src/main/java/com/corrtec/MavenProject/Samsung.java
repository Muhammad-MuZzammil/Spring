package com.corrtec.MavenProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Component("Samsung")
//default value non qualified and De 
//capitalized and this value is packaged name and also got this
//component by this name in AppConfig in ConfgiurationScan.
@Component
public class Samsung {
	@Autowired
	@Qualifier("snapdragon")
	MobileProcessor cpu;

	public void config() {
		System.out.println("Octa Core, 12GB RAM, 12 MP Camera");
		cpu.process();
	}

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
}
