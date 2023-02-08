class Drill4{
    String phaseOfWater(int num){
        if(num>=100)
        {
            return"vapor";
        }
        if(num<100&&num>0){
            return "liquid";
        }
        return "solid";
    }

    int maxDifference(int num1,int num2,int num3)
    {
        int max = num1;
        int min = num1;
        if(num2>max){
            max = num2;
        }
        if(num2<min)
        {
            min = num2;
        }
        if(num3>max){
            max = num3;
        }
        if(num3<min)
        {
            min = num3;
        }
        return max-min;
    }

    double ringArea(double innerRad,double outerRad)
    {
        double Area = Math.PI*outerRad*outerRad - Math.PI*innerRad*innerRad;
        return Area;
    }

    String ice = phaseOfWater(0);//"solid"
    int six = maxDifference(1,-1, 5);
    double three = ringArea (1.0,2.0);
}