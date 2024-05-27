package com.akshayLocal.DSA.programs.Platform;

abstract public  class Employee {
    protected abstract double getSalesAmount();
    public double getCommision()
    {
        return getSalesAmount()*0.15;
    }
}
