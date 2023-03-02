package ro.sda.fundamentals._6_classes.part_4;

public class Main {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(12, 488);
        ComplexNumber c2 = new ComplexNumber(35.6, 60.78);

        ComplexNumber c3 = c1;
        ComplexNumber c4 = c2;

//       ComplexNumber c5 = new ComplexNumber(c1.getReal(), c1.getImaginary());

        c1.add(75.3, 1000.75);

        System.out.println("c1 real part is " + c1.getReal());
        System.out.println("c1 imaginary part is " + c1.getImaginary());

        c2.add(c1);

        System.out.println("c2 real part is " + c2.getReal());
        System.out.println("c2 imaginary part is " + c2.getImaginary());

        System.out.println("c3 real part is " + c3.getReal());
        System.out.println("c3 imaginary part is " + c3.getImaginary());
        System.out.println("c4 real part is " + c4.getReal());
        System.out.println("c4 imaginary part is " + c4.getImaginary());

        System.out.println("-----------------");

        ComplexNumber c6 = new ComplexNumber(43.43, 500.42);
        ComplexNumber c7 = new ComplexNumber(20.54, 200.35);

        c6.substract(110.13, 300);
        c7.subtract(c6);

        System.out.println("c6 real part is " + c6.getReal());
        System.out.println("c6 imaginary part is " + c6.getImaginary());
        System.out.println("c7 real part is " + c7.getReal());
        System.out.println("c7 imaginary part is " + c7.getImaginary());

        System.out.println("Salut");
    }

}
