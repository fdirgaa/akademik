var canvas = document.querySelector('canvas')
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext('2d');

// var gr = c.createRadialGradient(50,50,25,50,50,100)
// gr.addColorStop(0,'rgb(255,0,0)');
// gr.addColorStop(.5,'rgb(0,255,0)');
// gr.addColorStop(1,'rgb(0,0,255)');
// c.fillStyle = gr;
// c.fillRect(0,0,200,200);

var gr = c.createLinearGradient(0,0,100,100);
gr.addColorStop(0,'rgb(255,0,0)');
gr.addColorStop(.5,'rgb(0,255,0)');
gr.addColorStop(1,'rgb(0,0,255)');
c.fillStyle = gr;
c.fillRect(0,0,100,100);






// c.beginPath();
// c.moveTo(0,0);
// c.lineTo(0,0);
// c.lineTo(50,0);
// c.lineTo(100,50);
// c.lineTo(50,100);
// c.lineTo(0,100);
// c.lineTo(0,0);
// c.stroke();
// c.fill();
// c.closePath();

// c.fillRect(0,0,100,100);
// c.fillRect(0,100,50,100);
// c.fillRect(0,200,200,100);

