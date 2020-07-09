
void setup() {
  size(600,600);
PImage cat=loadImage("cat.png");
cat.resize(600,600);
image(cat, 0,0);

}
void draw() {
fill (mouseX, mouseY, 66);
 ellipse(250,360, 70,70);
ellipse(350,300, 70, 70);
fill(0);
ellipse(250,360, 10,10);
ellipse(350,300, 10,10);

}
