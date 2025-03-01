/*
 * class for rectangle
 */
public class Rectangle{
    /* the length of the rectangle */
    private double longueur;
    /* the width of the rectangle */
    private double largeur;

    /* Builds a rectangle with length and width as parameters 
     * @param longueur double : length of the rectangle
     * @param largeur double : the width of the rectangle
      */
    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * method to return the length of the rectangle
     * @return the the length of the rectangle
     */
    public double getLength(){
        return longueur;
    }

    /**
     * methode to get the width of the rectangle
     * @return the width of the rectangle
     */
    public double getWidth(){
        return largeur;
    }

    /**
     * Calculate and return the area of the rectangle.
     * @return the area of the rectangle
     */
    public double calculateArea(){
        return longueur*largeur;
    }

    /**
     * calculer the perimeter of the rectangle
     * @return the perimeter of the rectangle
     */
    public double calculerPerimeter(){
        return (longueur+largeur)*2;
    }

    /**
     * check if the rectangle is a square
     * @return true if the rectangle is a square and false if the rectangle is not a square
     */
    public boolean isSquare(){
        return (longueur==largeur)?true:false;
    }

    /**
     * check if the rectangle is equal to another rectangle
     * @param obj the object to compare 
     * @return true if the rectangle is equal to another object(rectangle) and false if not
     */
    public boolean equals(Rectangle obj){
        if(!(obj instanceof Rectangle)){
            return false;
        }
        Rectangle otherRectangle = (Rectangle)obj;
        return otherRectangle.longueur==this.longueur && otherRectangle.largeur==this.largeur;
    }

    /**
     * method to get the description of the rectangle as a string
     * @return the description of the rectangle(longueur,largeur)
     */
    public String toString() {
        return "Representation du rectangle : \n" + "longueur : " +longueur +"\n"
        +"largeur : "+largeur + "\n" ;
        
    }

}