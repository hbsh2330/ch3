package com.fastcampus.di1;
class Car{}
class SportsCar extends Car{}

class Engine{}

class Door{}
class Truck extends Car{}
public class Main {
    public static void main(String[] args) {
        Car car = getCar();
    }

    static Car getCar(){
        return new Truck();
    }
//주석입니다
    static void godo(){
        System.out.println("hell");
    }
}
