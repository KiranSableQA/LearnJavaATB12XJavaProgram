package ex_20_OOPs_Super_Abstraction;

public class Example_02 {
    public static void main(String[] args) {
        Sable sa = new Sable();
        sa.tree();
    }
}

interface Male {
    void going_to_job();
    void come_back_to_home();
}

interface Female {
    void Cooking();
    void maintain_home();

    default void family()
    {
        System.out.println("Family responsibility");
    }
}

 class Sable implements Male, Female
 {
    void tree() {
        going_to_job();
        come_back_to_home();
        Cooking();
        maintain_home();
        family();  // calling default method from Female
    }

    @Override
    public void going_to_job()
    {
        System.out.println("Kiran going to job");
    }

    @Override
    public void come_back_to_home()
    {
        System.out.println("Kiran come back to home");
    }

    @Override
    public void Cooking()
    {
        System.out.println("Nikita is cooking");
    }

    @Override
    public void maintain_home()
    {
        System.out.println("Nikita is maintaining home");
    }
}
