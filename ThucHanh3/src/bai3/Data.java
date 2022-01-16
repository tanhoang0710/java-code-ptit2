/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author DELL
 */
public class Data {
    private int index;
    private boolean running;
    private PhanSo p1;
    private PhanSo p2;
    private PhanSo p3;
    private String pheptinh;

    public Data() {
    }

    public Data(int index, boolean running, PhanSo p1, PhanSo p2, PhanSo p3) {
        this.index = index;
        this.running = running;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public int getIndex() {
        return index;
    }

    public boolean isRunning() {
        return running;
    }

    public PhanSo getP1() {
        return p1;
    }

    public PhanSo getP2() {
        return p2;
    }

    public PhanSo getP3() {
        return p3;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setP1(PhanSo p1) {
        this.p1 = p1;
    }

    public void setP2(PhanSo p2) {
        this.p2 = p2;
    }

    public void setP3(PhanSo p3) {
        this.p3 = p3;
    }

    public String getPheptinh() {
        return pheptinh;
    }

    public void setPheptinh(String pheptinh) {
        this.pheptinh = pheptinh;
    }

    
    
    
    
}
