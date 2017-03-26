package test;
 
public class one {
    public static String triangles (int a, int b, int c){
        if(a+b > c && a+c > b && b+c > a){
        if (a == b && b == c)
            return "this is a equilateral triangle!";
        else if (a == b || b == c || c == a)
            return "this is a isosceles triangle!";
        else
            return "this is a scalene triangle!";
             
        }
        else
        return "this is not triangle!";
    }
     
     
}