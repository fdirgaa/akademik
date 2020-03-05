var canvas = document.querySelector('canvas')
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext('2d');

c.fillRect(10, 10, 100, 50);
c.translate(70, 70);
c.fillRect(10, 10, 100, 50);

c.fillRect(10,10,100,50);
c.translate(70,70);
c.fillRect(10,10,100,50);
c.translate(-70,-70);
c.fillStyle = "red";
c.fillRect(10,10,100,50);