class Open1C{
    int addnum(int one,int two)
    {
        return one+two;
    }
    double addnum(double one,double two){
        return one+two;
    }
    int addnum = addnum(1, 2);
    double addnum2 = addnum(1, 2);
    /**
     * PS C:\Users\ngcha\Documents\GitHub\cse11-pa3-starter> ./run.bat Open1C
找不到 C:\Users\ngcha\Documents\GitHub\cse11-pa3-starter\*.class
Tester Library v.3.0
-----------------------------------
Tests defined in the class: Open1C:
---------------------------
Open1C:
---------------
new Open1C:1(
 this.addnum = 3
 this.addnum2 = 3.0)
---------------
     */
}