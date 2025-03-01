public class RectangleMain{
    public static void main(String[] args){
        
        // Creation of the first rectangle 
        // if args.length is equal to 2 it means that the two arguments have been provided
        Rectangle rectangle1;

        if (args.length == 2) {
            double longueur = Double.parseDouble(args[1]);
            double largeur = Double.parseDouble(args[0]);
            rectangle1 = new Rectangle(longueur, largeur);
        } else if (args.length == 1) {
            // if args.length is equal to 1 it means that just one value is provided
            double argument = Double.parseDouble(args[0]);
            // and the program considere the value of the width as equal as length
            rectangle1 = new Rectangle(argument, argument);
        } else {
            // if argument does not respect the previous conditions a error message will be appeared
            System.out.println("Error: Please enter the width and length of rectangle1.");
            return;
        }

        // Creation of the second rectangle
        Rectangle rectangle2 =new Rectangle(8,5);

        // Representation of details and informations of the two rectangles
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());

        // calculate the area of the first rectangle
        double area = rectangle1.calculateArea();
        System.out.println("area of rectangle1 : "+ area);

        // Calculate the perimeter of the first rectangle
        double perimeter =rectangle1.calculerPerimeter();
        System.out.println("Perimeter of rectangle1 : "+ perimeter);

        // Verification if the first rectangle is square
        System.out.println("The rectangle1 is a square ? :"+rectangle1.isSquare());

        // Verification if the second rectangle is square
        System.out.println("The rectangle2 is a square ? :"+rectangle2.isSquare());
        
        // Equality test between the two rectangles
        System.out.println("rectangle1 is equal to rectangle2 ? : "+rectangle1.equals(rectangle2));


    }
    
}
