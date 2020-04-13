/* 
    Simon Design Suite version  1.0 
 */
package ephraim;

/**
 * Interface to box up a unit of slot meant to be executed in par with a signal
 * @author ADEDAMOLA
 */
public interface CSlot {
    /**
     * This method is invoked on the slot object.
     * Think of it like the run() of java's (@code Runnable} class
     * @param object The message the signal wants to pass to the slot
     */
    public void exec(Object object);
    /**
     * incase the slot wants only to be executed on a signal with a specific message.
     * The message is stored as a predicate in the slot, and the slot will only get executed 
     * when the signal's message matches the slot's predicate. <hr>
     * this is very useful in cases where we have hundreds of UI widgets adding slots 
     * for just one signal ID. You know in this case, once the signal is emitted, it triggers 
     * all the slots binded to it; hence if the developer wants the signal to only target a 
     * particular binded slot at API level, he simply adds the message as a predicate. <br>
     * the advantage of this method will become obvious when you want to use this class in UI based projects.
     * @return {@code Object} predicate to match message
     */
    default Object getPredicate(){
        return null;
    }
}
