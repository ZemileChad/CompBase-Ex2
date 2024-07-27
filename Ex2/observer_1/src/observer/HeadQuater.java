/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class HeadQuater implements Source {
    private final ArrayList<MyObserver> list;
    private String someData;

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setScore(String aData) {
	someData = aData;
	notifyObservers();
    }
    public String getScore() {
	return someData;
    }
    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
}
