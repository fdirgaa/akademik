var canvas = document.querySelector('canvas')
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext('2d');
c.setTransform(1,0,0,1,0,0);
c.scale(2,2);
c.fillStyle = "red";
c.fillRect(100,100,50,50);

c.setTransform(1,0,0,1,0,0);
var x = 100;
var y = 100;
var width = 50;
var height = 50;
c.translate(x+.5*width,y+.5*height);
c.scale(2,2);
c.fillStyle = "red";
c.fillRect(-.5*width,-.5*height, width, height);
