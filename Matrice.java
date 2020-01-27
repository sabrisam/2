public class Matrice {
    private double[][] tab;
    private int lignes;
    private int cols;
    private double n;
    private double valeur;
    private int ligne;
    private int col;

//    private int n;

    public Matrice(int lignes, int cols){
        this.lignes = lignes;
        this.cols = cols;
        this.tab = new double[lignes][cols];
        this.tab[lignes][cols] = valeur;
        valeur = 0;
    }

    public void additionnerScalaire(double n){
        this.n = n;
        for (int i=0; i<lignes; i++){
            for(int j=0; j<cols; j++){
                tab[i][j] = tab[i][j] + this.n;
            }
        }
    }

    public void multiplierScalaire(double n){
        this.n = n;
        for (int i=0; i<lignes; i++){
            for(int j=0; j<cols; j++){
                tab[i][j] = tab[i][j] * this.n;
            }
        }
    }

    public Matrice dotProduct(Matrice m){
        Matrice produit = new Matrice(lignes,cols);
        for (int i = 0; i<produit.lignes; i++){
            for (int j=0; i<produit.cols; j++){
                for (int k=0; k<lignes; k++){
                    produit.tab[i][j] = produit.tab[i][j] + tab[i][k]*m.tab[k][j];
                }
            }
        }
        return produit;
    }

    public double getCell(int ligne, int col) {
        this.ligne = ligne;
        this.col = col;
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < col; j++) {
            }
        }
    }
//
//    public void setCell(int ligne, int col, double valeur){
//
//    }
//
//    public Vecteur getLine(int ligne){
//
//    }
//
//    public Vecteur getCol(int col){
//
//    }
//
//public void afficher(){
//    System.out.println( "{" +  "}" );
//
//}
//
//    public Matrice transpose(){
//
//    }
//
    public static Matrice identite(int n){
        Matrice ident = new Matrice((n,n));
        for(int i=0; i<n; i++){
            i = 1;
        }
        return ident;
    }


}
