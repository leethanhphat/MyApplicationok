package com.example.myapplication;

import java.lang.reflect.Array;

public class Program {

    public static final float Pi = 3.14f;
    public  static float TinhTong (float a, float b){
        return a + b ;
    }
    // TINH TONG STRING A + B + C
    public static String TinhTong (String c, String d){
        String e = c + d;
        return e;
    }
    // TINH TONG MANG
    public  static float[] TinhTong(float[] arr1, float[] arr2 ){
        float[] kq = new float[arr1.length];
        for (int i = 0; i< kq.length ; i++)
        {
            kq[i] = arr1[i] + arr2[i];
        }
        return kq;
    }
    public static void PrintArr(float[] arr){
        for (float v: arr){
            System.out.println(v + ", "+ "\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("+++++++++++++");
        System.out.println(" Hello, em iu");
        System.out.println("+++++++++++++\n");

        System.out.println(TinhTong(3.5f,4.5f) );
        System.out.println(TinhTong("hello"," anh bạn"));
        System.out.println(TinhTong(new float[]{1.1f,1.2f} , new float[]{1.1f,1.2f}));
        PrintArr(TinhTong(new float[]{1.1f,1.2f} , new float[]{1.1f,1.2f})  );// phải tạo hành riêng mới chạy được

        float R = 10;
        float S = Pi*R*R;
        System.out.println("Dien tich dtron" + R + "la :" + S  + "\n");


        VectorM v1 = new VectorM(2f, 3f, 4f);
        VectorM v2 = new VectorM(2f, 3f, 4f);
        VectorM cong = v1.CongVector(v2);
        float tvh = v1.TichVoHuongVector(v2);
        float m1 = v1.Module();
        float m2 = v2.Module();
        System.out.println("Vector 1:" + v1.toString());
        System.out.println(v1+ "+" +v2+"=" +cong );
        System.out.println(v1+ "*" +v2+"=" +tvh );
        System.out.println("Module" + v1+ "="+m1);
        System.out.println("Module" + v2+ "="+m2 + "\n");

        Human h = new Human("Phat");
        Student st = new Student("Phong",8f);
        System.out.println(h);
        System.out.println(st);

    }
    //TINH TONG 2 SO FLOat


    //tinh vecto

}
