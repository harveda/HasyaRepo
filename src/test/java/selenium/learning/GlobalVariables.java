package selenium.learning;

import org.junit.Test;

public class GlobalVariables {
    int i =10;
    int j=20;
    String ends="Ram Mohan";
    @Test
    public void test05(){
        int l=30;
        int k=i+j;
        System.out.println("value of k+l is  :   " +(k+l));
    }
    @Test
    public void test06(){
        String test01="Harika";
        String test02="Vedantam";
        System.out.println("My name is :   " +test01+" "+test02+""+ends);
        System.out.println("global j value: "  +j);

    }

}
