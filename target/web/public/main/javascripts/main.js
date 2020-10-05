function renderChart(data, labels) {
    var ctx = document.getElementById("myChart").getContext('2d');
    var myChart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: labels,
            datasets: [{
                label: 'Faturamento Últimos meses',
                data: data,
                borderColor: 'rgba(45, 49, 66, 1)',
                backgroundColor: 'rgba(45, 49, 66, 0.4)',
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
}

let data = [13000, 14000, 13000, 15000, 18000, 19000, 22000];
let labels =  ["Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro"];
renderChart(data, labels);