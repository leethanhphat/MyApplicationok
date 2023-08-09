package com.example.myapplication;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NonNls;

public class VectorM {
    private float x,y,z;
    public static void main(String[] args) {
        System.out.println();
    }
    public VectorM (){
        x = y = z =0;
    }
    public VectorM (float x , float y, float z){
        this.x =x;
        this.y =y;
        this.z =z;
    }

    //vector dùng v1 v2
    /*public VectorM CongVector (VectorM v1, VectorM  v2 ){
        return new VectorM(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }
    public float TichVoHuongVector (VectorM v1, VectorM v2 ){
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z ;
    }*/
    //vector dùng v thì this còn lại là v còn lại
    public VectorM CongVector (VectorM v ){
        return new VectorM(v.x + this.x, v.y + this.y, v.z + this.z);
    }
    public float TichVoHuongVector (VectorM v){
        return v.x * this.x + v.y * this.y + v.z * this.z ;
    }
    public float Module (){
        return (float) Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2)+ Math.pow(this.z,2));
    }

    @NonNull
    @Override
    public String toString(){
        return  "(" +x+ "," +y+ "," +z+ ")" ;
    }
    }



