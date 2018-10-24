int ballx = 0;
int xvelocity = 1;
int bally = 10;
int yvelocity = 1;
int rectanglex = mouseX;
void setup(){
 size(500,500);
 background(255,255,255);
}
void draw(){
  rectanglex = mouseX - 25;
  background(255,255,255);
  rect(rectanglex, 450, 50,10);
  bally += yvelocity;
  ballx += xvelocity;
  fill(0,0,0);
  ellipse(ballx,bally,10,10);
  if(ballx == 490){
    xvelocity = -10;
    yvelocity = 2;

}
else if(ballx == 10){
 xvelocity  = 10;
 yvelocity = 7;
}
if(bally < 1){
 yvelocity = 7; 
}
if(bally > 499){
 yvelocity = -7; 
}
if (bally > 450 && bally < 450 + 10 && ballx > rectanglex && ballx < rectanglex + 50){
  yvelocity = -7;
  xvelocity =- 1;
}
}