package SpringAOP.SpringAOP;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
       
        		
        		// spring will create objects no need of creating by using new keyword
        		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        		
        		Aero ar = context.getBean(Aero.class);
        		ar.show();
        	}
    

    }
