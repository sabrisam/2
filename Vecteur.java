public class Vecteur {
    private double[] elements;

    public Vecteur(double[] elements){
        this.elements = elements.clone();
    }

    public void setElement(int index, double valeur){
        if(elements.length < index) return;
        this.elements[index] = valeur;
    }

    public double getElement(int index){
        return elements[index];

    }

//    public Vecteur dotProduct(Vecteur V){
//        double resultat;
//
//return V;
//    }

    public void afficher(){
        System.out.println( "{" + getElement(0) + ", " + getElement(1) + ", " + getElement(2) + "}" );

    }
}


//