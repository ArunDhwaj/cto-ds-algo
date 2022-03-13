
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Router {

    private static Logger logger = LogManager.getLogger(Router.class);

    //Routes to different modules
    public void routesTo()
    {
        //Checking project setup
        initialSetup();


        //testGeneric4();

    }

    //Topic-0: Checking initial project set up
    private void initialSetup()
    {
        logger.info("Project initial setup check up !!!");

        System.out.println("Project initial setup check up !!!");
    }

    //Topic-1.1:

}
