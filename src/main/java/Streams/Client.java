package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    static List<Integer> listValues = new ArrayList<>();
    public static void main(String[] args){

        listValues.add(1);
        listValues.add(2);
        listValues.add(3);
        listValues.add(4);
        listValues.add(5);
        listValues.add(6);

        /*for(Integer element: listValues){
            System.out.println("Value in list is:- "+element);
        }*/

        //example1();
        //example2();
        //example3();
        //example4();
        example5();

    }

    public static void example1(){
        listValues
                .stream()
                .forEach((ele)->{
                    System.out.println("Value in stream is:- "+ele);
                });
    }

    public static void example2(){
        listValues
                .stream()
                .map((ele)->{
                    return ele*ele;
                })
                .forEach((ele)->{
                    System.out.println("Square of element in map stream is:- "+ele);
                });
    }

    public static void example3(){
        listValues
                .stream()
                .map((ele)->{
                    Object[] tuple = {'S',0};
                    char ans = 'Y';
                    if(ele%2==0){
                        tuple[0]=ans;
                    }
                    else {
                        tuple[0]='N';
                    }
                    tuple[1]=ele;
                    return tuple;
                })
                .forEach((ele)->{
                    if((char) ele[0]=='Y'){
                        System.out.println("Square of even number is:- "+(int)ele[1]*(int)ele[1]);
                    }
                    else{
                        System.out.println("Square of odd number is not calculated");
                    }
                });
    }

    public static void example4(){
        listValues
                .stream()
                .filter((ele)->{
                    return ele%2==0;
                })
                .forEach((ele)->{
                    System.out.println("Square of even number using stream filter is:- "+ele*ele);
                });
    }

    public static void example5(){
        double finalSum =
                listValues
                        .stream()
                        .reduce(0,(sum,ele)->sum+ele);
        System.out.println("Final sum is:- "+finalSum);
    }
}

