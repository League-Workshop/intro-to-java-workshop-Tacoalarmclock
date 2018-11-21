PImage catPic;
int x = 444;
int y = 237;
void setup() {

  size(711, 385);
noStroke();    
  catPic = loadImage("cat.png");
  catPic.resize(width, height);
  background(catPic);
}

void draw() {
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
  fill(255, 50, 25);
  ellipse(x, y, 55, 55);
  ellipse(x - 125, y - 31, 55, 55);
}
void keyPressed()
{
  x+= 3;
  y-= 3;
if (y < 4){
  
catPic = loadImage("cat.png");
  catPic.resize(width, height);
  background(catPic);

x = 444;
y = 237;
}
}
