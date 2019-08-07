package com.corrtec.MavenProject;

public interface MobileProcessor {
	void process();
}
// If interface implemented two different classes than use @Primary
// to remove confusion of compiler that which class can compile.