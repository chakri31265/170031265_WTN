import java.io.*;
import java.util.*;
class Stockp{
String stockname;
String stocksymbol;
double preclosval;
double curclosval;
public Stockp(String stockname,String stocksymbol,double preclosval,double curclosval){
this.stockname=stockname;
this.stocksymbol=stocksymbol;
this.preclosval=preclosval;
this.curclosval=curclosval;
}
public void getChangePercentage()
{
double percentage;
percentage=(preclosval/curclosval)*100;
double b=100-percentage;
System.out.println("percentage change from the previous closing price to the current closing price:"+b);
}
}
public class P42{
public static void main(String[] args){
Stockp a=new Stockp("Shirt","$",5000.99,6000.32);
a.getChangePercentage();
}
}