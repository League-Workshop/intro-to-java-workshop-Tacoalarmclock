PImage rainbow;
PImage unicorn;
void setup () {
  size(1600, 800);

  rainbow = loadImage("Rainbow.png");


  rainbow.resize(width, height);
  background(rainbow);
   unicorn = loadImage("unicorn.png");
    unicorn.resize(width/2, height/2);
}
void draw () {
 background(rainbow);  
      image(unicorn, mouseX, mouseY);

}
