package ss23_behavioral_design_pattern.thuc_hanh.bai3_Observer;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}