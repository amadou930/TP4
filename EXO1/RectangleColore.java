class RectangleColore extends Rectangle {
  // attributs
  private String couleur;

  public RectangleColore(double largeur, double hauteur, String couleur) {
    super(largeur, hauteur);
    this.couleur = couleur;
  }
  @Override
  public String toString() {
    return "largeur : " + this.getLargeur() + "\n" +
        "hauteur : " + this.getHauteur() + "\n" +
        "couleur :" + this.couleur;
  }
     @Override
  public boolean equals(Object rectangle2) {

    if (this == rectangle2) {
      return true;
    }
    if (rectangle2 == null || !(rectangle2 instanceof RectangleColore)) {
      return false;
    }
    RectangleColore rectangle3 = (RectangleColore) rectangle2;
    if (getLargeur()== rectangle3.getLargeur() && getHauteur()==rectangle3.getHauteur() && couleur.equals(rectangle3.couleur))
      return true;
   
    return false;
  }


}