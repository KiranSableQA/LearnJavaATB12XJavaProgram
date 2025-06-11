package ex_19_OOPs_Part2.inheritance.accessModifer.Criminal02;

import ex_19_OOPs_Part2.inheritance.accessModifer.police01.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(10);
        thief.canIShoot();
        System.out.println(thief.gun);
    }
}

