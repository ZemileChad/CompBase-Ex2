/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author sarun
 */
public class LiveUAE implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println(
	 "(LiveUAE) Live result:" + 
                ((HeadQuater)o).getScore());
    }
}
