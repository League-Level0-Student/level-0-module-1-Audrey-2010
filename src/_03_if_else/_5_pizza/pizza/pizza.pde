
void setup() {
    size(600,600);
   fill(#E3C340);
    noStroke();
    ellipse(250,250, 500,500);
   fill(#C62424);
    ellipse(250,250, 425,425);
    fill(#FFFFFC);
    ellipse(250,250, 400,400);
}
void draw() {
    PImage pepperoni=loadImage("beef-pepperoni-slice_1368513.jpg");
pepperoni.resize(100,100);
if(mousePressed){
  image(pepperoni,mouseX, mouseY);
}
image(pepperoni, 250,250);
image(pepperoni, 150, 100);
image(pepperoni, 150, 300);
image(pepperoni, 300, 150);
image(pepperoni, 150, 200);

}
