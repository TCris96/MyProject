package com.sda.task.enums.task2;

public enum PackageSize {
    SMALL(5,10),
    MEDIUM(10,30),
    LARGE(30,90),
    UNKNOWN(0,0);

    private int  minimumSize;
    private int maximumSize;


     PackageSize(int minimumSize, int maximumSize){
        this.minimumSize = minimumSize;
        this.maximumSize = maximumSize;
    }
    public static PackageSize getPackageSize(int minimumSize, int maximumSize){
         for(PackageSize packageSize : values()){
             if(minimumSize >= packageSize.minimumSize && maximumSize <= packageSize.maximumSize){
                 return packageSize;
             }
         }
         return UNKNOWN;
    }
}
