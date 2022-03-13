
import ds.trie.Trie;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Router {

    private static Logger logger = LogManager.getLogger(Router.class);

    //Routes to different modules
    public void routesTo()
    {
        //Topic-0: Checking project setup
        initialSetup();

        //Topic-1: Trie Data Structure
        workWithTrie();

    }

    //Topic-0: Checking initial project set up
    private void initialSetup()
    {
        logger.info("Project initial setup check up !!!");

        System.out.println("Project initial setup check up !!!");
    }

    //Topic-1.1: Testing Trie Data
    private void workWithTrie()
    {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");
        trie.insert("pick");
        trie.insert("pickle");

        System.out.println("In Trie following are inserted: 'cat', 'car', 'dog', 'pick', 'pickle'");

        boolean isPresent = trie.search("cat");
        System.out.println("1. In Trie: 'cat' isPresent?: " + isPresent );

        isPresent = trie.search("car");
        System.out.println("2. In Trie: 'car' isPresent?: " + isPresent );

        isPresent = trie.search("picky");
        System.out.println("3. In Trie: 'picky' isPresent?: " + isPresent );

        isPresent = trie.startsWith("ca");
        System.out.println("4. In Trie: 'ca' isPresent?: " + isPresent );

        isPresent = trie.startsWith("pen");
        System.out.println("5. In Trie: 'pen' isPresent?: " + isPresent );

        isPresent = trie.startsWith("sbp");
        System.out.println("6. In Trie: Search 'sbp' before inserting : " + isPresent );

        trie.insert("sbp");
        isPresent = trie.startsWith("sbp");
        System.out.println("7. In Trie: Search 'sbp' after inserting : " + isPresent );

    }
}
