class Rectangle {
  // attributs de la classe
  private double largeur;
  private double hauteur;

  // constructeur de la classe
  public Rectangle(double largeur, double hauteur) {
    this.largeur = largeur;
    this.hauteur = hauteur;
  }

  public String toString() {
    return "largeur : " + this.largeur + "\n" +
        "hauteur : " + this.hauteur;
  }

  public double getLargeur() {
    return this.largeur;
  }

  public double getHauteur() {
    return this.hauteur;
  }

  @Override
  public boolean equals(Object rectangle2) {

    if (this == rectangle2) {
      return true;
    }
    if (rectangle2 == null || !(rectangle2 instanceof Rectangle)) {
      return false;
    }
    Rectangle rectangle3 = (Rectangle) rectangle2;
    if (largeur == rectangle3.largeur && hauteur == rectangle3.hauteur)
      return true;

    return false;
  }
}
