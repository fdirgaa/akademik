var canvas = document.querySelector('canvas')
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var i = canvas.getContext('2d');
i.fillStyle = '#40ff30';
i.strokeStyle = '#0000ff';
i.fillRect(10,10,30,30);
i.strokeRect(20,20,70,80);
i.fillStyle = '#000';
i.fillText("FERDI DIRGANTARA",20,50,400);

var c = canvas.getContext('2d');
c.fillStyle='#102bff';
c.fillRect(100,100,100,100);
c.fillRect(400,100,100,100);
c.fillStyle='#ff10b5';
c.fillRect(250,300,100,100);

var context = canvas.getContext('2d');
context.fillStyle = '#000';
context.strokeStyle = '#ff00ff';
context.lineWidth = 2;
context.fillRect(280,210,40,40);
context.strokeRect(270,200,60,60);
context.clearRect(20,20,20,20);
