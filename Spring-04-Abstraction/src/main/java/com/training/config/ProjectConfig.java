package com.training.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
@ComponentScan check only the same package, not other packages.
To make them check other packages, we need to add
basePackages = " "
 */

@Configuration
@ComponentScan (basePackages = "com.training")
//@ComponentScan (basePackages = "com.training.proxy", "com.training.service", "com.training.repository")
public class ProjectConfig {

}
