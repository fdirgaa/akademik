var GKChart = document.getElementById('Canvasnya').getContext('2d');
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
