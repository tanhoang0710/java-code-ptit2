/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Vector;

/**
 *
 * @author DELL
 */
public class Data {
    Vector<Integer> v;
    private int index;
    private boolean running = true;
    Vector<Integer> tmp;
    
    public Data() {
        index = 1;
        running = true;
        v = new Vector<>();
        tmp = new Vector<>();
    }

    public Vector<Integer> getTmp() {
        return tmp;
    }
    
    public void addBackUp(int x) {
        tmp.add(x);
    }
    
    public void add(int n){
        v.add(n);
    }
    
    public int get() {
        return v.remove(0);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Vector<Integer> getV() {
        return v;
    }
    
    
}
