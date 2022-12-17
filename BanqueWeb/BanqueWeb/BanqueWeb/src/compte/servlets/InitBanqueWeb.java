package servlets;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class InitBanqueWeb
 *
 */
public class InitBanqueWeb implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public InitBanqueWeb() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	try {
    		var context = sce.getServletContext();
    		var nameDataSource = context.getInitParameter("nomDataSource");
    		Context initContext = new InitialContext();
    		Context envContext = (Context) initContext.lookup("java:/comp/env");
    		context.setAttribute("dataSource", (DataSource) envContext.lookup(nameDataSource));
    	} catch(NamingException e) {
    		System.out.println(e.getMessage());
    	}
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }
	
}
