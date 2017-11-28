/**
 * 
 */
package com.balicamp.ngx.master.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author <a href="mailto:bagus.sugitayasa@sigma.co.id">GusdeGita</a>
 * @version Id: 
 */
@Configuration
@EnableWebMvc
@ComponentScan({ "com.balicamp.ngx.master.api.simple" })
public class ResourceServerWebConfig extends WebMvcConfigurerAdapter {

}
