/**
 *
 * @author Will-Not
 */
package beachmarck;

public class InfoSistem {

    Runtime run = Runtime.getRuntime();
   
    
   
    
    public int numeroThread() {
        return run.availableProcessors();
    }

    public long totalRam() {
        return run.totalMemory();
    }

    public long livreRam() {
        return run.freeMemory();

    }
    
    public int lasd(){
        
        return 1;
    }
}
