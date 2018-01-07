package com.company.btn;

class BTN {
    public int val;
    public BTN left;
    public BTN right;

    public BTN(BTN l, BTN r, int v ){
        left = l;
        right = r;
        val = v;
    }
    public BTN(){

    }

}