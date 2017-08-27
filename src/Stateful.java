import java.lang.Object.*;

/**
 * A mutable object that maintains state.&nbsp;Three components of state include textual, numerical, and logical data.
 * @author  Dr. Jody Paul
 * @author  Heather DeMarco
 * @version CS4250 Fall 2017 v2.5.1
 */

public class Stateful{
    String stateText;
    Number stateNum;
    Boolean stateTruth;

    /**
     *Constructs a stateful object using arbitrary values.
     */
    public Stateful(){
        stateText = "";
        stateNum = 0;
        stateTruth = true;
    }

    /**
     * Constructs a stateful object using specified values.
     * @param text the textual data
     * @param number the numerical data
     * @param truth the logical data
     */
    public Stateful(String text, Number number, Boolean truth){
        stateText = text;
        stateNum = number;
        stateTruth = truth;
    }


    /**
     * Accesses the logic component of state.
     * @return the truth status
     */
    public Boolean truth(){
        return stateTruth;
    }

    /**
     * Accesses the numeric component of state.
     * @return the numerical status
     */
    public Number number(){
        return stateNum;
    }

    /**
     * Accesses the text component of state.
     * @return the textual status
     */
    public String text(){
        return stateText;
    }

    /**
     * Modifies the state by inverting the logical value. If the state value was true, it is changed to false. If the state value was false, it is changed to true.
     */
    public void flip(){
        if(stateTruth)
            stateTruth = false;
        else
            stateTruth = true;
    }

    /**
     * Renders object in the format: Stateful[truth, number, "text"]
     *
     */
    public String toString(){
        return "Stateful[" + stateTruth + ", " + stateNum + ", " + stateText + "]";
    }
}

