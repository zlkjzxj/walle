package com.walle.abstracts;

/**
 * Created by zlkjzxj on 2017/7/11.
 */
public class DogImpl implements Dog,Animal
{
    public void play() {

    }

    public void wang() {

    }

    public void eat() {

    }

    public static void main(String[] args) {
        Dog dog = new Dog() {
            public void play() {

            }

            public void wang() {

            }

            public void eat() {

            }
        };

        new DogImpl(){
            public void play() {

            }

            public void wang() {

            }

            public void eat() {

            }
        }.eat();
    }

}
