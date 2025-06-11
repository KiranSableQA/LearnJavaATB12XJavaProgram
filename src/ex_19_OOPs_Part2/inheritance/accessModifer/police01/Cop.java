package ex_19_OOPs_Part2.inheritance.accessModifer.police01;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    public void canIShoot(){
        System.out.println("Yes You can shoot!");
    }


    private void defaultFunction(){

    }

}
