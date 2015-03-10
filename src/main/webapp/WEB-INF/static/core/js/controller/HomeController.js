/**
 * Controller da pagina home
 */	
app.controller('HomeController', ['$scope', 'VeiculoService', function($scope, VeiculoService) {

	var self = this;
	
	VeiculoService.getVeiculosHome().then(function(resp) {

//		self.veiculos = [ { "id" : 1,
//			"placa" : 'EVB5455' },  
//		  
//		  { "id" : 2, 
//			"placa" : 'SDC3265' } ];

		self.veiculos = resp.data;
		
	}, function(error) {
		alert('Erro ao buscar veiculos: ' + error.data);
	});
	
	
}]);