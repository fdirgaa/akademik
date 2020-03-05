var GKChart = document.getElementById("Canvasnya").getContext('2d');

var barTotalPopulationData = [22006299,	15834918,	14919501,	14797756,	14433147]; 
var lineExample1 = [120000, 15000000, 1454210, 240124, 3358452];
var lineExample2 = [5024554, 2001424, 4454201, 4565420, 5659888];

var labels = ["Tokyo",	"Mumbai",	"Mexico City",	"Shanghai",	"Sao Paulo"]; // Add labels to array

var myChart = new Chart(GKChart, {
    type: 'bar',
    data: {
        labels: labels,
        datasets: [{
            label: 'Population', 
            data: barTotalPopulationData, 
            backgroundColor: [ 
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)'
            ],
            
            borderWidth: 1 
        },
                  {
            label: 'ExampleLine1', 
            data: lineExample1, 
            backgroundColor: '#f443368c',
            borderColor: '#f443368c',
            
            borderWidth: 1, 
            type: 'line', 
            fill: false        
        },
                  {
            label: 'ExampleLine2', 
            data: lineExample2, 
            backgroundColor: '#2196f38c',
            borderColor: '#2196f38c',
            
            borderWidth: 1, 
            type: 'line', 
            fill: false        
        }]
    },
});