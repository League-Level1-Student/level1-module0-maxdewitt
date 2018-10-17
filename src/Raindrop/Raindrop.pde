int rainY = 0;
int score;
int rainX = 100;
int randomNumber;
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100){
          score++;
          rainY = 0;
          randomNumber = (int) random(500 - 100) + 100;
           rainX = randomNumber;
     }
     else if (score > 0){
          score-- ;
     }
     println("Your score is now: " + score); }
void setup(){
 size(500,500);
}

void draw(){
  
  background(200,200,200);
  fill(0,5,200);
  stroke(0, 100, 200);
  ellipse(rainX,rainY,5,20);
  fill(255,255,255);
  stroke(255,255,255);
  rect(mouseX, 400, 50,50);
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
  rainY += 10;
 if (rainY > 400){
  checkCatch(rainX);
 }
  if (rainY > 500){
    randomNumber = (int) random(500);
    rainY = 0;
     rainX = randomNumber;
  }
}