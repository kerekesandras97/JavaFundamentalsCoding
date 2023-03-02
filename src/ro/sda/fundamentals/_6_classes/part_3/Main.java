package ro.sda.fundamentals._6_classes.part_3;

public class Main {
    public static void main(String[] args) {

        // we created an instance of the class Wall (variable/reference called wall1) - we used the cunstructor without params (no-args constructor)
        Wall wall1 = new Wall();

        // we called the setter for the width field on the instance that was previously creted :
        //- using this setter we will initialize the field/attribute/{instance variabile) - width - of the instance (wall1) with the value is sent as a parameter
        wall1.setWidth(-100);

        // we called the setter for the height field on the instance that was previously creted :
        //- using this setter we will initialize the field/attribute/{instance variabile) - height - of the instance (wall1) with the value is sent as a parameter
        wall1.setHeight(50);


        // we retrieve the value of the instance variable - width - of the wall instance using the getter
        System.out.println("Width = " + wall1.getWidth());

        // we retrieve the value of the instance variable - width - of the wall instance using the getter
        System.out.println("Height = " + wall1.getHeight());

        //we called the - getArea() method - on the instance wall
        System.out.println("Area= " + wall1.getArea());



        // we creted another instance of the class Wall (variabile/refernce called wall2 instance using getter
        Wall wall2 = new Wall(72, 25);

        // we retrive the value of the instance variable - width - of the wall2 instance using the getter
        System.out.println("Width = " + wall2.getWidth());

        // we retrive the value of the instance variable - height - of the wall2 instance using the getter
        System.out.println("Height = " + wall2.getHeight());

        //we called the - getArea() method - on instance wal2
        System.out.println("Area = " + wall2.getArea());
    }
}
