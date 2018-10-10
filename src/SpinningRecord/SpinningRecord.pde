PImage pictureOfRecord;
int rotation = 40;
import ddf.minim.*;
Minim minim;
AudioPlayer song;
song = minim.loadFile("awesomeTrack.mp3", 512);
void setup(){
    size(600,600);
  pictureOfRecord= loadImage("cube.jpeg");
  pictureOfRecord.resize(height,width);
}
void draw(){

  if (mousePressed){
background(255,255,255);
song.play();
  rotateImage(pictureOfRecord, rotation);
  image(pictureOfRecord, 1 ,1);
  rotation++;
  }
  else{
    song.pause();
  }
}
  

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}