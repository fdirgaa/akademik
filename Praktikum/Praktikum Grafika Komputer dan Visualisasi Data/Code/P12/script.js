// Canvas 1
var GKChart = document.getElementById('Canvas1').getContext('2d');

var data = [{
        x: 5,
        y: 4
    },{
        x: 2,
        y: 14
    },{
        x: 4,
        y: 12 
    },{
        x: 2,
        y: 10
    },{
        x: 3,
        y: 4
    },{
        x: 3,
        y: 5 
    },{
        x: 3,
        y: 8 
    },{
        x: 6,
        y: 12
    }];

var myChart = new Chart(GKChart,{
    type: 'scatter',
    data: {
        datasets: [{
            label: 'Population',
            data: data,
            borderColor: '#2196f3',
            backgroundColor: '#2196f3',
        }]
    },
});


// Canvas 2
var GKChart = document.getElementById('Canvas2').getContext('2d');
var data = [{x: 5,y: 4,r: 10},{x: 2,y: 14,r: 5},{x: 4,y: 12,r: 15},{
    x: 2,
    y: 10,
    r: 7},{
    x: 3,
    y: 4,
    r: 50},{
    x: 3,
    y: 5,
    r: 12},{
    x: 3,
    y: 8,
    r: 8},{
    x: 6,
    y: 12,
    r: 5
}];

var myChart = new Chart(GKChart, {
    type: 'bubble',
    data: {
        datasets:[{
            label: 'Population',
            data: data,
            boderColor: '#2196f3',
            backgroundColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 253, 1)',
                'rgba(266, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)',
            ],
        }]
    },
});





// Canvas 3
var GKChart = document.getElementById('Canvas3').getContext('2d');

var barTotalPopulationData = [22006299, 15834918, 14919501, 14919501, 14797756, 14433147];
var lineExample1 = [120000, 15000000, 1454210, 240124, 3358452];
var lineExample2 = [5024554, 2001424, 4454201, 4565420, 5659888];
var labels = ["Tokyo", "Mumbai", "Mexico City", "Shanghai", "Sao Paulo"];

var myChart = new Chart(GKChart, {
    type: 'bar',
    data: {
        labels: labels, 
        datasets:[{
            label: 'Penduduk',
            data: barTotalPopulationData,
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)'
            ],
            borderWidth:1},{
            label: 'ExampleLine1',
            data: lineExample1,
            backgroundColor: '#f443368c',
            borderColor: '#f443368c',

            borderWidth: 1,
            type: 'line',
            fill: false
        },{
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
